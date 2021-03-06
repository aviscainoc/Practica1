package negocio;

import java.util.List;

import javax.ejb.Remote;

import modelo.Autor;

@Remote
public interface GestionAutoresRemote {
	public void guardarUsuario(int au_codigo, String au_nombre, String au_fechaNacimiento);
	public List<Autor> getAutores();
	public List<String> getNombreAutores();
}
