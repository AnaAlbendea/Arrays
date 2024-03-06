package cadenas.ej05a;

// Desarrollar dos métodos para codificar y decodificar un texto utilizando el método 
// de cifrado de César. Supondremos que el texto solo contiene letras mayúsculas 
// o minúsculas. Las letras serán las correspondientes al alfabeto inglés 
// (26 caracteres, excluimos la ñ y Ñ). 
// En este método de cifrado cada letra del texto se sustituye por otra letra que se 
// encuentra n posiciones adelante en el alfabeto, la n se recibe también como 
// parámetro. 
// Se considera que el alfabeto es circular, es decir, la letra siguiente a la ‘z’ 
// es la ‘a’. 
// Por ejemplo, si n es 3, las transformaciones serían: 
// la ‘a’ se transformaría en ‘d’, 
// la ‘b’ en ‘e’, 
// la ‘c’ en ‘f’, 
// la ‘w’ en ‘z’, 
// la ‘x’ en ‘a’, 
// la ‘y’ en ‘b’, etc. 
// De la misma manera se comportarían las mayúsculas. 
// Ejemplo de cifrado César: 
// 	si el texto es “capaz” y n = 3 el texto cifrado es “fdsdc”. 
// Para descifrar un texto se realiza la operación contraria. Se calcula la letra que 
// está n posiciones por detrás en el alfabeto. Como el alfabeto es circular, 
// la letra anterior a la ‘a’ es la ‘z’. 
// Trabajar con los valores decimales de los UNICODE.
public class Ej23 {
	
	private static final int CANT = 26;
	private static final int ESP_COD = 'ñ'; 
	
	public static String decodifica(String txt, int n) {
		String decod = "";
		for (int i = 0; i < txt.length(); i++) {
			int primera = Character.isUpperCase(txt.charAt(i)) ? 'A' : 'a';
			if (txt.charAt(i) == ESP_COD)
				decod += ' ';
			else
				decod += decodificaLetraV2(txt.charAt(i), n, primera);
		}
		return decod;
	}

	public static String codifica(String txt, int n) {
		String cod = "";
		for (int i = 0; i < txt.length(); i++) {
			int primera = Character.isUpperCase(txt.charAt(i)) ? 'A' : 'a';
			if (txt.charAt(i) == ' ')
				cod += (char)ESP_COD;
			else
				cod += codificaLetraV3(txt.charAt(i), n, primera);
		}
		return cod;
	}
	
	public static char decodificaLetra(char letra, int n, int primera) {
		int decod = letra - n;
		n %= CANT;
		
		if (decod < primera) {
			return (char)(decod + CANT);
		}
		return (char)decod;
	}
	
	public static char decodificaLetraV2(char letra, int n, int primera) {
		int decod = letra - n;
		n %= CANT;
		
		if (decod < primera) {
			return (char)(decod + CANT);
		}
		return (char) (decod >= primera ? decod : decod + CANT);
	}
	
	public static char codificaLetra(char letra, int n, int primera) {
		int cod = letra + n;
		final int ultima = primera + CANT - 1;
		n %= CANT;
		
		if (cod > ultima) {
			return (char)(cod - CANT);
		}
		return (char)cod;
	}
	
	public static char codificaLetraV2(char letra, int n, int primera) {
		int cod = letra + n;
		final int ultima = primera + CANT - 1;
		n %= CANT;
		
		return (char)(cod <= ultima ? cod : cod-CANT);
	}
	
	public static char codificaLetraV3(char letra, int n, int primera) {
		return (char)((letra + n - primera) % CANT + primera);
	}
	
	public static void main(String[] args) {
		String original = "Hoy es viernes nos vamos de finde";
		System.out.println("original: " + original);
		
		String cod = codifica(original, 15);
		System.out.println("Codificado: " + cod);
		
		System.out.println("Decodificado: " + decodifica(cod, 15));
	}
}
