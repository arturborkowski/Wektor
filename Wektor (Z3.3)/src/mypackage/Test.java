package mypackage;

public class Test {

	public static void main(String args[]) {
		
		double[] tablica = new double[3];
		for(int i = 0; i < tablica.length; i++) {
			tablica[i] = Math.round((double)(Math.random()*100));
		}
	
		double[] tablica2 = new double[6];
		for(int i = 0; i < tablica2.length; i++) {
			tablica2[i] = Math.round((double)(Math.random()*100));
		}
		
		
		Wektor nowy = new Wektor(tablica);

		System.out.println(nowy.toString());
		nowy.show(tablica2);
		System.out.println();	
		
		
		
		nowy.show(nowy.add(tablica2));
		nowy.show(nowy.sort(1));
		nowy.show(nowy.sort(-1));
		

		
	}

}
