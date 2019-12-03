package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Editorial;



@Stateless
public class EditorialDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Editorial editorial) {
		em.persist(editorial);
	}
	
	public void update(Editorial editorial) {
		em.merge(editorial);
	}
	
	public void remove(int codigo) {
		Editorial editorial = this.read(codigo);
		em.remove(editorial);
	}
	
	public Editorial read(int codigo) {
		Editorial e = em.find(Editorial.class, codigo);
		return e;
	}
	
	public List<Editorial> getEditoriales() {
		System.out.println("get editoriales");
		String jpql = "SELECT a FROM Editorial a";
		Query q = em.createQuery(jpql, Editorial.class);
		
		List<Editorial> editoriales = q.getResultList();
		return editoriales;
	}
	
	public List<String> getNombreEditoriales() {
		String jpql = "SELECT a a.ed_nombre FROM Editorial a";
		Query q = em.createQuery(jpql, Editorial.class);
		
		List<String> editoriales = q.getResultList();
		return editoriales;
	}
}
