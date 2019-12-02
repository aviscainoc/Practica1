package modelo;

public class Stock {

	private int st_codigo;
	private int st_stock;
	
	public int getSt_codigo() {
		return st_codigo;
	}
	public void setSt_codigo(int st_codigo) {
		this.st_codigo = st_codigo;
	}
	public int getSt_stock() {
		return st_stock;
	}
	public void setSt_stock(int st_stock) {
		this.st_stock = st_stock;
	}
	
	@Override
	public String toString() {
		return "Stock [st_codigo=" + st_codigo + ", st_stock=" + st_stock + "]";
	}
}
