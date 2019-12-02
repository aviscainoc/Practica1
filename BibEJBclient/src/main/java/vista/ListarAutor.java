package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import modelo.Autor;
import modelo.Usuario;
import negocio.GestionAutoresRemote;

public class ListarAutor extends JFrame {

	private JPanel cp;
	private JButton btn;
	private JTextArea txtCodigo = new JTextArea();
	private JLabel lblCodigo;
	
	GestionAutoresRemote gl;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarAutor frame = new ListarAutor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ListarAutor() {
		inicializar();
	}

	private void inicializar() {
		
		try {
			this.conectarInstancias();
		} catch (Exception e) {
			System.out.println("no se ha conectado con las instancias");
			e.printStackTrace();
		}
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		cp = new JPanel();
		setContentPane(cp);
		
		lblCodigo = new  JLabel("LISTAR USUARIOS");
		
		btn = new JButton("Listar");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				listar();
			}
		});
		cp.add(lblCodigo);
		listar();
		cp.add(txtCodigo);
		cp.add(btn);		
	}
	
	public void listar() {
		txtCodigo.setText("");
		List<Autor> autores = gl.getAutores();
		for (Autor a: autores) {
			txtCodigo.append(a.toString()+"\n");
		}
	}
	
	public void conectarInstancias() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            System.out.println("Llega 1");
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");
            System.out.println("Llega2");
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
            System.out.println("llega 3");
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            System.out.println("lleha 4");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb");  
              
            final Context context = new InitialContext(jndiProperties);             
            final String lookupName = "ejb:/BibEJBserver/GestionAutores!negocio.GestionAutoresRemote";
            this.gl = (GestionAutoresRemote) context.lookup(lookupName);
            System.out.println("gl instaciado");
              
        } catch (Exception ex) {  
           System.out.println("catch instancia");
        	ex.printStackTrace();  
            throw ex;  
        }  
	}
}
