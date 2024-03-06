package arrays;

public class MuestraArray {


	public static void muestra(int[] valores) {
		for (int i=0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2,4,6,8,10};
		
		muestra(nums);
		
		int[] impares = {1,3,5};
		muestra(impares);
		muestra(duplica(impares));
 	}
	
	public static int[] duplica(int[] nums) {
		int[] resu = new int[2*nums.length];
		for (int i = 0; i < resu.length; i++) {
			resu[i] = nums[i % nums.length];
		}
		return resu;
	}
	
	
	
	
	
	
	
}
