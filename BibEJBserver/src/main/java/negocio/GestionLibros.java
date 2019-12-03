package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;
import datos.LibroDAO;
import modelo.Autor;
import modelo.Libro;

@Stateless
public class GestionLibros implements GestionLibrosRemote, GestionLibrosLocal {
	
	@Inject
	private LibroDAO dao;
	
	@Inject
	private AutorDAO daoA;
	
	public void guardarLibro(int li_codigo, String li_titulo,int codigoBusqueda, String fecha_publicacion){
		System.out.println("gestion libros server");
		Libro l = new Libro();  
		l.setLi_codigo(li_codigo);
		l.setLi_titulo(li_titulo);
		l.setAutor(daoA.read(codigoBusqueda));
		System.out.println(codigoBusqueda+""+daoA.read(codigoBusqueda));
		
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

	/*/*@Override
	public void enlazarAutor(int codigoBusqueda) {
		// TODO Auto-generated method stub
		
	}
	
	/*public void enlazarAutor(int codigoBusqueda) {
		
		daoA.read(codigoBusqueda);
		
	}*/
}



	
	
	


