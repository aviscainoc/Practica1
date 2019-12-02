package modelo;

public class Bibliotecario {

	private int ad_codigo;
	private String ad_nombre;
	private String nickname;
	private String password;
	
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Bibliotecario [ad_codigo=" + ad_codigo + ", ad_nombre=" + ad_nombre + ", nickname=" + nickname
				+ ", password=" + password + "]";
	}
}
