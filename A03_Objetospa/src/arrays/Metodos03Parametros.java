package arrays;

public class Metodos03Parametros {

	public static void cambia(int pepe) {
		pepe = 0;
	}
	
	public static void cambia(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
//		int a;
//		a = 99;
//		cambia(a);
//		System.out.println(a);
		
		int[] n = {99,99,99,99};

		cambia(n);
		ArraysUtil.muestra(n);
	}
}
