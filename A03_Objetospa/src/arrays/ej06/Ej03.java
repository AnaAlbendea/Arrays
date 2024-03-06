package arrays.ej06;

import arrays.ArraysUtil;

//Desarrollar un método que reciba un array de enteros y retorne otro con los 
//  elementos ordenados exactamente al revés que el original.
public class Ej03 {
	public static int[] invierte(int[] nums) {
		int[] inv = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			inv[i] = nums[nums.length - 1 - i];
		}
		return inv;
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,9};
		ArraysUtil.muestra(n);
		ArraysUtil.muestra(invierte(n));
		ArraysUtil.muestra(n);
		
	}
}
