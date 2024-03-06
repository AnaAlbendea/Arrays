package cadenas.ej05a;

public class Ej06 {

	public static void separa(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		separa("Hola que tal");
	}

}
