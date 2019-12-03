package negocio;

import java.sql.Date;
import java.util.List;

import javax.ejb.Remote;

import modelo.Editorial;

public interface GestionEditorialRemote {
	
	public void guardarEditorial(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, String fundacion);
	
	public List<Editorial> getEditoriales();

}
