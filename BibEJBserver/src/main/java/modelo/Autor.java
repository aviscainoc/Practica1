package modelo;

import java.util.Date;

public class Autor {
	private int au_codigo;
	private String au_nombre;
	private Date au_fechaNacimiento;
	
	public int getAu_codigo() {
		return au_codigo;
	}
	public void setAu_codigo(int au_codigo) {
		this.au_codigo = au_codigo;
	}
	public String getAu_nombre() {
		return au_nombre;
	}
	public void setAu_nombre(String au_nombre) {
		this.au_nombre = au_nombre;
	}
	public Date getAu_fechaNacimiento() {
		return au_fechaNacimiento;
	}
	public void setAu_fechaNacimiento(Date au_fechaNacimiento) {
		this.au_fechaNacimiento = au_fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return "Autor [au_codigo=" + au_codigo + ", au_nombre=" + au_nombre + ", au_fechaNacimiento="
				+ au_fechaNacimiento + "]";
	}
}
