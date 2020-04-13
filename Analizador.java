
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Analizador {

	public List leerArchivo() {

		File documentos = null;
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList frases = new ArrayList();
		try {
			documentos = new File(
					"C:\\Users\\PCX\\Documents" + "\\8vo Ciclo\\Computacion Paralela"
							+ "\\1k.txt");
			fr = new FileReader(documentos);
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				frases.add(linea.toString());
				/*System.out.println(frases.size());
				System.out.println(linea);*/
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
	
	public List listarPalabras() {
		
		ArrayList palabras = new ArrayList();
		String cadena = "";
		String palabra = "";
	
		String[] words = null;
		for (int i = 0; i < leerArchivo().size(); i++) {
			//System.out.println(i+" "+leerArchivo().get(i));
			cadena = (String) leerArchivo().get(i);
			words = cadena.split(" ");
			for (int j = 0; j < words.length; j++) {
				palabras.add(words[j]);
			}
			
		}
		
		for(int i=0;i<palabras.size();i++){
			for(int j=0;j<palabras.size();j++){
				if(i!=j){
					if(palabras.get(i).toString().equals(palabras.get(j).toString())){
						palabras.remove(j);
						// eliminamos su valor
					}
				}
			}
		}
		//System.out.println("palabras"+palabras.size());
		return palabras;
	}
	
	public int[][] relacionaPalabraDocumento() {
		
		int tamPalabras = listarPalabras().size();
		int tamArchivo = leerArchivo().size();
		String cadena = "";
		String[] words = null;
		int[][] mTD = new int[tamPalabras][tamArchivo];
		//System.out.println("tamaño matriz "+mTD.length);
		int contador=0;
		 
		
		for (int i = 0; i < tamPalabras ; i++) {
			for (int j = 0; j < tamArchivo; j++) {
				
				cadena = (String) leerArchivo().get(j);
			//	System.out.println(cadena);
				words = cadena.split(" ");
				//System.out.println(words.length);
				
				for (int k = 0; k < words.length; k++) {
					if(listarPalabras().get(i).equals(words[k])) {
						contador++;
						
					}
				}
				mTD[i][j]=contador;
				contador=0;
				
			}
			
		}
		/*for (int x=0; x < mTD.length; x++) {
			  System.out.print(listarPalabras().get(x)+"|");
			  for (int y=0; y < mTD[x].length; y++) {
			    System.out.print (mTD[x][y]);
			    if (y!=mTD[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}*/
		return mTD;
	}
	
	
	

}