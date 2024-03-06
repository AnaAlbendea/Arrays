package cadenas.ej05b;

//Desarrollar un método que reciba una cadena y un carácter e inserte el carácter 
// entre cada letra de la cadena. 
//  Ej: “separar” y ’-’ debería retornar “s-e-p-a-r-a-r”
public class Ej04 {
	public static String separa(String str, char c) {
		String resu = "";
		for (int i = 0; i < str.length() - 1; i++) {
			resu += str.charAt(i) + "" + c;
		}
		return resu + str.charAt(str.length() - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(separa("separar", '-'));
	}
}
