package cadenas.ej05b;

//Desarrollar un método que reciba una cadena y retorne otra con la original invertida.
public class Ej01 {

	public static String invierte(String str) {
		String inv = "";
		for (int i = 0; i < str.length(); i++) {
			inv = str.charAt(i) + inv;
		}
		return inv;
	}
	
	public static void main(String[] args) {
		System.out.println(invierte("hola"));
	}
}
