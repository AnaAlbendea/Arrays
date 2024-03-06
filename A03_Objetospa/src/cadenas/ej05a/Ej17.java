package cadenas.ej05a;

//Método que elimina los caracteres en blanco al principio de una cadena. 
//No puedes usar trim.
//  a. Otro que elimine los caracteres en blanco finales de una cadena. No puedes usar trim.
//  b. Otro que quite los caracteres en blanco a la izquierda y a la derecha de una cadena. No puedes usar trim.
public class Ej17 {

	public static String trimLeft(String str) {
		while(str.charAt(0) == ' ')
			str = str.substring(1);
		return str;
	}
	
	public static String trimRight(String str) {
		while(str.charAt(str.length() - 1) == ' ')
			str = str.substring(0, str.length() - 1);
		return str;
	}

	public static String trim(String str) {
		return trimRight(trimLeft(str));
	}
	
	public static void main(String[] args) {
		System.out.println(trimLeft("   hola"));
		System.out.println(trimLeft("hola"));
		System.out.println();
		System.out.println(trimRight("hola   "));
		System.out.println(trimRight("hola"));
		System.out.println();
		System.out.println(trim("  hola   "));
		System.out.println(trim("hola"));
		System.out.println(" hola ".trim().equals(trim(" hola ")));
	}
}
