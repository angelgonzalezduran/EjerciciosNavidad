package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio13 {

	//13) Introduzca su edad para comprobar si usted es mayot o menor de edad.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad ;

		Scanner teclado = new Scanner(System.in) ;
		
		System.out.print("Introduzca su edad -> ");
		
		edad = teclado.nextInt() ;
		
		if(edad >= 18) {
			
			System.out.println("Eres mayor de edad");
		}
		else {
			
			System.out.println("Eres menor de edad");
		}
		
		teclado.close();
	}

}
