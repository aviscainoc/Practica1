package modelo;

import java.util.Date;

public class Usuario {

	private int en_codigo;
	private Date en_fecha_entrega;
	
	public int getEn_codigo() {
		return en_codigo;
	}
	public void setEn_codigo(int en_codigo) {
		this.en_codigo = en_codigo;
	}
	public Date getEn_fecha_entrega() {
		return en_fecha_entrega;
	}
	public void setEn_fecha_entrega(Date en_fecha_entrega) {
		this.en_fecha_entrega = en_fecha_entrega;
	}
	
	@Override
	public String toString() {
		return "Usuario [en_codigo=" + en_codigo + ", en_fecha_entrega=" + en_fecha_entrega + "]";
	}
}
