package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import modelo.Usuario;

@Remote
public interface GestionUsuariosRemote {

	public void guardarUsuario(int us_codigo, String us_nombre, Date us_fechaNacimiento, String us_nickname, String us_password);
	public List<Usuario> getUsuarios();
	
}
