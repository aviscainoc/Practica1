package ec.edu.ups.hilos;

import java.util.ArrayList;

public class eliminarRepetidas extends Thread {

	Archivo ar = new Archivo();
	ArrayList palabras3 ;


	int inMat;
	int finMat;

	public ArrayList getPalabras3() {
		return palabras3;
	}

	public int getInMat() {
		return inMat;
	}

	public int getFinMat() {
		return finMat;
	}

	public void setPalabras3(ArrayList palabras3) {
		this.palabras3 = palabras3;
	}

	public void setInMat(int inMat) {
		this.inMat = inMat;
	}

	public void setFinMat(int finMat) {
		this.finMat = finMat;
	}

	public eliminarRepetidas(ArrayList palabras3, int inMat, int finMat) {
		super();
		this.palabras3 = palabras3;
		this.inMat = inMat;
		this.finMat = finMat;
	}

	@Override
	public void run() {

		String cadena = "";
		String palabra = "";
		//System.out.println("que pedo"+inMat+" "+finMat);
		//System.out.println(palabras3.size());
		for(int i=inMat;i<finMat;i++)
		{
			//System.out.println(palabras3.get(i));
			for(int j=inMat;j<finMat;j++){

				if(i!=j){

					if(this.palabras3.get(i).toString().equals(this.palabras3.get(j).toString())){
						finMat--;
						this.palabras3.remove(j);
						i=0;
						j=0;

					}
				}
			}
		}

	}
}

