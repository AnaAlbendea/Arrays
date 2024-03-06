package arrays.ej06;

import arrays.ArraysUtil;

//Desarrollar un método que reciba un array de enteros y retorne otro con el doble 
//  de tamaño y con los valores originales almacenados en las posiciones correspondientes.
public class Ej04 {

	public static int[] duplica(int[] nums) {
		int[] nuevo = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			nuevo[i] = nums[i];
		}
		return nuevo;
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		ArraysUtil.muestra(n);
		ArraysUtil.muestra(duplica(n));
	}
}
