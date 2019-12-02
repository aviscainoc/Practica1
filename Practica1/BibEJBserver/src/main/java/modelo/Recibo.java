package modelo;

import java.util.Date;

public class Recibo {

	private int re_codigo;
	private Date re_fecha_entrega;
	private double re_multa;
	
	public int getRe_codigo() {
		return re_codigo;
	}
	public void setRe_codigo(int re_codigo) {
		this.re_codigo = re_codigo;
	}
	public Date getRe_fecha_entrega() {
		return re_fecha_entrega;
	}
	public void setRe_fecha_entrega(Date re_fecha_entrega) {
		this.re_fecha_entrega = re_fecha_entrega;
	}
	public double getRe_multa() {
		return re_multa;
	}
	public void setRe_multa(double re_multa) {
		this.re_multa = re_multa;
	}
	
	@Override
	public String toString() {
		return "Recibo [re_codigo=" + re_codigo + ", re_fecha_entrega=" + re_fecha_entrega + ", re_multa=" + re_multa
				+ "]";
	}
	
}
