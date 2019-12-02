package vista;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Libro;
import negocio.GestionLibros;
import negocio.GestionLibrosLocal;

@ManagedBean
public class GestionLibrosBean {
	
	

	@Inject
	private GestionLibrosLocal gl;
	
	private int li_codigo;
	private String li_titulo;
	private String autor;
	private String fecha;
	
	private List<Libro> libros;

	

	

	public int getCodigo() {
		return li_codigo;
	}

	public void setCodigo(int codigo) {
		this.li_codigo = codigo;
	}

	public String getTitulo() {
		return li_titulo;
	}

	public void setTitulo(String titulo) {
		this.li_titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
public String guardarLibro() {
		
		System.out.println(li_codigo + "  " + li_titulo);
		gl.guardarLibro(li_codigo, li_titulo, autor, fecha); 
		
		libros = gl.getLibros();
		
		return "listado-libros";
	}
	
	
	
		
	

	
}
