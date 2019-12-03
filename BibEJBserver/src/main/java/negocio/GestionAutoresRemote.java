package negocio;

import java.util.List;

import javax.ejb.Remote;

import modelo.Autor;


@Remote
public interface GestionAutoresRemote {
	public void guardarAutor(int au_codigo, String au_nombre, String au_fechaNacimiento);
	public List<Autor> getAutores();
	public void update(int au_codigo, String au_nombre, String au_fechaNacimiento);
	public void remove(int au_codigo);
	public List<String> getNombreAutores();
}
