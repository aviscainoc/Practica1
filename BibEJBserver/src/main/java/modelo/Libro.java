package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {
	
	private static final long serialVersionUID = -20336965027624681L;
	
	@Id
	private int li_codigo;
	private String li_titulo;
	private String autor;
	private Date fecha_publicacion;
	
	
	public int getLi_codigo() {
		return li_codigo;
	}
	public void setLi_codigo(int li_codigo) {
		this.li_codigo = li_codigo;
	}
	public String getLi_titulo() {
		return li_titulo;
	}
	public void setLi_titulo(String li_titulo) {
		this.li_titulo = li_titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	
	@Override
	public String toString() {
		return "Libro [li_codigo=" + li_codigo + ", li_titulo=" + li_titulo + ", autor=" + autor
				+ ", fecha_publicacion=" + fecha_publicacion + "]";
	}
	
}
