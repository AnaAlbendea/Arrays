package cadenas.ej05a;

//Método que retorne cuántas palabras de menos de 3 letras tiene una frase, 
//  considerando como separador de palabras únicamente el inicio de cadena, 
//  el espacio y el fin de cadena.
public class Ej14 {
	public static int cuentaPalabras(String frase) {
		if (frase == null || frase.length() == 0) {
			return 0;
		}
		int cont = 0;
		int hasta = 0;
		int desde = 0;
		do {
			hasta = frase.indexOf(' ', desde);
			if (hasta == -1) {
				hasta = frase.length();
			}
			if (frase.substring(desde, hasta).length() < 3)
				cont++;
			desde = hasta;
			desde++;
		} while (hasta != frase.length());
		return cont;
	}
	
	public static void main(String[] args) {
		System.out.println(cuentaPalabras("un dos tres cuatro uno as"));
	}
}
