package cadenas.ej05a;

//Método que sustituya mayúsculas por minúsculas y minúsculas por mayúsculas en una 
// frase. Utilizar Character.toUpperCase(char c) y Character.toLowerCase(char c).
public class Ej12 {
	public static String cambiaMayMin(String str) {
		String resu = "";
		char actual;
		for (int i = 0; i < str.length(); i++) {
			actual = str.charAt(i);
			if (Character.isLowerCase(actual))
				actual = Character.toUpperCase(actual);
			else
				actual = Character.toLowerCase(actual);
			
			resu += actual;
		}
		return resu;
	}
	
	public static void main(String[] args) {
		System.out.println("aeüIOuÑÉ_??: " + cambiaMayMin("aeüIOuÑÉ_??"));
	}
}
