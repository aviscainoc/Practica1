package vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.GestionAutoresRemote;
import negocio.GestionLibrosRemote;

public class AddAutor extends JFrame {
	
	private JPanel cp;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtFecha;
	
	GestionAutoresRemote gl;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAutor frame = new AddAutor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AddAutor() {
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
		txtId = new JTextField(10);
		JLabel lblNombre = new JLabel("Nombre");
		txtNombre = new JTextField(10);
		JLabel lblFecha = new JLabel("Fecha de Nacimiento");
		txtFecha = new JTextField(10);
		
		JButton btnAdd = new JButton("Añadir autor");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addAutor();
			}
		});
		
		cp.add(lblId);
		cp.add(txtId);
		cp.add(lblNombre);
		cp.add(txtNombre);
		cp.add(lblFecha);
		cp.add(txtFecha);
		cp.add(btnAdd);
	}
	
	protected void addAutor() {
		int id = Integer.parseInt(txtId.getText());
		String titulo = txtNombre.getText();
		String autor = txtFecha.getText();
		System.out.println(id);
		System.out.println(titulo);
		System.out.println(autor);
		gl.guardarAutor(id, titulo, autor);
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
