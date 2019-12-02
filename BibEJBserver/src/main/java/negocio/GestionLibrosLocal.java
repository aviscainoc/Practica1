package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Libro;

@Local
public interface GestionLibrosLocal {
	public void guardarLibro(int li_codigo, String li_titulo, String autor, String fecha_publicacion);
	public List<Libro> getLibros();
	public void update(int li_codigo, String li_titulo, String autor, String fecha_publicacion);
	public void eliminar(int codigo);
}
