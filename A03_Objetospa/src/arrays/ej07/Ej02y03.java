package arrays.ej07;

import arrays.ArraysUtil;

//2. Desarrollar un método que reciba un array de dos dimensiones de double y 
//  retorne la suma total de todos los elementos.

//3. Desarrollar un método que reciba un array de dos dimensiones de double 
//  (matriz matemática) y calcule la Traza. La traza es la sumatoria de los elementos
//  de la diagonal principal de una matriz cuadrada. 
//  Nosotros la calcularemos para cualquier matriz, no sólo cuadradas.
public class Ej02y03 {

	public static void main(String[] args) {
		System.out.println("Ej2");
		double[][] m = {{1,2,3,4}, {5,6,7,8}, {9, 12, 13, 14}}; // new int[3][4]
		ArraysUtil.muestra(m);
		System.out.println(suma(m));
		
		System.out.println("\nEj3");
		double[][] m1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] m2 = {{1,2,3}, {4,5,6}};
		double[][] m3 = {{1,2}, {3,4}, {5,6}};
		ArraysUtil.muestra(m1);
		System.out.println("Traza: " + traza(m1) +"\n");
		ArraysUtil.muestra(m2);
		System.out.println("Traza: " + traza(m2) +"\n");
		ArraysUtil.muestra(m3);
		System.out.println("Traza: " + traza(m3));
	}
	
	public static double suma(double[][] m) {
		double suma = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				suma += m[i][j];
			}
		}
		return suma;
	}
	
	public static double traza(double[][] m) {
		int menor = Math.min(m.length, m[0].length);
		double traza = 0;
		for (int i = 0; i < menor; i++) {
			traza += m[i][i];
		}
		return traza;
	}
}
