package vista;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Editorial;
import negocio.GestionEditorialLocal;

@ManagedBean
public class GestioneEditorialesBean {
	@Inject
	private GestionEditorialLocal gl;
	
	private int ed_codigo;
	private String ed_pais;
	private String ed_nombre;
	private String ed_fundador;
	private Date ed_fundacion;
	
	private List<Editorial> editoriales;

	public GestionEditorialLocal getGl() {
		return gl;
	}

	public void setGl(GestionEditorialLocal gl) {
		this.gl = gl;
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
	
	
	public Date getEd_fundacion() {
		return ed_fundacion;
	}

	public void setEd_fundacion(Date ed_fundacion) {
		this.ed_fundacion = ed_fundacion;
	}

	
	
	public String guardarEditorial() {
		System.out.println(ed_codigo + " "+ ed_pais + " " + ed_nombre + " "+ ed_fundador + " " + ed_fundacion + " " );
		gl.guardarEditorial(ed_codigo, ed_pais, ed_nombre, ed_fundador, ed_fundacion);
		editoriales = gl.getEditoriales();
		return "Autor registrado";
	}
	
	public List<Editorial> recuperarEditoriales() {
		editoriales = gl.getEditoriales();
		return editoriales;
	}
	
}













