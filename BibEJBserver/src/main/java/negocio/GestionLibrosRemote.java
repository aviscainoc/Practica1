package negocio;

<<<<<<< HEAD

=======
>>>>>>> 2e77fc6dda98481ba786e64662eea604a35283c5
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;
<<<<<<< HEAD

=======
>>>>>>> 2e77fc6dda98481ba786e64662eea604a35283c5
import modelo.Libro;

@Remote
public interface GestionLibrosRemote {
	
	public void guardarLibro(int li_codigo, String li_titulo, String autor, Date fecha_publicacion);
	public List<Libro> getLibros();
	
}
