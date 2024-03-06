package cadenas.ej05a;

//Dada una cadena de entrada, comprobar si es una contraseña FUERTE o DÉBIL. 

//Se considera que una contraseña es fuerte si contiene 8 o más caracteres, 
//y entre ellos al menos hay una mayúscula, una minúscula, un signo de puntuación 
//y un dígito. Tener en cuenta los valores decimales de los caracteres UNICODE

public class Ej21b {

	public static boolean passwordIsOk(String pass) {
		if (pass.length() < 8)
			return false;
		boolean dig = false, may = false, min = false, esp = false, fuerte = false;
		for (int i = 0; i < pass.length() && !fuerte; i++) {
			char c = pass.charAt(i);
			if (esCaracterEspecial(c))
				esp = true;
			if (esDigito(c))
				dig = true;
			if (esMayuscula(c))
				may = true;
			if (esMinuscula(c))
				min = true;
			fuerte = esp && dig && may && min;
		}
		return fuerte;
	}

	// 65 al 90
	public static boolean esMayuscula(char c) {
		return esChar(c, 65, 90);
	}

	// 97 al 122
	public static boolean esMinuscula(char c) {
		return esChar(c, 97, 122);
	}

	// 33 al 47 - 58 al 64 - 91 al 96
	public static boolean esCaracterEspecial(char c) {
		return esChar(c, 33, 47) || esChar(c, 58, 64) || esChar(c, 91, 96);
	}

	// 48 al 57
	public static boolean esDigito(char c) {
		return esChar(c, 48, 57);
	}

	private static boolean esChar(char c, int desde, int hasta) {
		return c >= desde && c <= hasta;
	}

	public static void main(String[] args) {
		System.out.println(passwordIsOk("holaquetal"));
		System.out.println(passwordIsOk("Holaquetal"));
		System.out.println(passwordIsOk("HolaQueTal123"));
		System.out.println(passwordIsOk("HolaQueTal123_"));
	}
}
