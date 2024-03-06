package arrays.ej06;

//Realizar un método para validar un DNI. Recibe como parámetro un String que 
//  contiene un número de DNI con su letra.
//  Para validarlo se debe calcular la letra a partir del número. El resto de 
//  dividir el número por 23, se obtendrá un valor entre 0 y 22 y esto números se 
//  asocian a una letra.

public class Ej10 {

	final static char[] LETRAS = 
	 {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
//	final static String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static boolean isValidDni(String dni) {
		dni = preparaDni(dni);
		if (!isFormatoCorrecto(dni))
			return false;
		int nro = Integer.parseInt(dni.substring(0, dni.length()-1));
		char letra = dni.charAt(dni.length() - 1);
		return letra == LETRAS[nro % 23];
	}
	
	
	static boolean isFormatoCorrecto(String dni) {
		boolean correcto = true;
		for (int i = 0; i < dni.length() - 1; i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				correcto = false;
			}
		}
		return dni.length() <= 9 && correcto && Character.isAlphabetic(dni.charAt(dni.length()-1));
	}
	
	static String preparaDni(String dni) {
		return dni.replace(" ", "").replace("-", "").toUpperCase();
	}

	public static void main(String[] args) {
		System.out.println(isValidDni("123456 - s"));
	}
}
