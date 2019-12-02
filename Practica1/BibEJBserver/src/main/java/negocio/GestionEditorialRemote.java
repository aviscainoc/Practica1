package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import modelo.Autor;
import modelo.Editorial;

@Remote
public interface GestionEditorialRemote {
	public void guardarEditorial(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, Date ed_fundacion);
	public List<Editorial> getEditoriales();
}
