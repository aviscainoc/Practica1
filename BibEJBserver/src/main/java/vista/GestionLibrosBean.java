package vista;

import javax.inject.Inject;

import modelo.Libro;
import negocio.GestionLibros;

public class GestionLibrosBean {
	
	private Libro libro = new Libro();

	@Inject
	private GestionLibros gl;
}
