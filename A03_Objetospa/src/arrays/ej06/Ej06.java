package arrays.ej06;

import arrays.MuestraArray;

//Desarrollar un método que reciba dos arrays de enteros y retorne un tercero con 
//  todos los elementos del primero y luego los del segundo. 
//  Ej: recibe [1, 2, 3] y [4, 5]; retorna [1,2,3,4,5].
public class Ej06 {
	
	public static int[] uneArrays(int[] a1, int[] a2) {
		int[] resu = new int[a1.length + a2.length];
		for (int i = 0; i < a1.length; i++) {
			resu[i] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			resu[a1.length + i] = a2[i];
		}
		return resu;
	}
	
	public static void main(String[] args) {
		int[] n1 = {1, 2, 3};
		int[] n2 = {4, 5};
		MuestraArray.muestra(n1);
		MuestraArray.muestra(n2);
		MuestraArray.muestra(uneArrays(n1, n2));
		MuestraArray.muestra(uneArrays(n2, n1));
	}
}
