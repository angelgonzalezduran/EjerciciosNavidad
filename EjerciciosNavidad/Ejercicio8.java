package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8)Crea un programa que introduzca valores, los guarde y los imprima por pantalla
		
		Scanner teclado = new Scanner(System.in) ;
		
		String nombre , poblacion ;
		
		int edad ;
		
		System.out.print("Dime como te llamas -> ");
		
		nombre = teclado.next() ;
		
		System.out.print("Dime tu edad -> ") ;
		
		edad = teclado.nextInt() ;
		
		System.out.print("Dime tu población -> ");
		
		poblacion = teclado.next() ;
		
		System.out.println("Te llamas " + nombre + " tienes " + edad + " años y vives en " + poblacion);
		
		teclado.close();
		
	}

}
