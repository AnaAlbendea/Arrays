package cadenas;

public class StringIgualdad {

	public static void main(String[] args) {
		
//		Scanner tec = new Scanner(System.in);
//		System.out.print("texto: ");
//		String ingreso = tec.nextLine();

		String ingreso = "hola";
		
		String otro = "HOLA";
		otro = otro.toLowerCase();
//		String otro;
//		otro = "hola";
		
		System.out.println(ingreso);
		System.out.println(otro);
		
		if(ingreso == otro)
			System.out.println("== SI");
		else
			System.out.println("== NO");
		
		if(ingreso.equals(otro))
			System.out.println("equals SI");
		else
			System.out.println("equals NO");
		
	}
}
