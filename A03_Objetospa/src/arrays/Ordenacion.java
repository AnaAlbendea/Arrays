package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ordenacion {
	public static void main(String[] args) {

		int[] v1 = creaArray();
		int[] v2 = v1.clone();
		int[] v3 = v1.clone();
		long t0, tf;
		
		t0 = System.currentTimeMillis();
		Arrays.sort(v1);
		tf = System.currentTimeMillis();
		System.out.println("QuickSort libreria: " + (tf-t0) + " ms.");
		
		t0 = System.currentTimeMillis();
		burbuja(v2);
		tf = System.currentTimeMillis();
		System.out.println("Burbuja: " + (tf-t0) + " ms.");

		t0 = System.currentTimeMillis();
		qsort(v3);
		tf = System.currentTimeMillis();
		System.out.println("QuickSort recur: " + (tf-t0) + " ms.");
	}
	
	public static int[] creaArray() {
		int cant = 100_000;
		int[] v = new int[cant];
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt();
		}
		return v;
	}
	
	public static void burbuja(int[] v) {
		int aux;
		boolean ordenado = false;
		for (int i = 0; i < v.length - 1 && !ordenado; i++) {
			ordenado = true;
			for (int j = 0; j < v.length - 1 - i; j++) {
				if (v[j] > v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
					ordenado = false;
				}
			}
		}
	}
	
	public static void qsort(int[] v) {
		qsort(v, 0, v.length-1);
	}
	
	private static void qsort(int[] v, int izq, int der) {
		int pivote = izq;
		int i = izq;
		int d = der;
		int aux;
		while (i < d) {
			while (v[i] <= v[pivote] && i < d) i++;
			while (v[d] > v[pivote]) d--;
			if (i < d) {
				aux = v[i];
				v[i] = v[d];
				v[d] = aux;
			}
		}
		//ubicar el pivote en su lugar
		aux = v[pivote];
		v[pivote] = v[d];
		v[d] = aux;
		pivote = d;
		if (izq < pivote-1)
			qsort(v, izq, pivote-1);
		if (pivote+1 < der)
			qsort(v, pivote+1, der);
	}
}














