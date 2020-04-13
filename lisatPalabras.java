package ec.edu.ups.hilos;

import java.util.ArrayList;
import java.util.List;

public class lisatPalabras extends Thread{

	Archivo ar = new Archivo();
	ArrayList palabras2 = ar.getPalabras();

	int inMat;
	int finMat;

	
	
	public ArrayList getPalabras2() {
		return palabras2;
	}
	public void setPalabras2(ArrayList palabras2) {
		this.palabras2 = palabras2;
	}
	public lisatPalabras(int inMat, int finMat) {
		super();

		this.inMat = inMat;
		this.finMat = finMat;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub






		String cadena = "";
		String palabra = "";




		String[] words = null;
		for (int i = inMat; i < finMat; i++) {
			//System.out.println("Documento "+i);
			cadena = (String) ar.leerArchivo().get(i);
			words = cadena.split(" ");
			for (int j = 0; j < words.length; j++) {
				palabras2.add(words[j]);
		
				
			}

		}

	}
}

