package vista;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Usuario;
import negocio.GestionUsuarios;

@ManagedBean
public class GestionUsuariosBean {
	
	@Inject
	private GestionUsuarios gl;

	private int us_codigo;
	private String us_nombre;
	private Date us_fechaNacimiento;
	private String us_nickname;
	private String us_password;
	
	private List<Usuario> usuarios;

	public GestionUsuarios getGl() {
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

	public Date getUs_fechaNacimiento() {
		return us_fechaNacimiento;
	}

	public void setUs_fechaNacimiento(Date us_fechaNacimiento) {
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
	
	public String guardarLibro() {
		System.out.println(us_codigo + " " + us_nombre + " ");
		gl.guardarUsuario(us_codigo, us_nombre, us_fechaNacimiento, us_nickname, us_password);
		usuarios = gl.getUsuarios();
		return "Guardado Correctamente";
	}
	
}
