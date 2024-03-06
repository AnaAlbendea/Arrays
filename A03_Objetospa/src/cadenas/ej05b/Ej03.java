package cadenas.ej05b;

//Desarrollar un método que, dada una cadena, retorne su sigla, es decir, la primera 
// letra de cada palabra en mayúsculas. 
//Por ejemplo, si recibe ’Universal serial bus’ debe devolver ’USB’.
public class Ej03 {

	public static String sigla(String ori) {
		ori = ori.trim().toUpperCase().replaceAll(" +", " ");
		String sigla = ori.charAt(0) + "";
		int pos = 0;
		while ((pos = ori.indexOf(' ', pos)) != -1) {
			sigla += ori.charAt(pos+1);
			pos ++;
		}
		return sigla;
	}
	
	public static void main(String[] args) {
		System.out.println("Universal serial bus: " + sigla("Universal serial bus"));
	}
}
