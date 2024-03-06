package arrays.ej07;

import arrays.ArraysUtil;

//4.Desarrollar un método que reciba un array de dos dimensiones de double y retorne 
//  la suma de cada fila.
//5.Desarrollar un método que reciba un array de dos dimensiones de double y retorne
//  la suma de cada columna.
public class Ej04y05 {

	public static void main(String[] args) {
		double[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] m3 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		ArraysUtil.muestra(m1);
		System.out.print("Filas: ");
		ArraysUtil.muestra(sumaFilas(m1));
		System.out.print("Columnas: ");
		ArraysUtil.muestra(sumaColumnas(m1));
		System.out.println();

		ArraysUtil.muestra(m2);
		System.out.print("Filas: ");
		ArraysUtil.muestra(sumaFilas(m2));
		System.out.print("Columnas: ");
		ArraysUtil.muestra(sumaColumnas(m2));
		System.out.println();

		ArraysUtil.muestra(m3);
		System.out.print("Filas: ");
		ArraysUtil.muestra(sumaFilas(m3));
		System.out.print("Columnas: ");
		ArraysUtil.muestra(sumaColumnas(m3));
	}

	public static double[] sumaFilas(double[][] m) {
		double[] sumaF = new double[m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sumaF[i] += m[i][j];
			}
		}
		return sumaF;
	}

	public static double[] sumaColumnas(double[][] m) {
		double[] sumaC = new double[m[0].length];
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				sumaC[j] += m[i][j];
			}
		}
		return sumaC;
	}

}
