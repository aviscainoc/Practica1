package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Autor;

@Stateless
public class AutorDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Autor autor) {
		em.persist(autor);
	}
	
	public void update(Autor autor) {
		em.merge(autor);
	}
	
	public void remove(int codigo) {
		Autor autor = this.read(codigo);
		em.remove(autor);
	}
	
	public Autor read(int codigo) {
		Autor a = em.find(Autor.class, codigo);
		return a;
	}
	
	public List<Autor> getAutores() {
		String jpql = "SELECT a FROM Autor a";
		Query q = em.createQuery(jpql, Autor.class);
		
		List<Autor> autores = q.getResultList();
		return autores;
	}
	
	public List<String> getNombreAutores() {
		String jpql = "SELECT a a.au_nombre FROM Autor a";
		Query q = em.createQuery(jpql, Autor.class);
		
		List<String> autores = q.getResultList();
		return autores;
	}
}
