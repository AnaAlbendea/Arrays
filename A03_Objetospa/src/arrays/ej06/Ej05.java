package arrays.ej06;

import arrays.ArraysUtil;

//Desarrollar un método que reciba, dos arrays de doubles del mismo tamaño y retorne 
//  un nuevo array con la suma de los elementos que están en la misma posición.
//   a. Repetir el método, pero para arrays de diferentes tamaños.
public class Ej05 {
	public static double[] sumaIguales(double[] n1, double[] n2) {
		double[] resu = new double[n1.length];
		for (int i = 0; i < resu.length; i++) {
			resu[i] = n1[i] + n2[i];
		}
		return resu;
	}
	
	public static double[] suma(double[] n1, double[] n2) {
		double[] resu = new double[Math.max(n1.length, n2.length)];
		for (int i = 0; i < resu.length; i++) {
			resu[i] = (i < n1.length ? n1[i] : 0) +
					  (i < n2.length ? n2[i] : 0);
		}
		return resu;
	}
	
	public static double[] sumaV2(double[] n1, double[] n2) {
		double[] corto, largo;
		if(n1.length < n2.length) {
			corto = n1;
			largo = n2;
		} else {
			corto = n2;
			largo = n1;
		}
		double[] resu = largo.clone();
		for (int i = 0; i < corto.length; i++) {
			resu[i] += corto[i];
		}
		
		return resu;
	}
		
		
	public static void main(String[] args) {
		double[] d1 = {1.5, 2, 3.7}; 
		double[] d2 = {5.5, 2.3, 7.7};
		ArraysUtil.muestra(d1);
		ArraysUtil.muestra(d2);
		ArraysUtil.muestra(sumaIguales(d1, d2));
		System.out.println();
		double[] d3 = {4, 5};
		ArraysUtil.muestra(d1);
		ArraysUtil.muestra(d3);
		ArraysUtil.muestra(suma(d3, d1));
		
		System.out.println("--------------");
		ArraysUtil.muestra(d1);
		ArraysUtil.muestra(d3);
		ArraysUtil.muestra(sumaV2(d3,d1));
		ArraysUtil.muestra(d1);
		ArraysUtil.muestra(d3);
	}
}
