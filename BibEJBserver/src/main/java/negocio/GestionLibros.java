package negocio;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import datos.LibroDAO;
import modelo.Autor;
import modelo.Libro;

public class GestionLibros implements GestionLibrosRemote {
	
	@Inject
	private LibroDAO dao;
	
	@Override
	public void guardarLibro(int li_codigo, String li_titulo, String autor, Date fecha_publicacion){
		Libro l = new Libro();  
		l.setLi_codigo(li_codigo);
		l.setLi_titulo(li_titulo);
		l.setAutor(autor);
		l.setFecha_publicacion(fecha_publicacion);
		dao.insert(l);
	}

	@Override
	public List<Libro> getLibros(){
		return dao.getLibros();
	}
	/*
	public List<Libro> getLibrosPorNombre(String filtro){
		
		return dao.getLibrosXNombre(filtro);
	}*/
}
