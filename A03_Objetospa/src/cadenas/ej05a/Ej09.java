package cadenas.ej05a;

//Método que reciba una cadena y la transforme sustituyendo todos los espacios por * 
//  (sin usar replace ni replaceAll).
public class Ej09 {

	public static String replaceAll(String str, char c, char reempl) {
		String resu = "";
		int pos = 0;
		int ant = 0;
		while ((pos = str.indexOf(c, ant)) != -1) {
			resu += str.substring(ant, pos) + reempl;
			ant = pos + 1;
		}
		resu += str.substring(ant);
		return resu;
	}
	
	public static String replaceEspAster(String str) {
		return replaceAll(str, ' ', '*');
	}
	
	public static void main(String[] args) {
		System.out.println(replaceAll("hoola", 'o', 'x'));
		System.out.println(replaceEspAster("esto es una   frase   "));
		
		System.out.println(replaceAll("hoola", ' ', 'x'));
		System.out.println(replaceEspAster("estonoesunafrase"));
	}
}
