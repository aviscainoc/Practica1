package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Editorial;



@Local
public interface GestionEditorialLocal {
	public void guardarEditorial(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, String ed_fundacion);
	public List<Editorial> getEditoriales();
	public void update(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, String ed_fundacion);
	public void remove(int ed_codigo);
	public List<String> getNombreEditoriales();
}