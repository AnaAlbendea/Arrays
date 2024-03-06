package arrays.ej06;

import arrays.ArraysUtil;

//Desarrollar un método que reciba un array de doubles y, en el mismo array, 
//  intercambie los elementos en espejo, es decir, el primero por el último, el 
//  segundo por el penúltimo y así sucesivamente.
public class Ej08 {
	public static void invierte(double[] v) {
		double aux;
		for (int i = 0; i < v.length / 2; i++) {
			aux = v[i];
			v[i] = v[v.length - 1 - i];
			v[v.length - 1 - i] = aux;
		}
	}
	
	public static void main(String[] args) {
		double[] v1 = {1,2,3,4,5,6};
		double[] v2 = {1,2,3,4,5};
		ArraysUtil.muestra(v1);
		invierte(v1);
		ArraysUtil.muestra(v1);
		invierte(v1);
		ArraysUtil.muestra(v1);
		System.out.println();
		ArraysUtil.muestra(v2);
		invierte(v2);
		ArraysUtil.muestra(v2);
		invierte(v2);
		ArraysUtil.muestra(v2);
	}
}
