package vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Libro;
import negocio.GestionLibrosRemote;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class AddLibro extends JFrame {
	
	private JPanel cp;
	private JTextField txtId;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtPublicacion;
	
	GestionLibrosRemote gl;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLibro frame = new AddLibro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AddLibro() {
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
		cp.setLayout(new FlowLayout());
		
		JLabel lblId = new JLabel("Código");
		txtId = new JTextField(20);
		JLabel lblTitulo = new JLabel("Título");
		txtTitulo = new JTextField(20);
		JLabel lblAutor = new JLabel("Autor");
		txtAutor = new JTextField(20);
		JLabel lblPublicacion = new JLabel("Fecha de Publicación");
		txtPublicacion = new JTextField(20);
		
		JButton btnAdd = new JButton("Añadir libro");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addLibro();
			}
		});
		
		cp.add(lblId);
		cp.add(txtId);
		cp.add(lblTitulo);
		cp.add(txtTitulo);
		cp.add(lblAutor);
		cp.add(txtAutor);
		cp.add(lblPublicacion);
		cp.add(txtPublicacion);
		cp.add(btnAdd);
	}
	
	protected void addLibro() {
		int id = Integer.parseInt(txtId.getText());
		String titulo = txtTitulo.getText();
		int autor = Integer.parseInt(txtAutor.getText());
		String publicacion = txtPublicacion.getText();
		System.out.println(id);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(publicacion);
		gl.guardarLibro(id, titulo, autor, publicacion);
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
            final String lookupName = "ejb:/BibEJBserver/GestionLibros!negocio.GestionLibrosRemote";
            this.gl = (GestionLibrosRemote) context.lookup(lookupName);
            System.out.println("gl instaciado");
              
        } catch (Exception ex) {  
           System.out.println("catch instancia");
        	ex.printStackTrace();  
            throw ex;  
        }  
	}
}





