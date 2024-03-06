package cadenas.ej05b;

//Desarrollar un método que indique si una palabra es un palíndromo.
//  a. Modificarlo para que indique si una frase es un palíndromo.
public class Ej02 {
	public static boolean isPalindromo(String ori) {
		ori = preparaFrase(ori);
		return ori.equals(Ej01.invierte(ori));
	}
	
	public static String preparaFrase(String frase) {
		return frase.toLowerCase().replace(" ", "");
	}
	
	public static boolean isPalindromoV2(String ori) {
		ori = preparaFrase(ori);
		int i = 0;
		int d = ori.length() - 1;
		boolean iguales = true;
		while (i < d && iguales) {
			if (ori.charAt(i) != ori.charAt(d))
				iguales = false;
			i++;
			d--;
		}
		return iguales;
	}
	
	public static boolean isPalindromoV3(String ori) {
		ori = preparaFrase(ori);
		boolean iguales = true;
		for (int i = 0, d = ori.length() - 1; i < d && iguales; i++, d--) {
			if (ori.charAt(i) != ori.charAt(d))
				iguales = false;
		}
		return iguales;
	}
	
	private static boolean isPalindromoRec(String ori) {
		if (ori.length() <= 2)
			return true;
		return ori.charAt(0) == ori.charAt(ori.length()-1) 
				&& isPalindromoRec(ori.substring(1, ori.length()-1));
	}
	
	public static boolean isPalindromoV4(String ori) {
		return isPalindromoRec(preparaFrase(ori));
	}
	
	public static void main(String[] args) {
		
		String pal = "Dabale arroz a la zorra el Abad";
		String noPal = "asdf";
		System.out.println(isPalindromo(pal));
		System.out.println(isPalindromo(noPal));
		System.out.println(isPalindromoV2(pal));
		System.out.println(isPalindromoV2(noPal));
		System.out.println(isPalindromoV3(pal));
		System.out.println(isPalindromoV3(noPal));
		System.out.println(isPalindromoV4(pal));
		System.out.println(isPalindromoV4(noPal));
		
	}
}
