package cadenas.ej05b;

import cadenas.ej05a.StringUtil;

//Desarrolle un método llamado capitalize que ponga en mayúsculas cada palabra de una 
//   frase recibida como parámetro. 
//   Por ej: si se recibe “Congreso internacional de programación de String”, 
//   debe devolver, “Congreso Internacional De Programación De String”. 
//   Utilice Character.toUpperCase(char c)

// Se hizo en StringUtil
public class Ej06 {

	public static void main(String[] args) {
		System.out.println(StringUtil.capitalize("Congreso INTERNACIONAL De Programación De String"));
	}
}
