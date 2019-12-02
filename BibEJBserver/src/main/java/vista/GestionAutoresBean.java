package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Autor;
import negocio.GestionAutoresLocal;

@ManagedBean
public class GestionAutoresBean {
	@Inject
	private GestionAutoresLocal gl;
	
	private int au_codigo;
	private String au_nombre;
	private String au_fechaNacimiento;
	
	private List<Autor> autores;

	public GestionAutoresLocal getGl() {
		return gl;
	}

	public void setGl(GestionAutoresLocal gl) {
		this.gl = gl;
	}

	public int getAu_codigo() {
		return au_codigo;
	}

	public void setAu_codigo(int au_codigo) {
		this.au_codigo = au_codigo;
	}

	public String getAu_nombre() {
		return au_nombre;
	}

	public void setAu_nombre(String au_nombre) {
		this.au_nombre = au_nombre;
	}

	public String getAu_fechaNacimiento() {
		return au_fechaNacimiento;
	}

	public void setAu_fechaNacimiento(String au_fechaNacimiento) {
		this.au_fechaNacimiento = au_fechaNacimiento;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public String guardarAutor() {
		System.out.println(au_codigo + " " + au_nombre + " ");
		gl.guardarUsuario(au_codigo, au_nombre, au_fechaNacimiento);
		autores = gl.getAutores();
		return "Autor registrado";
	}
	
	public List<Autor> recuperarAutores() {
		autores = gl.getAutores();
		return autores;
	}
	
	public void eliminarAutores() {
		gl.remove(au_codigo);
	}
	
	public void actualizarAutor() {
		gl.update(au_codigo, au_nombre, au_fechaNacimiento);
	}

	public List<String> getNombreAutores(){
		List<String> autores=gl.getNombreAutores();
		return autores;
	}
	
}
