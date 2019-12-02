package vista;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddLibro extends JFrame {
	
	public JFrame frame;

	public AddLibro() {
		initialise();
	}
	
	private void initialise() {
		frame = new JFrame("Añadir un nuevo libro");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JLabel lbl_id = new JLabel("Código");
		JTextField txt_id = new JTextField(20);
		JLabel lbl_titulo = new JLabel("Título");
		JTextField txt_titulo = new JTextField(20);
		JLabel lbl_autor = new JLabel("Autor");
		JTextField txt_autor = new JTextField(20);
		JLabel lbl_editorial = new JLabel("Editorial");
		JTextField txt_editorial = new JTextField(20);
		
		JButton btn_add = new JButton("Añadir libro");
		
		cp.add(lbl_id);
		cp.add(txt_id);
		cp.add(lbl_titulo);
		cp.add(txt_titulo);
		cp.add(lbl_autor);
		cp.add(txt_autor);
		cp.add(lbl_editorial);
		cp.add(txt_editorial);
		cp.add(btn_add);
		
		
	}
}
