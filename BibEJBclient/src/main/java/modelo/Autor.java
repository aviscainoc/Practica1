package modelo;

import java.io.Serializable;
import java.util.Date;


public class Autor implements Serializable {

	private int au_codigo;
	private String au_nombre;
	private String au_fechaNacimiento;
	
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
	public String getAu_fechaNacimiento() {
		return au_fechaNacimiento;
	}
	public void setAu_fechaNacimiento(String au_fechaNacimiento) {
		this.au_fechaNacimiento = au_fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return  "Autor [código: " + au_codigo + "nombre: " + au_nombre + "fechaNacimiento: " + au_fechaNacimiento + "]";
	}
}
