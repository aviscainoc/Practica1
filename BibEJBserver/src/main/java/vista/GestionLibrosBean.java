package vista;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Libro;
import negocio.GestionLibros;

@ManagedBean

public class GestionLibrosBean {
	
	

	@Inject
	private GestionLibros gl;
	
	private int codigo;
	private String titulo;
	private String autor;
	private Date fecha;
	
	private List<Libro> libros;

	public GestionLibros getGl() {
		return gl;
	}

	public void setGl(GestionLibros gl) {
		this.gl = gl;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
public String guardarLibro() {
		
		System.out.println(codigo + "  " + titulo);
		gl.guardarLibro(codigo, titulo, autor, fecha); 
		
		libros = gl.getLibros();
		
		return "listado-libros";
	}
	
	
	
		
	

	
}
