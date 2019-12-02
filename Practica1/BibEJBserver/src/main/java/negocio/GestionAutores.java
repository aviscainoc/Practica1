package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;

import modelo.Autor;

@Stateless
public class GestionAutores implements GestionAutoresLocal, GestionAutoresRemote {
	
	@Inject
	private AutorDAO dao;
	
	public void guardarUsuario(int au_codigo, String au_nombre, String au_fechaNacimiento) {
		Autor a = new Autor();
		a.setAu_codigo(au_codigo);
		a.setAu_nombre(au_nombre);
		a.setAu_fechaNacimiento(au_fechaNacimiento);
		dao.insert(a);
	}
	
	public List<Autor> getAutores() {
		return dao.getAutores();
	}
	
	public List<String> getNombreAutores(){
		return dao.getNombreAutores();
	}
}
