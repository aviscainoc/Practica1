package negocio;


import java.util.Date;
import java.util.List;
import javax.ejb.Remote;
import modelo.Libro;

@Remote
public interface GestionLibrosRemote {
	
	public void guardarLibro(int li_codigo, String li_titulo, String autor, Date fecha_publicacion);
	public List<Libro> getLibros();
	
}
