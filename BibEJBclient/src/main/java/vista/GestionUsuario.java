package vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.*;

import negocio.GestionUsuariosRemote;

public class GestionUsuario extends JFrame {
	private JPanel cp;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtFechaNacimiento;
	private JTextField txtNickname;
	private JTextField txtPassword;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblFechaNacimiento;
	private JLabel lblNickname;
	private JLabel lblPassword;
	private JButton btnAdd;
	private JButton btnListar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private JButton guarda;
	private JButton lista;
	private JButton elimina;
	private JButton actualiza;
	private JPanel cp1;
	private JPanel cp2;
	private JPanel cp3;
	private JPanel cp4;
	
	
	
	GestionUsuariosRemote gl;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					GestionUsuario frame = new GestionUsuario();
					frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GestionUsuario() {
		inicializar();
	}
	
	private void inicializar() {
		try {
			this.conectarInstancias();
		}catch(Exception e) {
			System.out.println("No se ha conectado");
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,200,285,300);
		cp = new JPanel();
		setContentPane(cp);
		cp.setLayout(new FlowLayout());
		
		lblCodigo = new  JLabel("Código");
		txtCodigo = new JTextField(20);
		
		lblNombre = new JLabel("Nombre");
		txtNombre = new JTextField(20);
		
		lblFechaNacimiento = new JLabel("Fecha de Nacimiento");
		txtFechaNacimiento = new JTextField(20);
		
		lblNickname = new JLabel("Nickname");
		txtNickname = new JTextField(20);
		
		lblPassword = new JLabel("Contraseña");
		txtPassword = new JTextField(20);
		
		
		
		btnAdd = new JButton("Añadir Usuario");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("Agregando...");
				
				
				cp.removeAll();
				cp.repaint();
				//cp = new JPanel();
				cp.add(lblCodigo);
				cp.add(txtCodigo);
				cp.add(lblNombre);
				cp.add(txtNombre);
				cp.add(lblFechaNacimiento);
				cp.add(txtFechaNacimiento);
				cp.add(lblNickname);
				cp.add(txtNickname);
				cp.add(lblPassword);
				cp.add(txtPassword);
				cp.add(guarda);
				
			}
		});
		
		
		
		btnListar = new JButton("Listar Usuarios");
		btnListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listarUsuarios();
			}
		});
		
		btnEliminar = new JButton("Eliminar Usuarios");
		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				eliminarUsuarios();
			}
		});
		
		btnActualizar = new JButton("Actualizar Usuarios");
		btnActualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				actualizarUsuarios();
			}
		});
		
	
		guarda = new JButton("Guardar");
		guarda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addUsuario();
			}
		});
		
		cp.add(btnActualizar);
		cp.add(btnAdd);
		cp.add(btnEliminar);
		cp.add(btnListar);
	}

	

protected void addUsuario(){
	try {
	int codigo = Integer.parseInt(txtCodigo.getText());
	String nombre = txtNombre.getText();
	String fechaNacimiento = txtFechaNacimiento.getText();
	String nickname = txtNickname.getText();
	String password = txtPassword.getText();
	System.out.println(codigo);
	System.out.println(nombre);
	System.out.println(fechaNacimiento);
	System.out.println(nickname);
	System.out.println(password);
	gl.guardarUsuario(codigo, nombre, fechaNacimiento, nickname, password);
	JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Error");
		e.printStackTrace(); 
	}
}

public void conectarInstancias() throws Exception {
	try {
		final Hashtable <String, Comparable> jndiProperties = new Hashtable<String, Comparable>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put("jboss.naming.client.ejb.context", true);
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
        System.out.println("lleha 4");
        jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb");  
        jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb");  
          
        final Context context = new InitialContext(jndiProperties);             
        final String lookupName = "ejb:/BibEJBserver/GestionUsuarios!negocio.GestionUsuariosRemote";
        this.gl = (GestionUsuariosRemote) context.lookup(lookupName);
        System.out.println("gl instaciado");
        System.out.println("Agregado Correctamente");
          
    } catch (Exception ex) {  
       System.out.println("catch instancia");
    	ex.printStackTrace();  
        throw ex;  
	}
}
}
