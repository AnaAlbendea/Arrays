package cadenas.ej05a;

//Este ejemplo hace lo mismo que el anterior, pero codifica en un solo rango todos
//los caracteres.
public class Ej23b {
	
	private static final int CANT = 100;
	private static final int COD_INI = 32;
	
	public static String decodifica(String txt, int n) {
		String decod = "";
		for (int i = 0; i < txt.length(); i++) {
			decod += decodificaLetra(txt.charAt(i), n);
		}
		return decod;
	}
	
	public static String codifica(String txt, int n) {
		String cod = "";
		for (int i = 0; i < txt.length(); i++) {
			cod += codificaLetra(txt.charAt(i), n);
		}
		return cod;
	}
	
	public static char decodificaLetra(char letra, int n) {
		int decod = letra - n;
		n %= CANT;
		return (char) (decod >= COD_INI ? decod : decod + CANT);
	}
	
	public static char codificaLetra(char letra, int n) {
		int cod = letra + n;
		final int ultima = COD_INI + CANT - 1;
		n %= CANT;
		
		return (char)(cod <= ultima ? cod : cod-CANT);
	}
	
	public static void main(String[] args) {
		String original = "Hoy es viernes: nos vamos de finde!!!!";
		System.out.println("original: " + original);
		
		String cod = codifica(original, 15);
		System.out.println("Codificado: " + cod);
		
		System.out.println("Decodificado: " + decodifica(cod, 15));
	}
}
