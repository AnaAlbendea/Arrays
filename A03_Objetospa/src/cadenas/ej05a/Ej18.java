package cadenas.ej05a;

//Método que reciba una cadena de caracteres, donde en lugar de ñ se han utilizado 
//  los caracteres ny. Crear una nueva cadena de caracteres sustituyendo ny por ñ. 
//  No puedes usar replace.
public class Ej18 {

	public static String replaceAll(String str, String bus, String reempl) {
		String resu = "";
		int pos = 0;
		int ant = 0;
		while ((pos = str.indexOf(bus, ant)) != -1) {
			resu += str.substring(ant, pos) + reempl;
			ant = pos + 1;
		}
		if (ant == 0)
			resu = str;
		else
			resu += str.substring(ant+bus.length()-1);
		return resu;
	}

	public static String reemplazaNY(String str) {
		return replaceAll(str, "ny", "ñ");
	}
	
	public static void main(String[] args) {
		System.out.println(reemplazaNY("anyo"));
		System.out.println(reemplazaNY("peldanyo"));
		System.out.println(reemplazaNY("nyu"));
		System.out.println(reemplazaNY("any"));
		System.out.println(reemplazaNY("escalon"));
	}
}
