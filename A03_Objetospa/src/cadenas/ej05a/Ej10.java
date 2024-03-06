package cadenas.ej05a;

//Método que reciba una cadena y un carácter y la retorne pero sólo hasta la primera 
//  aparición del carácter dado (sin incluirlo). No se puede utilizar indexOf.
//a. Repite el ejercicio anterior usando indexOf.
public class Ej10 {

	// sin usar substring
	public static String inicioHasta(String str, char c) {
		String resu = "";
		boolean encontrado = false;
		for (int i = 0; i < str.length() && !encontrado; i++) {
			if (str.charAt(i) == c)
				encontrado = true;
			else
				resu += str.charAt(i);
		}	
		return resu;
	}

	// sin usar substring
	public static String inicioHastaIndexOf(String str, char c) {
		String resu = "";
		int pos = str.indexOf(c);
		int hasta = pos == -1 ? str.length() : pos;
		for (int i = 0; i < hasta; i++)
			resu += str.charAt(i);
		return resu;
	}
	
	//usando substring
	public static String inicioHastaSubstring(String str, char c) {
		int pos = str.indexOf(c);
		int hasta = pos == -1 ? str.length() : pos;
		return str.substring(0, hasta);
	}
	
	public static void main(String[] args) {
		System.out.println(inicioHasta("Hola que tal", 'a'));
		System.out.println(inicioHastaIndexOf("Hola que tal", 'a'));
		System.out.println(inicioHastaSubstring("Hola que tal", 'a'));

		System.out.println(inicioHasta("Hola que tal", 'x'));
		System.out.println(inicioHastaIndexOf("Hola que tal", 'x'));
		System.out.println(inicioHastaSubstring("Hola que tal", 'x'));
	}
}
