package cadenas.ej05a;

//Desarrollar una Clase StringUtil, que implemente los siguientes métodos:
//a. public static String insert(String cadena, String insertado, int pos)
//b. public static String delete(String cadena, int desde, int hasta)
//c. int indexOf(String cadena, String buscado)
//d. public static String replace(String cadena, String buscado, String reemplazo)
//e. public static String capitalize(String cadena)
//f. public static int cuentaPalabras(String cadena)
//g. public static int cuentaParrafos(String cadena)

public class StringUtil {

	public static void main(String[] args) {
		System.out.println(insert("algo", "xxx", 4));
		System.out.println(insert("algo", "xxx", 3));
		System.out.println(insert("algo", "xxx", 2));
		System.out.println(insert("algo", "xxx", 1));
		System.out.println(insert("algo", "xxx", 0));
		System.out.println();
		System.out.println(delete("algo que decir", 5, 8));
		System.out.println(delete("algo que decir", 0, 4));
		System.out.println(delete("algo que decir", 8, 13));
		System.out.println();
		System.out.println(indexOf("algo que decir", "que"));
		System.out.println(indexOf("algo que decir", "qui"));
		System.out.println();
		System.out.println(replace("algo que decir", " ", ""));
		System.out.println(replace("algo que decir", "e", "xxx"));
		System.out.println();
		System.out.println(capitalize("  A VER que   SUceDe  "));
		System.out.println();
		System.out.println(cuentaPartes("hola,que,,tal", ','));
		System.out.println();
		System.out.println(cuentaPalabras(" hola que   tal   "));
		System.out.println();
		String texto = """			
En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. 
Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.
El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino.
Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera.
Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza.
Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas verosímiles se deja entender que se llamaba Quijana. Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.""";
		
		System.out.println(texto);
		System.out.println("palabras: " + cuentaPalabras(texto));
		System.out.println("parrafos: " + cuentaParrafos(texto));
	}
	
	public static String insert(String cadena, String insertado, int pos) {
		return cadena.substring(0, pos) + insertado + cadena.substring(pos);
	}
	
	public static String delete(String cadena, int desde, int hasta) {
		return cadena.substring(0, desde) + cadena.substring(hasta + 1);
	}
	
	public static int indexOf(String cadena, String buscado) {
		return cadena.indexOf(buscado);
	}
	
	public static String replace(String cadena, String buscado, String reemplazo) {
		return cadena.replace(buscado, reemplazo);
	}
	
	public static String capitalize(String cadena) {
		cadena = cadena.trim().toLowerCase().replaceAll(" +", " ");
		cadena = Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1);
		int pos = 0;
		int ant = 0;
		while((pos = cadena.indexOf(' ', ant)) != -1) {
	  		cadena = cadena.substring(0, pos+1) + 
					Character.toUpperCase(cadena.charAt(pos + 1)) + 
					cadena.substring(pos + 2, cadena.length());
			ant = pos + 1;
		}
		return cadena;
	}
	
	public static int cuentaPalabras(String cadena) {
		return cuentaPartes(cadena.trim().replaceAll(" +", " "), ' ');
	}
	
	public static int cuentaParrafos(String cadena) {
		return cuentaPartes(cadena, '\n');
	}

	public static int cuentaPartes(String cadena, char separador) {
		int cant = 0;
		int pos = 0, ant = 0;
		while ((pos = cadena.indexOf(separador, ant)) != -1) {
			cant++;
			ant = pos + 1;
		}
		return cant + 1;
	}
}
