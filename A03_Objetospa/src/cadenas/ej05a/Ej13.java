package cadenas.ej05a;

//Método que reciba una cadena y comprueba si el balanceo de paréntesis es correcto 
//  (se abren y se cierran correctamente).
public class Ej13 {
	public static boolean validaParentesis(String expr) {
		boolean correcto = true;
		int parentesis = 0;
		for (int i = 0; i < expr.length() && correcto; i++) {
			if (expr.charAt(i) == '(')
				parentesis++;
			if (expr.charAt(i) == ')')
				parentesis--;
			if (parentesis < 0)
				correcto = false;
		}
		return correcto && parentesis == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(validaParentesis(")("));
		System.out.println(validaParentesis("((((zsdf)asd)asdf(ad)))ad()"));
	}
}
