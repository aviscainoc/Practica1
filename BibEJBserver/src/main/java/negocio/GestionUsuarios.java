package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.LibroDAO;
import datos.UsuarioDAO;
import modelo.Libro;
import modelo.Usuario;

@Stateless
public class GestionUsuarios implements GestionUsuariosRemote, GestionUsuariosLocal{

	@Inject
	private UsuarioDAO dao;
	
	public void guardarUsuario(int us_codigo, String us_nombre, String us_fechaNacimiento, String us_nickname, String us_password) {
		Usuario u = new Usuario();
		u.setUs_codigo(us_codigo);
		u.setUs_fechaNacimiento(us_fechaNacimiento);
		u.setUs_nickname(us_nickname);
		u.setUs_nombre(us_nombre);
		u.setUs_password(us_password);
		dao.insert(u);
	}

	public List<Usuario> getUsuarios() {
		return dao.getUsuarios();
	}
	
	public void update(int us_codigo, String us_nombre, String us_fechaNacimiento, String us_nickname, String us_password) {
		Usuario u = new Usuario();
		u.setUs_codigo(us_codigo);
		u.setUs_fechaNacimiento(us_fechaNacimiento);
		u.setUs_nickname(us_nickname);
		u.setUs_nombre(us_nombre);
		u.setUs_password(us_password);
		dao.update(u);
	}

	
}
