package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4)Introduzca una cantidad de Km para pasarlas a metros
		Scanner teclado = new Scanner(System.in) ;
		
		int km ;
		
		System.out.print("Introduzca una cantidad de Kilómetros -> ");
		
		km = teclado.nextInt() ;
		
		System.out.println(km + " KM son -> " + 1000 * km+ " metros.");
		
		teclado.close();

	}

}
