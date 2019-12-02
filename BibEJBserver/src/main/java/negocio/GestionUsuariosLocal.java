package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Usuario;

@Local
public interface GestionUsuariosLocal {
	public void guardarUsuario(int us_codigo, String us_nombre, String us_fechaNacimiento, String us_nickname, String us_password);
	public List<Usuario> getUsuarios();
	public Usuario login(String usuario, String contrasena);
}
