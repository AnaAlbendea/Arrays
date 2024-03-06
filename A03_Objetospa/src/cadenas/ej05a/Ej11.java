package cadenas.ej05a;

//Pedir una frase y eliminar las vocales. No se puede usar replace ni replaceAll.
//  a. Repite el ejercicio anterior usando replace
public class Ej11 {
	public static String eliminaVocales(String str) {
		String resu = str;
		String vocales = "aeiou";
		for (int i = 0; i < vocales.length(); i++) {
			resu = replaceAll(resu, "" + vocales.charAt(i), "");
		}
		return resu;
	}
	
	public static String eliminaVocalesReplaceAll(String str) {
		String resu = str;
		String vocales = "aeiou";
		for (int i = 0; i < vocales.length(); i++) {
			resu = resu.replaceAll("" + vocales.charAt(i), "");
		}
		return resu;
	}
	
	public static String replaceAll(String str, String bus, String reempl) {
		String resu = "";
		int pos = 0;
		int ant = 0;
		while ((pos = str.indexOf(bus, ant)) != -1) {
			resu += str.substring(ant, pos) + reempl;
			ant = pos + 1;
		}
		if (ant == 0)
			resu = str;
		else
			resu += str.substring(ant+bus.length()-1);
		return resu;
	}

	public static void main(String[] args) {
		System.out.println(replaceAll(" hola que tal ", " ", ""));
		System.out.println(replaceAll(" hola que tal ", "que", "x"));
		System.out.println(replaceAll(" hola que tal ", "que", "mas largo"));
		System.out.println(replaceAll(" hola que tal ", "xxx", "mas largo"));
		
		System.out.println(eliminaVocales("murcieeelago"));
		System.out.println(eliminaVocales("rstv"));

		System.out.println(eliminaVocalesReplaceAll("murcieeelago"));
		System.out.println(eliminaVocalesReplaceAll("rstv"));
		
		
	}
}
