package arrays.ej06;

import arrays.ArraysUtil;

//Similar al anterior pero que intercale los elementos. 
//  Ej: recibe [1, 2, 3, 4, 5] y [6, 7]; retorna [1, 6, 2, 7, 3, 4, 5].
public class Ej07 {
	
	public static int[] intercala(int[] a1, int[] a2) {
		int[] resu = new int[a1.length + a2.length];
		int[] largo;

		int longCorto = Math.min(a1.length, a2.length);
		
		for (int i = 0; i < longCorto; i++) {
			resu[2 * i] = a1[i];
			resu[2 * i + 1] = a2[i];
		}
		largo = a1.length > a2.length ? a1 : a2;
		for (int i = longCorto; i < largo.length; i++) {
			resu[i + longCorto] = largo[i];
		}
		
		return resu;
	}
	
	public static void main(String[] args) {
		int[] n1 = {1, 2, 3, 4, 5};
		int[] n2 = {6, 7};
		ArraysUtil.muestra(n1);
		ArraysUtil.muestra(n2);
		ArraysUtil.muestra(intercala(n1, n2));
		ArraysUtil.muestra(intercala(n2, n1));
	}
}
