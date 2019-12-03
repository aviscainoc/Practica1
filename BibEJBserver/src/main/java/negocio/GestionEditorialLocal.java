package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import modelo.Autor;
import modelo.Editorial;

@Local
public interface GestionEditorialLocal {
	public void guardarEditorial(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, Date ed_fundacion);
	public List<Editorial> getEditoriales();
	
	public void eliminar(int ed_codigo);
}
