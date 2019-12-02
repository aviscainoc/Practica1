package modelo;

import java.util.List;

public class Biblioteca {
	private int bib_codigo;
	private String bib_nombre;
	private String bib_calle_pprincipal;
	private String bib_calle_secundaria;
	private String bib_ruc;
	private List<String> bib_telefonos;
	
	
	public int getBib_codigo() {
		return bib_codigo;
	}
	public void setBib_codigo(int bib_codigo) {
		this.bib_codigo = bib_codigo;
	}
	public String getBib_nombre() {
		return bib_nombre;
	}
	public void setBib_nombre(String bib_nombre) {
		this.bib_nombre = bib_nombre;
	}
	public String getBib_calle_pprincipal() {
		return bib_calle_pprincipal;
	}
	public void setBib_calle_pprincipal(String bib_calle_pprincipal) {
		this.bib_calle_pprincipal = bib_calle_pprincipal;
	}
	public String getBib_calle_secundaria() {
		return bib_calle_secundaria;
	}
	public void setBib_calle_secundaria(String bib_calle_secundaria) {
		this.bib_calle_secundaria = bib_calle_secundaria;
	}
	public String getBib_ruc() {
		return bib_ruc;
	}
	public void setBib_ruc(String bib_ruc) {
		this.bib_ruc = bib_ruc;
	}
	public List<String> getBib_telefonos() {
		return bib_telefonos;
	}
	public void setBib_telefonos(List<String> bib_telefonos) {
		this.bib_telefonos = bib_telefonos;
	}
	
	@Override
	public String toString() {
		return "Biblioteca [bib_codigo=" + bib_codigo + ", bib_nombre=" + bib_nombre + ", bib_calle_pprincipal="
				+ bib_calle_pprincipal + ", bib_calle_secundaria=" + bib_calle_secundaria + ", bib_ruc=" + bib_ruc
				+ ", bib_telefonos=" + bib_telefonos + "]";
	}
	
	
	
}
