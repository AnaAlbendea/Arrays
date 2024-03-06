package cadenas.ej05a;

//Método que reciba dos cadenas y las junte carácter a carácter. Es decir, si recibe 
//  “pata” y “coco” el resultado es “pcaotcao”. Las cadenas tienen que ser del mismo tamaño.
//   a. Mejorar el anterior para que no importe que las palabras sean de distinto tamaño.
//      Es decir, si recibe “patata” y “coco” el resultado sería “pcaotcaota”,
//      añadiendo la cadena sobrante directamente al final.
public class Ej15 {

	public static String intercalaIgual(String s1, String s2) {
		String resu = "";
		for (int i = 0; i < s1.length(); i++) {
			resu += s1.charAt(i) + "" + s2.charAt(i);
		}
		return resu;
	}

	public static String intercala(String s1, String s2) {
		String resu = "";
		int mayor = Math.max(s1.length(), s2.length());
		for (int i = 0; i < mayor; i++) {
			resu += (i < s1.length() ? s1.charAt(i) : "") +
					"" +
					(i < s2.length() ? s2.charAt(i) : "");
		}
		return resu;
	}

	public static void main(String[] args) {
		System.out.println(intercalaIgual("pata", "coco"));
		System.out.println(intercala("pata", "coco"));
		System.out.println(intercala("patata", "coco"));
		System.out.println(intercala("coco", "patata"));
	}
}
