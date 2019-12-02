package vista;

import javax.swing.JFrame;

public class Interfaz {
	
	public JFrame frame;

	public Interfaz() {
		initialise();
	}
	
	private void initialise() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
