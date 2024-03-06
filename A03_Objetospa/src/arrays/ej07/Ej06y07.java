package arrays.ej07;

import com.cursojava.introduccion.ejercicios.ej04.Ej05;

import arrays.ArraysUtil;

//6.Desarrollar un método que reciba un array de dos dimensiones de enteros y retorne
//   la fila cuya suma es mayor. Si hay dos que coinciden, retornar la primera.
//7.Desarrollar un método que reciba un array de dos dimensiones de enteros y retorne 
//   la columna cuya suma es mayor. Si hay dos que coinciden, retornar la primera.
public class Ej06y07 {
	public static void main(String[] args) {
		double[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] m2 = { { 10, 20, 30 }, { 4, 5, 6 } };
		double[][] m3 = { { 1, 2 }, { 30, 40 }, { 5, 6 } };

		ArraysUtil.muestra(m1);
		System.out.print("Fila Mayor: ");
		ArraysUtil.muestra(filaMayor(m1));
		System.out.print("Columna Mayor: ");
		ArraysUtil.muestra(columnaMayor(m1));
		System.out.println();

		ArraysUtil.muestra(m2);
		System.out.print("Filas: ");
		ArraysUtil.muestra(filaMayor(m2));
		System.out.print("Columnas: ");
		ArraysUtil.muestra(columnaMayor(m2));
		System.out.println();

		ArraysUtil.muestra(m3);
		System.out.print("Filas: ");
		ArraysUtil.muestra(filaMayor(m3));
		System.out.print("Columnas: ");
		ArraysUtil.muestra(columnaMayor(m3));
	}

	public static double[] filaMayor(double[][] m) {
		int idxMayor = idxMayor(Ej04y05.sumaFilas(m));
		return m[idxMayor].clone();
	}
	
	public static int idxMayor(double[] v) {
		double mayor = v[0];
		int idxMayor = 0;
		for (int i = 1; i < v.length; i++) {
			if (v[i] > mayor) {
				mayor = v[i];
				idxMayor = i;
			}
		}
		return idxMayor;
	}
	
	public static double[] columnaMayor(double[][] m) {
		int idxMayor = idxMayor(Ej04y05.sumaColumnas(m));
		double[] colMayor = new double[m.length];
		for (int i = 0; i < m.length; i++) {
			colMayor[i] = m[i][idxMayor];
		}
		return colMayor;
	}
}
