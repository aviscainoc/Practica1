package negocio;

import java.sql.Date;
import java.util.List;

import javax.ejb.Remote;

import modelo.Libro;

public interface GestionLibrosRemote {
	
	public void guardarLibro(int li_codigo, String li_titulo, String autor, String fecha_publicacion);
	public List<Libro> getLibros();

}
