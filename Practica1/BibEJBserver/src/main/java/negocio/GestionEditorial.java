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
	
	public void guardarEditorial(int ed_codigo, String ed_pais, String ed_nombre, String ed_fundador, Date ed_fundacion) {
		Editorial e = new Editorial();
		e.setEd_codigo(ed_codigo);
		e.setEd_pais(ed_pais);
		e.setEd_nombre(ed_nombre);
		e.setEd_fundador(ed_fundador);
		e.setEd_fundacion(ed_fundacion);
		dao.insert(e);
	}
	

	public List<Editorial> getEditoriales() {
		
		return dao.getEditoriales();
	}

	
}
