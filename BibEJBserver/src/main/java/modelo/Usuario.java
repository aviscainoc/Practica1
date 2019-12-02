package modelo;

import java.util.Date;

public class Usuario {

	private int us_codigo;
	private String us_nombre;
	private Date us_fechaNacimiento;
	private String us_nickname;
	private String us_password;
	
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
	
	@Override
	public String toString() {
		return "Usuario [us_codigo=" + us_codigo + ", us_nombre=" + us_nombre + ", us_fechaNacimiento="
				+ us_fechaNacimiento + ", us_nickname=" + us_nickname + ", us_password=" + us_password + "]";
	}
}
