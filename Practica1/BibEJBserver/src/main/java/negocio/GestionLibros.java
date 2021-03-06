package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.LibroDAO;
import modelo.Autor;
import modelo.Libro;

@Stateless
public class GestionLibros implements GestionLibrosRemote, GestionLibrosLocal {
	
	@Inject
	private LibroDAO dao;
	
	public void guardarLibro(int li_codigo, String li_titulo, Autor autor, String fecha_publicacion){
		System.out.println("gestion libros server");
		Libro l = new Libro();  
		l.setLi_codigo(li_codigo);
		l.setLi_titulo(li_titulo);
		l.setAutor(autor);
		l.setFecha_publicacion(fecha_publicacion);
		dao.insert(l);
		l.toString();
	}
	
	public List<Libro> getLibros(){
		return dao.getLibros();
	}
	
	public void update(int li_codigo, String li_titulo, Autor autor, String fecha_publicacion) {
		Libro l = new Libro();
		l.setLi_codigo(li_codigo);
		l.setLi_titulo(li_titulo);
		l.setAutor(autor);
		l.setFecha_publicacion(fecha_publicacion);
		
		dao.update(l);
	}
	
	public void eliminar(int codigo) {
		dao.remove(codigo);
	}
}



	
	
	


