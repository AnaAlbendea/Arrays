package cadenas.ej05b;

//Desarrollar un método que reciba una cadena e inserte un carácter cada 3 caracteres. 
//  Por ejemplo: “1921680012” y ‘.’, debe retornar “192.168.001.2”
//	a. Haga otra versión del método, pero que reciba una cadena, un carácter y la 
//   cantidad de dígitos entre las que se debe insertar el carácter.
public class Ej05 {

	
	public static String inserta3(String ori) {
		String resu = "";
		for (int i = 1; i < ori.length(); i++) {
			if (i % 3 == 0)
				resu += '.';
			resu += ori.charAt(i);
		}
		return resu;
	}
	
	public static void main(String[] args) {
		System.out.println("1921680012" + ": " + inserta3("1921680012"));
		System.out.println("192168001200" + ": " + inserta3("192168001200"));
	}
}
