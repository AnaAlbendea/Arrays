package cadenas.ej05a;

import com.cursojava.util.Consola;

//Programa que diga si una cadena dada por el usuario está o no vacía.
public class Ej02 {
	
	public static void main(String[] args) {
		String ingreso = Consola.leerCadena("Ingresa un texto: ");
		
		System.out.println("El texto ingresado " + (isEmpty(ingreso) ? "" : "no ") + "está vacío");
		
		String algo = null;

		System.out.println(isEmpty(algo));
	}
	
	public static boolean isEmpty(String cadena) {
		return cadena == null || cadena.length() == 0;
	}
}
