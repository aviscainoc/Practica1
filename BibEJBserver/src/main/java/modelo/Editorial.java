package modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Editorial {

	@Id
	private int ed_codigo;
	private String ed_pais;
	private String ed_nombre;
	private String ed_fundador;
	private String ed_fundacion;
	
	public int getEd_codigo() {
		return ed_codigo;
	}
	public void setEd_codigo(int ed_codigo) {
		this.ed_codigo = ed_codigo;
	}
	public String getEd_pais() {
		return ed_pais;
	}
	public void setEd_pais(String ed_pais) {
		this.ed_pais = ed_pais;
	}
	public String getEd_nombre() {
		return ed_nombre;
	}
	public void setEd_nombre(String ed_nombre) {
		this.ed_nombre = ed_nombre;
	}
	public String getEd_fundador() {
		return ed_fundador;
	}
	public void setEd_fundador(String ed_fundador) {
		this.ed_fundador = ed_fundador;
	}
	public String getEd_fundacion() {
		return ed_fundacion;
	}
	public void setEd_fundacion(String ed_fundacion2) {
		this.ed_fundacion = ed_fundacion2;
	}
	@Override
	public String toString() {
		return "Editorial [ed_codigo=" + ed_codigo + ", ed_pais=" + ed_pais + ", ed_nombre=" + ed_nombre
				+ ", ed_fundador=" + ed_fundador + ", ed_fundacion=" + ed_fundacion + "]";
	}
	
	
}
