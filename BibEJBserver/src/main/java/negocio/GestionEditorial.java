package negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.EditorialDAO;


import modelo.Editorial;

@Stateless
public class GestionEditorial implements GestionEditorialLocal, GestionEditorialRemote {
	
	@Inject
	private EditorialDAO dao;
	
	public void guardarEditorial(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, String ed_fundacion) {
		Editorial e = new Editorial();
		e.setEd_codigo(ed_codigo);
		e.setEd_pais(ed_pais);
		e.setEd_nombre(ed_nombre);
		e.setEd_fundador(ed_fundador);
		e.setEd_fundacion(ed_fundacion);
		dao.insert(e);
	}
	
	public List<Editorial> getEditoriales() {
		System.out.println("gestion editoriales");
		return dao.getEditoriales();
	}
	
	public void update(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, String ed_fundacion) {
		Editorial e = new Editorial();
		e.setEd_codigo(ed_codigo);
		e.setEd_pais(ed_pais);
		e.setEd_nombre(ed_nombre);
		e.setEd_fundador(ed_fundador);
		e.setEd_fundacion(ed_fundacion);
		dao.update(e);
	}
	
	public void remove(int ed_codigo) {
		dao.remove(ed_codigo);
    }

	public List<String> getNombreEditoriales(){
		return dao.getNombreEditoriales();
	}

	
}