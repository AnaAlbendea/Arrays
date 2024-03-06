package cadenas.ej05a;

//Dada una cadena de entrada, comprobar si es una contraseña FUERTE o DÉBIL. 
//Se considera que una contraseña es fuerte si contiene 8 o más caracteres, 
//y entre ellos al menos hay una mayúscula, una minúscula, un signo de puntuación 
//y un dígito. Tener en cuenta los valores decimales de los caracteres UNICODE

//Si el texto fuese muy largo, no un password, este versión es muy ineficiente,
//recorre el texto caracter a caracter varias veces.
//Otra solucion en Ej21b
public class Ej21 {

	public static boolean passwordIsOk(String pass) {
		if (pass.length() < 8)
			return false;
		if (!tieneMayuscula(pass))
			return false;
		if (!tieneMinuscula(pass))
			return false;
		if (!tieneCaracterEspecial(pass))
			return false;
		if (!tieneDigito(pass))
			return false;
		return true;
	}
	
	//65 al 90
	public static boolean tieneMayuscula(String pass) {
		return contieneChar(pass, 65, 90);
	}
	
	//97 al 122
	public static boolean tieneMinuscula(String pass) {
		return contieneChar(pass, 97, 122);
	}
	
	//33 al 47 - 58 al 64 - 91 al 96
	public static boolean tieneCaracterEspecial(String pass) {
		return contieneChar(pass, 33, 47) ||
				contieneChar(pass, 58, 64) ||
				contieneChar(pass, 91, 96);
	}
	
	//48 al 57
	public static boolean tieneDigito(String pass) {
		return contieneChar(pass, 48, 57);
	}
	
	private static boolean contieneChar(String str, int c) {
		return contieneChar(str, c, c);
	}
	
	private static boolean contieneChar(String str, int desde, int hasta) {
		boolean contiene = false;
		for (int i = 0; i < str.length() && !contiene; i++) {
			if (str.charAt(i) >= desde && str.charAt(i) <= hasta)
				contiene = true;
		}
		return contiene;
	}
	
	public static void main(String[] args) {
		System.out.println(passwordIsOk("holaquetal"));
		System.out.println(passwordIsOk("Holaquetal"));
		System.out.println(passwordIsOk("HolaQueTal123"));
		System.out.println(passwordIsOk("HolaQueTal123_"));
	}
}
