package mypackage;

import java.util.Arrays;

public class Wektor {

	private double[] wektor;
	
	
	//konstruktor tworz�cy pusty wektor n-elementowy
	public Wektor(int n) {
		wektor = new double[n];
	}
	
	//konstruktor tworz�cy wektor z podanej jako argument tablicy liczb rzeczywistych
	public Wektor(double[] vec) {
		setVec(vec);
	}
	
	
	// zwraca tablic� wektor
	public double[] getVec() {
		return wektor;
	}
	
	// tworzy wektor z podanej jako argument tablicy
	public void setVec(double[] vec) {
		wektor = Arrays.copyOf(vec, vec.length);
	}
	
	// zwraca warto�� spod indeksu
	public double getIndex(int index) {
		return wektor[index];
	}
	
	
	// ustawia pod wskazany indeks podan� warto��
	public void setIndex(int index, double value) {
		wektor[index] = value;
	}
	
	// zwraca najwy�sz� warto�� z tablicy
	public double max() {
		double tmp = wektor[0];
		for(double x: wektor) {
			if(x>tmp) tmp = x;
		}
		return tmp;		
	}
	
	
	// zwraca najmniejsz� warto�� tablicy
	public double min() {
		double tmp = wektor[0];
		for(double x: wektor) {
			if(x<tmp) tmp = x;
		}
		return tmp;		
	}
	
	
	// zwraca tablic�, kt�ra jest poelementow� sum� wektoru oraz tablicy podanej jako argument
	public double[] add(double[] vec) {
		if(wektor.length>=vec.length) {
			for(int i = 0; i<vec.length; i++) {
				wektor[i] += vec[i];
			}
			return wektor;
		}
		else {
			for(int i = 0; i<wektor.length; i++) {
				vec[i] += wektor[i];
			}
			return vec;
		}
	}
	
	
	// przeci��ona wersja powy�szej metody umo�liwiaj�ca dodanie do siebie dw�ch 
	// dowolnych tablic typu double
	public double[] add(double[] vec, double[] vec2) {
		if(vec2.length>=vec.length) {
			for(int i = 0; i<vec.length; i++) {
				vec2[i] += vec[i];
			}
			return vec2;
		}
		else {
			for(int i = 0; i<vec2.length; i++) {
				vec[i] += vec2[i];
			}
			return vec;
		}
	}
	
	
	// zwraca wielko�� wektora
	public int size() {
		return wektor.length;
	}

	
	@Override
	public String toString() {
		return "Wektor [wektor=" + Arrays.toString(wektor) + "]";
	}
	
	
	
	// wy�wietla wszystkie elementy podanej tablicy
	public void show(double[] vec) {
		for(double x:vec) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	
	// sortuje elementy wektora.
	// W przypadku podania dodatniego argumentu (1) sortuje od najmniejszego do najwy�szego
	// W przypadku podania dodatniego argumentu (-1) sortuje od najwi�kszego do najmniejszego
	// W przypadku podania 0 zwraca niezmieniony wektor

	public double[] sort(int n) {
		if(n==0) return wektor;
		Arrays.sort(wektor);
		if(n>0) {
			return wektor;
		}
		else {
			double[] tmp = new double[wektor.length];
			for(int y =0, i = wektor.length-1; i >= 0; i--, y++) {
				tmp[y] = wektor[i];
			}
			wektor = Arrays.copyOf(tmp, tmp.length);
			return wektor;
		}
		
	}
	
	
	
	// przeci��ona wersja metody sort(int n). Umo�liwia podanie tablicy, kt�ra ma zosta�
	// posortowana.
	public double[] sort(double[] vec, int n) {
		if(n==0) return vec;
		Arrays.sort(vec);
		if(n>0) {
			return vec;
		}
		else {
			double[] tmp = new double[vec.length];
			for(int y =0, i = vec.length-1; i >= 0; i--, y++) {
				tmp[y] = vec[i];
			}
			vec = Arrays.copyOf(tmp, tmp.length);
			return vec;
		}
		
	}
}
