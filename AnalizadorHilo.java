package ec.edu.ups.hilos;

import java.util.ArrayList;

public class AnalizadorHilo extends Thread{
	Archivo ar = new Archivo();
	int tamPal;
	int inMat;
	int finMat;
	ArrayList palabras;

	public int getTamPal() {
		return tamPal;
	}

	public int getInMat() {
		return inMat;
	}

	public int getFinMat() {
		return finMat;
	}

	public ArrayList getPalabras() {
		return palabras;
	}

	public void setTamPal(int tamPal) {
		this.tamPal = tamPal;
	}

	public void setInMat(int inMat) {
		this.inMat = inMat;
	}

	public void setFinMat(int finMat) {
		this.finMat = finMat;
	}

	public void setPalabras(ArrayList palabras) {
		this.palabras = palabras;
	}


	public AnalizadorHilo(int inMat, int finMat, int tamPal, ArrayList palabras) {
		super();
		this.tamPal = tamPal;
		this.inMat = inMat;
		this.finMat = finMat;
		this.palabras = palabras;
	}

	@Override
	public void run() {


		int canPal = palabras.size();
		//System.out.println("llega "+ canPal);
		int canDoc = this.finMat-this.inMat;
		int numDoc = this.inMat;
		String cadena = "";
		String[] words = null;
		int[][] mTD = new int[canPal][canDoc];
		int contador=0;

		for (int i = 0; i < canDoc; i++) {

			cadena = (String) ar.leerArchivo().get(numDoc);
			words = cadena.split(" ");

			for (int j = 0; j < canPal; j++) {

				for (int k = 0; k < words.length; k++) {

					if (palabras.get(j).equals(words[k])) {
						contador++;
					}
				}

				mTD[j][i]=contador;
				contador=0;
			}

			numDoc++;
		}

	/*	for (int x=0; x < mTD.length; x++) {
			System.out.print("|");
			for (int y=0; y < mTD[x].length; y++) {
				System.out.print (mTD[x][y]);
				if (y!=mTD[x].length-1) System.out.print("\t");
			}
			System.out.println("|");
		}*/

	}

}
