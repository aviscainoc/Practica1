package ec.edu.ups.hilos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double time=0;
		long startTime1=0;
		long endTime1=0;
		long startTime2=0;
		long endTime2=0;
	
		
		Archivo ar = new Archivo();
		
		startTime1 = System.currentTimeMillis();
		ar.dosIniciarPalabras();
		endTime1 = System.currentTimeMillis() - startTime1;
		
		ar.ochoEliminarRepetidas();
		
		startTime2= System.currentTimeMillis();
		ar.dosCorrer();
		endTime2 = System.currentTimeMillis() - startTime1;
		
		time=(endTime1+endTime2);
		System.out.println("Tiempo total dos: "+time);
		
		////////////////////////////*/
		
		startTime1 = System.currentTimeMillis();
		ar.cuatroIniciarPalabras();
		endTime1 = System.currentTimeMillis() - startTime1;
		
		ar.ochoEliminarRepetidas();
		
		startTime2= System.currentTimeMillis();
		ar.cuatroCorrer();
		endTime2 = System.currentTimeMillis() - startTime1;
		
		time=(endTime1+endTime2);
		System.out.println("Tiempo total cuatro: "+time);
		
		////////		
		startTime1 = System.currentTimeMillis();
		ar.seisIniciarPalabras();
		endTime1 = System.currentTimeMillis() - startTime1;
		
		ar.ochoEliminarRepetidas();
		
		startTime2= System.currentTimeMillis();
		ar.seisCorrer();
		endTime2 = System.currentTimeMillis() - startTime1;
		
		time=(endTime1+endTime2);
		System.out.println("Tiempo total seis: "+time);
	
		////////////////////////////
				
		startTime1 = System.currentTimeMillis();
		ar.ochoIniciarPalabras();
		endTime1 = System.currentTimeMillis() - startTime1;
		
		ar.ochoEliminarRepetidas();
		
		startTime2= System.currentTimeMillis();
		ar.ochoCorrer();
		endTime2 = System.currentTimeMillis() - startTime1;
		
		time=(endTime1+endTime2);
		System.out.println("Tiempo total ocho: "+time);
		
	}

}
