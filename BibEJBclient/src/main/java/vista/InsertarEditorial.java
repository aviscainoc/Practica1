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

import negocio.GestionEditorialRemote;
import negocio.GestionLibrosRemote;

public class InsertarEditorial extends JFrame {
	
	private JPanel cp;
	private JTextField txtId;
	private JTextField txtPais;
	private JTextField txtNombre;
	private JTextField txtFundador;
	private JTextField txtFundacion;
	
	GestionEditorialRemote ge;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertarEditorial frame = new InsertarEditorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public InsertarEditorial() {
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
		
		JLabel lblPais = new JLabel("Pais");
		txtPais = new JTextField(20);
		
		JLabel lblNombre = new JLabel("Nombre");
		txtNombre = new JTextField(20);
		
		JLabel lblFundador = new JLabel("Fundador");
		txtFundador = new JTextField(20);
		
		JLabel lblFundacion = new JLabel("Fundacion");
		txtFundacion = new JTextField(20);
		
		JButton btnAdd = new JButton("Añadir libro");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				InsertarEditorial();
			}
		});
		
		cp.add(lblId);
		cp.add(txtId);
		cp.add(lblPais);
		cp.add(txtPais);
		cp.add(lblNombre);
		cp.add(txtNombre);
		cp.add(lblFundador);
		cp.add(txtFundador);
		cp.add(lblFundacion);
		cp.add(txtFundacion);
		cp.add(btnAdd);
		
		
	}



protected void InsertarEditorial() {
	int id = Integer.parseInt(txtId.getText());
	String pais = txtPais.getText();
	String nombre = txtNombre.getText();
	String fundador = txtFundador.getText();
	String fundacion = txtFundacion.getText();
	System.out.println(id);
	System.out.println(pais);
	System.out.println(nombre);
	System.out.println(fundador);
	System.out.println(fundacion);
	ge.guardarEditorial(id, pais, nombre, fundador, fundacion);
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
        this.ge = (GestionEditorialRemote) context.lookup(lookupName);
        System.out.println("ge instaciado");
          
    } catch (Exception ex) {  
       System.out.println("catch instancia");
    	ex.printStackTrace();  
        throw ex;  
    }  
}
	

}
