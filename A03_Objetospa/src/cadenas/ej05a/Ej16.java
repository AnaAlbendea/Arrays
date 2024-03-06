package cadenas.ej05a;

//Método que cuente el número de veces que aparece un carácter en una cadena.
public class Ej16 {

	public static int cuenta(String str, char c) {
		int cont = 0;
		int pos = 0;
		while((pos = str.indexOf(c, pos)) != -1) {
			cont++;
			pos++;
		}
		return cont;
	}
	
	public static void main(String[] args) {
		System.out.println(cuenta("patata", 'a'));
		System.out.println(cuenta("patata", 't'));
		System.out.println(cuenta("patata", 'p'));
		System.out.println(cuenta("patata", 'x'));
	}
}
