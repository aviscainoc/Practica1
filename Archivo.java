package ec.edu.ups.hilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Archivo {
	
	ArrayList palabras = new  ArrayList();
	

	public ArrayList getPalabras() {
		return palabras;
	}

	public void setPalabras(ArrayList palabras) {
		this.palabras = palabras;
	}

	public void addPalabra(String palabra) {

		if(palabras == null) { 
			//System.out.println("esta vacio");
		}
		
		palabras.add(palabra);

	}




	public List leerArchivo() {


		File documentos = null;
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList frases = new ArrayList();
		try {
			documentos = new File(
					"/home/usuario/Documentos/Adrian Viscaino/Computacion paralela/1k.txt");
			fr = new FileReader(documentos);
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				frases.add(linea.toString());
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return frases;
	}
	
	
		
	public void dosIniciarPalabras() {
		int cantHilos=2;
		float num= leerArchivo().size()/cantHilos;
		
		lisatPalabras an1 = new lisatPalabras(0, (int) num);
		lisatPalabras an2 = new lisatPalabras((int) num, leerArchivo().size());
		

		an1.run();
		an2.run();
		
		
		palabras=an1.getPalabras2();
		palabras.addAll(an2.getPalabras2());
		
	}
	
	public void cuatroIniciarPalabras() {
		int cantHilos=4;
		float num= leerArchivo().size()/cantHilos;
		
		lisatPalabras an1 = new lisatPalabras(0, (int) num);
		lisatPalabras an2 = new lisatPalabras((int) num, (int) (2*num));
		lisatPalabras an3 = new lisatPalabras((int) (2*num), (int) (3*num));
		lisatPalabras an4 = new lisatPalabras((int) (3*num), leerArchivo().size());

		an1.run();
		an2.run();
		an3.run();
		an4.run();
		
		
		palabras=an1.getPalabras2();
		palabras.addAll(an2.getPalabras2());
		
	}
	
	public void seisIniciarPalabras() {
		int cantHilos=6;
		float num= leerArchivo().size()/cantHilos;
		
		lisatPalabras an1 = new lisatPalabras(0, (int) num);
		lisatPalabras an2 = new lisatPalabras((int) num, (int) (2*num));
		lisatPalabras an3 = new lisatPalabras((int) (2*num), (int) (3*num));
		lisatPalabras an4 = new lisatPalabras((int) (3*num), (int) (4*num));
		lisatPalabras an5 = new lisatPalabras((int) (4*num), (int) (5*num));
		lisatPalabras an6 = new lisatPalabras((int) (3*num), leerArchivo().size());
		
		an1.run();
		an2.run();
		an3.run();
		an4.run();
		an5.run();
		an6.run();
		
		
		palabras=an1.getPalabras2();
		palabras.addAll(an2.getPalabras2());
		
	}
	
	public void ochoIniciarPalabras() {
		int cantHilos=8;
		float num= leerArchivo().size()/cantHilos;
		
		lisatPalabras an1 = new lisatPalabras(0, (int) num);
		lisatPalabras an2 = new lisatPalabras((int) num, (int) (2*num));
		lisatPalabras an3 = new lisatPalabras((int) (2*num), (int) (3*num));
		lisatPalabras an4 = new lisatPalabras((int) (3*num), (int) (4*num));
		lisatPalabras an5 = new lisatPalabras((int) (4*num), (int) (5*num));
		lisatPalabras an6 = new lisatPalabras((int) (5*num), (int) (6*num));
		lisatPalabras an7 = new lisatPalabras((int) (6*num), (int) (7*num));
		lisatPalabras an8 = new lisatPalabras((int) (7*num), leerArchivo().size());
		
		an1.run();
		an2.run();
		an3.run();
		an4.run();
		an5.run();
		an6.run();
		an7.run();
		an8.run();
		
		
		palabras=an1.getPalabras2();
		palabras.addAll(an2.getPalabras2());
		
	}
	
	
	
	public void ochoEliminarRepetidas() {
		
		int cantHilos=8;
		float num= palabras.size()/cantHilos;
		
		eliminarRepetidas an1 = new eliminarRepetidas(palabras, 0, (int) num);
		an1.run();
		palabras=an1.getPalabras3();
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an2 = new eliminarRepetidas(palabras, (int) num, (int) (2*num));
		an2.run();
		palabras.addAll(an2.getPalabras3());
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an3 = new eliminarRepetidas(palabras, (int) (2*num), (int) (3*num));
		an3.run();
		palabras.addAll(an3.getPalabras3());
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an4 = new eliminarRepetidas(palabras, (int) (3*num), (int) (4*num));
		an4.run();
		palabras.addAll(an4.getPalabras3());
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an5 = new eliminarRepetidas(palabras, (int) (4*num), (int) (5*num));
		an5.run();
		palabras.addAll(an5.getPalabras3());
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an6 = new eliminarRepetidas(palabras, (int) (5*num), (int) (6*num));
		an6.run();
		palabras.addAll(an6.getPalabras3());
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an7 = new eliminarRepetidas(palabras, (int) (6*num), (int) (7*num));
		an7.run();
		palabras.addAll(an7.getPalabras3());
		
		num= palabras.size()/cantHilos;
		eliminarRepetidas an8 = new eliminarRepetidas(palabras, (int) (7*num), palabras.size());
		an8.run();
		palabras.addAll(an8.getPalabras3());
		
		
	}
	
	public void dosCorrer() {
		int cantHilos=2;
		float num= leerArchivo().size()/cantHilos;
		//System.out.println("Para correr"+palabras.size());
		
		AnalizadorHilo an1 = new AnalizadorHilo(0, (int) num, palabras.size(), palabras);
		AnalizadorHilo an2 = new AnalizadorHilo((int) (num), leerArchivo().size(), palabras.size(), palabras);

		an1.run();
		an2.run();
		
	}
	
	public void cuatroCorrer() {
		int cantHilos=4;
		float num= leerArchivo().size()/cantHilos;
		//System.out.println("Para correr"+palabras.size());
		
		AnalizadorHilo an1 = new AnalizadorHilo(0, (int) num, palabras.size(), palabras);
		AnalizadorHilo an2 = new AnalizadorHilo((int) num, (int) (2*num), palabras.size(), palabras);
		AnalizadorHilo an3 = new AnalizadorHilo((int) (2*num), (int) (3*num), palabras.size(), palabras);
		AnalizadorHilo an4 = new AnalizadorHilo((int) (3*num), leerArchivo().size(), palabras.size(), palabras);

		an1.run();
		an2.run();
		an3.run();
		an4.run();
		
	}
	
	public void seisCorrer() {
		int cantHilos=6;
		float num= leerArchivo().size()/cantHilos;
		//System.out.println("Para correr"+palabras.size());
		
		AnalizadorHilo an1 = new AnalizadorHilo(0, (int) num, palabras.size(), palabras);
		AnalizadorHilo an2 = new AnalizadorHilo((int) num, (int) (2*num), palabras.size(), palabras);
		AnalizadorHilo an3 = new AnalizadorHilo((int) (2*num), (int) (3*num), palabras.size(), palabras);
		AnalizadorHilo an4 = new AnalizadorHilo((int) (3*num), (int) (4*num), palabras.size(), palabras);
		AnalizadorHilo an5 = new AnalizadorHilo((int) (4*num), (int) (5*num), palabras.size(), palabras);
		AnalizadorHilo an6 = new AnalizadorHilo((int) (5*num), leerArchivo().size(), palabras.size(), palabras);

		an1.run();
		an2.run();
		an3.run();
		an4.run();
		an5.run();
		an6.run();
		
	}
	
	public void ochoCorrer() {
		int cantHilos=6;
		float num= leerArchivo().size()/cantHilos;
		//System.out.println("Para correr"+palabras.size());
		
		AnalizadorHilo an1 = new AnalizadorHilo(0, (int) num, palabras.size(), palabras);
		AnalizadorHilo an2 = new AnalizadorHilo((int) num, (int) (2*num), palabras.size(), palabras);
		AnalizadorHilo an3 = new AnalizadorHilo((int) (2*num), (int) (3*num), palabras.size(), palabras);
		AnalizadorHilo an4 = new AnalizadorHilo((int) (3*num), (int) (4*num), palabras.size(), palabras);
		AnalizadorHilo an5 = new AnalizadorHilo((int) (4*num), (int) (5*num), palabras.size(), palabras);
		AnalizadorHilo an6 = new AnalizadorHilo((int) (5*num), (int) (6*num), palabras.size(), palabras);
		AnalizadorHilo an7 = new AnalizadorHilo((int) (6*num), (int) (7*num), palabras.size(), palabras);
		AnalizadorHilo an8 = new AnalizadorHilo((int) (7*num), leerArchivo().size(), palabras.size(), palabras);

		an1.run();
		an2.run();
		an3.run();
		an4.run();
		an5.run();
		an6.run();
		an7.run();
		an8.run();
		
	}
	
}
