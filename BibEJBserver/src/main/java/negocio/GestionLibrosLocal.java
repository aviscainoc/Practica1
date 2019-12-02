package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import modelo.Libro;

@Local
public interface GestionLibrosLocal {
	public void guardarLibro(int li_codigo, String li_titulo, String autor, String fecha_publicacion);
	public List<Libro> getLibros();
}
