package arrays.ej06;

import arrays.ArraysUtil;

//Desarrollar un método que reciba un array de enteros y retorne otro con los valores
//    originales elevados al cuadrado.
public class Ej02 {

	public static int[] cuadrado(int[] nums) {
		int[] cuadrados = new int[nums.length];
		for (int i = 0; i < cuadrados.length; i++) {
			cuadrados[i] = nums[i] * nums[i]; // Math.pow(nums[i], 2);
		}
		return cuadrados;
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7};
		ArraysUtil.muestra(n);
		ArraysUtil.muestra(cuadrado(n));
	}
	
}
