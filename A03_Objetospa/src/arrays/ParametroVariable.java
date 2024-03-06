package arrays;

import java.util.Arrays;

public class ParametroVariable {

	
	public static int suma(int... nums) {
		int suma = 0;
		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		return suma;
	}

	
	public static void main(String[] args) {
		System.out.println(suma(3,5));
		System.out.println(suma(5,4,6));
		System.out.println(suma(5,4,8,9));
		int[] ej = {1,2,3,4,5,6,7,8,9};
		System.out.println(suma(ej));
		
		
	}
}
