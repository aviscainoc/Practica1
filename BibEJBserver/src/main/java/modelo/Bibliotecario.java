package modelo;

public class Bibliotecario {

	private int ad_codigo;
	private String ad_nombre;
	private String ad_nickname;
	private String ad_password;
	
	public int getAd_codigo() {
		return ad_codigo;
	}
	public void setAd_codigo(int ad_codigo) {
		this.ad_codigo = ad_codigo;
	}
	public String getAd_nombre() {
		return ad_nombre;
	}
	public void setAd_nombre(String ad_nombre) {
		this.ad_nombre = ad_nombre;
	}
	public String getAd_nickname() {
		return ad_nickname;
	}
	public void setAd_nickname(String ad_nickname) {
		this.ad_nickname = ad_nickname;
	}
	public String getAd_password() {
		return ad_password;
	}
	public void setAd_password(String ad_password) {
		this.ad_password = ad_password;
	}
	
	@Override
	public String toString() {
		return "Bibliotecario [ad_codigo=" + ad_codigo + ", ad_nombre=" + ad_nombre + ", ad_nickname=" + ad_nickname
				+ ", ad_password=" + ad_password + "]";
	}	
}
