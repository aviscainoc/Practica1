package negocio;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import datos.LibroDAO;
import datos.UsuarioDAO;
import modelo.Usuario;

public class GestionUsuarios implements GestionUsuariosRemote{

	@Inject
	private UsuarioDAO dao;
	
	@Override
	public void guardarUsuario(int us_codigo, String us_nombre, Date us_fechaNacimiento, String us_nickname, String us_password) {
		Usuario u = new Usuario();
		u.setUs_codigo(us_codigo);
		u.setUs_fechaNacimiento(us_fechaNacimiento);
		u.setUs_nickname(us_nickname);
		u.setUs_nombre(us_nombre);
		u.setUs_password(us_password);
		dao.insert(u);
	}

	@Override
	public List<Usuario> getUsuarios() {
		return dao.getUsuarios();
	}

	
}
