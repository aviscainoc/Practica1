package vista;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Libro;
import modelo.Usuario;
import negocio.GestionUsuarios;
import negocio.GestionUsuariosLocal;

@ManagedBean
public class GestionUsuariosBean {
	
	@Inject
	//private GestionUsuarios gl = new GestionUsuarios();
	private GestionUsuariosLocal gl;

	private int us_codigo;
	private String us_nombre;
	private String us_fechaNacimiento;
	private String us_nickname;
	private String us_password;
	
	private List<Usuario> usuarios;

	public GestionUsuariosLocal getGl() {
		return gl;
	}

	public void setGl(GestionUsuarios gl) {
		this.gl = gl;
	}

	public int getUs_codigo() {
		return us_codigo;
	}

	public void setUs_codigo(int us_codigo) {
		this.us_codigo = us_codigo;
	}

	public String getUs_nombre() {
		return us_nombre;
	}

	public void setUs_nombre(String us_nombre) {
		this.us_nombre = us_nombre;
	}

	public String getUs_fechaNacimiento() {
		return us_fechaNacimiento;
	}

	public void setUs_fechaNacimiento(String us_fechaNacimiento) {
		this.us_fechaNacimiento = us_fechaNacimiento;
	}

	public String getUs_nickname() {
		return us_nickname;
	}

	public void setUs_nickname(String us_nickname) {
		this.us_nickname = us_nickname;
	}

	public String getUs_password() {
		return us_password;
	}

	public void setUs_password(String us_password) {
		this.us_password = us_password;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public String guardarUsuario() {
		System.out.println(us_codigo + " " + us_nombre + " ");
		gl.guardarUsuario(us_codigo, us_nombre, us_fechaNacimiento, us_nickname, us_password);
		usuarios = gl.getUsuarios();
		return "Registrado";
	}
	
	public List<Usuario> recuperarUsuarios() {
		usuarios = gl.getUsuarios();
		return usuarios;
	}
	
}
