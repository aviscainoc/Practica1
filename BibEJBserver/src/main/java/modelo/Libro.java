package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Libro implements Serializable {
	
	//private static final long serialVersionUID = -20336965027624681L;
	
	@Id
	@Column(name="li_codigo")
	private int li_codigo;
	@Column(name="li_titulo")
	private String li_titulo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="li_codigo", insertable = false, updatable = false)
	private Autor autor;
	//@Column(name="li_autor")
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Editorial editorial;
	
	
	@Column(name="li_fecha")
	private String fecha_publicacion;
	
	
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
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [li_codigo=" + li_codigo + ", li_titulo=" + li_titulo + ", autor=" + autor + ", editorial="
				//+ editorial 
				+ ", fecha_publicacion=" + fecha_publicacion + "]";
	}
	
	
	
	
	 
}
