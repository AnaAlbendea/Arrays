package arrays.ej06;

//Desarrollar un programa que se ejecute de la siguiente manera: 
//   java … paquetes.Ej09 usuario password 
//   Y verifique si el usuario existe en un array y si su password coincide con el 
//   del usuario que estará cargado en otro array en la misma posición. 
public class Ej09 {

	static String[] users = {"root", "admin", "pepito"};
	static String[] pass = {"root_x", "admin_x", "pepito_x"};
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Debe ejecutar 'java arrays.ej06.Ej09 <usr> <pwd>");
			return; //finaliza el programa
		}
		int pos = buscaUsr(args[0]);
		if (pos == -1) {
			System.out.println("Usuario " + args[0] + " inexistente!!");
			return;
		}
		if (!pass[pos].equals(args[1])) {
			System.out.println("El password es incorrecto");
			return;
		}
		System.out.println("Bienvenido " + args[0] + " te has identificado correctamente.");
		System.out.println("menu...");

	}
	
	public static int buscaUsr(String usr) {
		int pos = -1;
		int i = 0;
		while (i < users.length && pos == -1) {
			if (users[i].equals(usr))
				pos = i;
			i++;
		}
		return pos;
	}
}
