package cadenas.ej05a;

import com.cursojava.util.Consola;

//Pedir al usuario su nombre y saludarlo.
public class Ej01 {
	public static void main(String[] args) {
		String nombre = Consola.leerCadena("Ingresa tu nombre: ");
		System.out.println("Buen día " + nombre + ", bienvenido!!");
	}
}
