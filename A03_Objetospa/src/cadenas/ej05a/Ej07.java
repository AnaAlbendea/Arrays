package cadenas.ej05a;

//Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, 
//   o indicar que no está si procede. No se puede usar indexOf o similar.
//a. Repite el ejercicio anterior, pero usando indexOf.
public class Ej07 {

	public static void busca(String cadena, char c) {
		boolean encontrado = false;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == c) {
				System.out.println(c + ": posicion " + i);
				encontrado = true;
			}
		}
		if (!encontrado)
			System.out.println("No esta el caracter " + c);
	}
	
	public static void buscaIndexOf(String cadena, char c) {
		boolean encontrado = false;
		int pos = 0;
		while((pos = cadena.indexOf(c, pos)) != -1) {
			System.out.println(c + ": posicion " + pos++);
			encontrado = true;
		}
		if (!encontrado)
			System.out.println("No esta el caracter " + c);
	}
	
	public static void main(String[] args) {
		busca("hola que tal", 'a');
		busca("hola que tal", 'm');
		System.out.println();
		buscaIndexOf("hola que tal", 'a');
		buscaIndexOf("hola que tal", 'm');
	}
}
