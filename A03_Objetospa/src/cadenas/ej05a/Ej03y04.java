package cadenas.ej05a;

import com.cursojava.util.Consola;

//3. Pedir al usuario una cadena y decir si empieza por el carácter ‘H’.
//4. Como el anterior, pero sin importar si es mayúscula o minúscula.
public class Ej03y04 {
	
	public static void main(String[] args) {
		String ingreso = Consola.leerCadena("Ingresa un texto: ");
		
		System.out.println("El texto ingresado " + (startsWith(ingreso, 'H') ? "" : "no ") + "comienza con H");

		System.out.println("El texto ingresado " + (startsWithIgnoreCase(ingreso, 'H') ? "" : "no ") + "comienza con H o h");

	}
	
	public static boolean startsWith(String cadena, char letra) {
		return cadena != null && cadena.charAt(0) == letra;
	}
	
	public static boolean startsWithIgnoreCase(String cadena, char letra) {
		return cadena != null && cadena.toLowerCase().charAt(0) == Character.toLowerCase(letra);
	}

}
