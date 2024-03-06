package cadenas.ej05a;

//Método que reciba una cadena y retorne el número de vocales que contiene.
public class Ej08 {

	public static int cuentaVocalesDistintas(String str) {
		int cant = 0;
		String vocales = "aeiou";
		for (int i = 0; i < vocales.length(); i++) {
			if (str.indexOf(vocales.charAt(i)) != -1)
				cant++;
		}
		return cant;
	}
	
	public static int cuentaVocalesConRepeticion(String str) {
		int cant = 0;
		String vocales = "aeiou";
		for (int i = 0; i < vocales.length(); i++)
			cant += cuentaRepeticioCaracter(str, vocales.charAt(i));
		return cant;
	}
	
	public static int cuentaRepeticioCaracter(String str, char c) {
		int cant = 0;
		int pos = 0;
		while((pos = str.indexOf(c, pos)) != -1) {
			cant++;
			pos++;
		}
		return cant;
	}
	
	public static void main(String[] args) {
		System.out.println("murcielago " + cuentaVocalesDistintas("murcielago"));
		System.out.println("pepe sin rep. " + cuentaVocalesDistintas("pepe"));
		System.out.println("pepe con rep. " + cuentaVocalesConRepeticion("pepe"));
		System.out.println("paralelepipedo " + cuentaVocalesConRepeticion("paralelepipedo"));

		System.out.println("rstv " + cuentaVocalesDistintas("rstv"));
		System.out.println("rstv " + cuentaVocalesConRepeticion("rstv"));

	}
}
