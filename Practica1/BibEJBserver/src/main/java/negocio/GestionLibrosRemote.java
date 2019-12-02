package negocio;


import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

import modelo.Autor;
import modelo.Libro;

@Remote
public interface GestionLibrosRemote {
	
	public void guardarLibro(int li_codigo, String li_titulo, Autor autor, String fecha_publicacion);
	public List<Libro> getLibros();
	public void update(int li_codigo, String li_titulo, Autor autor, String fecha_publicacion);
	public void eliminar(int codigo);

	
}
