package modelo;

import java.util.Date;

public class Prestamo {

	private int pr_codigo;
	private Date pr_fecha_prestamo;
	private Date pr_fecha_limite;
	
	public int getPr_codigo() {
		return pr_codigo;
	}
	public void setPr_codigo(int pr_codigo) {
		this.pr_codigo = pr_codigo;
	}
	public Date getPr_fecha_prestamo() {
		return pr_fecha_prestamo;
	}
	public void setPr_fecha_prestamo(Date pr_fecha_prestamo) {
		this.pr_fecha_prestamo = pr_fecha_prestamo;
	}
	public Date getPr_fecha_limite() {
		return pr_fecha_limite;
	}
	public void setPr_fecha_limite(Date pr_fecha_limite) {
		this.pr_fecha_limite = pr_fecha_limite;
	}
	
	@Override
	public String toString() {
		return "Prestamo [pr_codigo=" + pr_codigo + ", pr_fecha_prestamo=" + pr_fecha_prestamo + ", pr_fecha_limite="
				+ pr_fecha_limite + "]";
	}
}
