package datos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Libro;
import modelo.Usuario;

public class UsuarioDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Usuario usuario) {
		em.persist(usuario);
	}
	
	public void update(Usuario usuario) {
		em.merge(usuario);
	}
	
	public void remove(int codigo) {
		Usuario usuario = this.read(codigo);
		em.remove(usuario);
	}
	
	public Usuario read(int codigo) {
		Usuario u = em.find(Usuario.class, codigo);
		return u;
	}
	
	public List<Usuario> getUsuarios(){
		String jpql = "SELECT u FROM Usuario u";
		Query q = em.createQuery(jpql, Usuario.class);
		
		List<Usuario> usuarios = q.getResultList();
		
		return usuarios;
	}
	
}
