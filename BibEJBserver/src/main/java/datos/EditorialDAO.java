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
		System.out.println("editorial guardada");
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
	
	public List<Editorial> getEditoriales(){
		String jpql = "SELECT l FROM Libro l";
		Query q = em.createQuery(jpql, Editorial.class);
		
		List<Editorial> libros = q.getResultList();
		return libros;
	}
	
}

