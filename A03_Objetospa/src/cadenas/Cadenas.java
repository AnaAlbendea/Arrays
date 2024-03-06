package cadenas;


/*
 * Codigo Ejemplo
 * Ejemplo de metodos disponibles en la clase String
 * @author Pablo
 */


public class Cadenas{
	public static void main(String[] args){
		String cadena = "  Prueba Cadenas ";
		System.out.println("Contenido Original de cadena: \"" + cadena + "\"");
		System.out.println("Posicion de cada caracter:    \"" + "01234567890123456" + "\"");
		
		System.out.println("\ncadena.toUpperCase(): \"" + cadena.toUpperCase() + "\"");
		System.out.println("cadena.trim(): \"" + cadena.trim() + "\"");
		System.out.println("cadena.toLowerCase(): \"" + cadena.toLowerCase() + "\"");
		System.out.println("cadena.length(): " + cadena.length());
		System.out.println("cadena.charAt(2): \'" + cadena.charAt(2) + "\'");

		System.out.println("\ncadena.equals(\"  Prueba Cadenas \"): " + cadena.equals("  Prueba Cadenas "));
		System.out.println("cadena.equals(\"  prueba cadenas \"): " + cadena.equals("  prueba cadenas "));
		System.out.println("cadena.equals(\"Prueba Cadenas\"): " + cadena.equals("Prueba Cadenas") + "\n");

		System.out.println("cadena.equalsIgnoreCase(\"  Prueba Cadenas \"): " + cadena.equalsIgnoreCase("  Prueba Cadenas "));
		System.out.println("cadena.equalsIgnoreCase(\"  prueba cadenas \"): " + cadena.equalsIgnoreCase("  prueba cadenas "));
		System.out.println("cadena.equalsIgnoreCase(\"Prueba Cadenas\"): " + cadena.equalsIgnoreCase("Prueba Cadenas") + "\n");

		System.out.println("cadena.indexOf(\"Pru\"): " + cadena.indexOf("Pru"));
		System.out.println("cadena.indexOf(\"pru\"): " + cadena.indexOf("pru"));
		System.out.println("cadena.indexOf(\"Bru\"): " + cadena.indexOf("Bru"));
		System.out.println("cadena.indexOf(\"a\"): " + cadena.indexOf("a") + "\n");

		System.out.println("cadena.indexOf(\"Pru\", 2): " + cadena.indexOf("Pru", 2));
		System.out.println("cadena.indexOf(\"Pru\", 3): " + cadena.indexOf("Pru", 3));
		System.out.println("cadena.indexOf(\"pru\", 0): " + cadena.indexOf("pru", 0));
		System.out.println("cadena.indexOf(\"a\", 0): " + cadena.indexOf("a", 0));
		System.out.println("cadena.indexOf(\"a\", 8): " + cadena.indexOf("a", 8) + "\n");

		System.out.println("cadena.lastIndexOf(\"Pru\"): " + cadena.lastIndexOf("Pru"));
		System.out.println("cadena.lastIndexOf(\"pru\"): " + cadena.lastIndexOf("Bru"));
		System.out.println("cadena.lastIndexOf(\"a\"): " + cadena.lastIndexOf("a") + "\n");

		System.out.println("cadena.lastIndexOf(\"Pru\", 2): " + cadena.lastIndexOf("Pru", 2));
		System.out.println("cadena.lastIndexOf(\"Pru\", 3): " + cadena.lastIndexOf("Pru", 3));
		System.out.println("cadena.lastIndexOf(\"pru\", 16): " + cadena.lastIndexOf("pru", 16));
		System.out.println("cadena.lastIndexOf(\"a\", 5): " + cadena.lastIndexOf("a", 5));
		System.out.println("cadena.lastIndexOf(\"a\", 8): " + cadena.lastIndexOf("a", 8) + "\n");

		System.out.println("cadena.substring(2): \"" + cadena.substring(2) + "\"");
		System.out.println("cadena.substring(9): \"" + cadena.substring(9) + "\"\n");

		System.out.println("cadena.substring(2, 7): \"" + cadena.substring(2, 7) + "\"");
		System.out.println("cadena.substring(cadena.indexOf(\"C\"), 14): \"" + cadena.substring(cadena.indexOf("C"), 14) + "\"");
		System.out.println("cadena.substring(2, cadena.length()): \"" + cadena.substring(2, cadena.length()) + "\"");
		System.out.println("cadena.substring(8, 14): \"" + cadena.substring(8, 14) + "\"");
		System.out.println("cadena.substring(8, 14).trim(): \"" + cadena.substring(8, 14).trim() + "\"");
		System.out.println("cadena.substring(8, 14).trim().toUpperCase(): \"" + cadena.substring(8, 14).trim().toUpperCase() + "\"\n");

		System.out.println("cadena.replace(\"Prueba\", \"Probando\"): \"" + cadena.replace("Prueba", "Probando") + "\"");
		System.out.println("cadena.replace(\" \", \"\"): \"" + cadena.replace(" ", "") + "\"\n");
		
		
		System.out.println("Contenido final de cadena: \"" + cadena + "\"\n");

		
		cadena = "dato1,dato2,dato3maslargo,d4";
		String [] partes = cadena.split(",");
		System.out.println("cadena = \"" + cadena + "\";");
		System.out.println("String [] partes = cadena.split(\",\");");
		for (int i = 0; i < partes.length; i++) {
			System.out.println("partes[" + i + "]: " + partes[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
