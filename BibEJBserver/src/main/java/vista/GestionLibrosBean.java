package vista;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Autor;
import modelo.Libro;
import negocio.GestionLibros;
import negocio.GestionLibrosLocal;

@ManagedBean
public class GestionLibrosBean {
	
	

	@Inject
	//private GestionLibros gl = new GestionLibros();
	private GestionLibrosLocal gl;
	
	private int li_codigo;
	private String li_titulo;
	private Autor autor;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
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
		
		System.out.println(li_codigo + "  " + li_titulo + " " + autor + " " +fecha);
		gl.guardarLibro(li_codigo, li_titulo, autor, fecha); 
		
		libros = gl.getLibros();
		System.out.println(libros);
		
		return "listar-libros";
	}
	
	public List<Libro> recuperarLibros() {
		libros = gl.getLibros();
		return libros;
	}
	
	public void update()
	{
		gl.update(li_codigo, li_titulo, autor, fecha);
	}
	
	public void eliminar() {
		gl.eliminar(li_codigo);
	}
}
