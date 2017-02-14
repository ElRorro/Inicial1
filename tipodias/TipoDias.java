import java.util.Scanner;

public class TipoDias {
	
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in);
		String diasemana = "";
		System.out.println("Introduce un dia de la semana ");
		diasemana = teclado.next();
		
		switch(diasemana.toLowerCase()){
			case "sabado":
				System.out.println("El dia introducido no es entre semana");
				break;
			case "domingo":
			System.out.println("El dia introducido no es entre semana");
				break;
			case "sábado":
				System.out.println("El dia introducido no es entre semana");
				break;
			case "lunes":
				System.out.println("El dia introducido es entre semana");
				break;
			case "martes":
				System.out.println("El dia introducido es entre semana");
				break;
			case "miércoles":
				System.out.println("El dia introducido es entre semana");
				break;
			case "miercoles":
				System.out.println("El dia introducido es entre semana");
				break;
			case "jueves":
				System.out.println("El dia introducido es entre semana");
				break;
			case "viernes":
				System.out.println("El dia introducido es entre semana");
				break;
			default:
				System.out.println("Esa palabra no es un dia de la semana");
				break;
		}
	}
}

