package arrays;

public class ArraysUtil {

	public static void muestra(int[] valores) {
		System.out.println(toString(valores));
	}

	public static void muestra(double[] valores) {
		System.out.println(toString(valores));
	}
	
	public static String toString(int[] valores) {
		StringBuilder resu = new StringBuilder("[");
		for (int i=0; i < valores.length; i++) {
			resu.append(valores[i]);
			if (i < valores.length - 1)
				resu.append(", ");
		}
		resu.append("]");
		return resu.toString();
	}
	
	public static String toString(double[] valores) {
		StringBuilder resu = new StringBuilder("[");
		for (int i=0; i < valores.length; i++) {
			resu.append(valores[i]);
			if (i < valores.length - 1)
				resu.append(", ");
		}
		resu.append("]");
		return resu.toString();
	}
	
	public static void muestra(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void muestra(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
