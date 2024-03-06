package cadenas;

public class CadenasConcatena {

	public static void main(String[] args) {

		String s = "";
		
		StringBuilder sb = new StringBuilder("");
		StringBuffer sbf = new StringBuffer("");
		long i, f;
		
		i = System.currentTimeMillis();
		for (int j = 1; j <= 100_000; j++) {
			s += "a";
		}
		f = System.currentTimeMillis();
		System.out.println("String: " + (f-i) + "ms.");

		i = System.currentTimeMillis();
		for (int j = 1; j <= 50_000_000; j++) {
			sb.append("a");
		}
		f = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (f-i) + "ms.");
		
		i = System.currentTimeMillis();
		for (int j = 1; j <= 50_000_000; j++) {
			sbf.append("a");
		}
		f = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (f-i) + "ms.");
		
		
	}
}
