package cadenas.ej05a;

//Método que pida un carácter c y un número n y que devuelva una cadena con c repetido n veces.
public class Ej05 {

	public static String repite(char c, int veces) {
		String resu = "";
		for (int i = 1; i <= veces; i++) {
			resu += c;
		}
		return resu;
	}
	
	public static void main(String[] args) {
		System.out.println(repite('x', 7));
	}
}
