package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Autor;
import modelo.Editorial;
import negocio.GestionAutoresLocal;
import negocio.GestionEditorialLocal;

@ManagedBean
public class GestioneEditorialesBean {
	@Inject
	private GestionEditorialLocal ge;
	
	private int ed_codigo;
	private String ed_pais;
	private String ed_nombre;
	private String ed_fundador;
	private String ed_fundacion;
	
	private List<Editorial> editoriales;

	public GestionEditorialLocal getGe() {
		return ge;
	}

	public void setGe(GestionEditorialLocal ge) {
		this.ge = ge;
	}

	public int getEd_codigo() {
		return ed_codigo;
	}

	public void setEd_codigo(int ed_codigo) {
		this.ed_codigo = ed_codigo;
	}

	public String getEd_pais() {
		return ed_pais;
	}

	public void setEd_pais(String ed_pais) {
		this.ed_pais = ed_pais;
	}
	
	public String getEd_nombre() {
		return ed_nombre;
	}

	public void setEd_nombre(String ed_nombre) {
		this.ed_nombre = ed_nombre;
	}

	public String getEd_fundador() {
		return ed_fundador;
	}

	public void setEd_fundador(String ed_fundador) {
		this.ed_fundador = ed_fundador;
	}

	public String getEd_fundacion() {
		return ed_fundacion;
	}

	public void setEd_fundacion(String ed_fundacion) {
		this.ed_fundacion = ed_fundacion;
	}
	
	public List<Editorial> getEditoriales() {
		return editoriales;
	}

	public void setEditoriales(List<Editorial> editoriales) {
		this.editoriales = editoriales;
	}
	
	public String guardarEditorial() {
		System.out.println(ed_codigo + " " + ed_pais+ " " + ed_nombre + " " + ed_fundador + " " + ed_fundacion);
		ge.guardarEditorial(ed_codigo, ed_pais, ed_nombre, ed_fundador, ed_fundacion);
		editoriales = ge.getEditoriales();
		return "Editorial registrada";
	}
	
	public List<Editorial> recuperarEditoriales() {
		editoriales = ge.getEditoriales();
		return editoriales;
	}
	
	public void eliminarEditoriales() {
		ge.remove(ed_codigo);
	}
	
	public void actualizarEditorial() {
		ge.update(ed_codigo, ed_pais, ed_nombre, ed_fundador, ed_fundacion);
	}

	public List<String> getNombreEditoriales(){
		List<String> editoriales=ge.getNombreEditoriales();
		return editoriales;
	}
	
}














