package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5)Realizar un programa que intercambie los números introducidos.
		
		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2, num3 ;
		
		System.out.print("Introduzca un número -> ");
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca otro número -> ");
		
		num2 = teclado.nextInt() ;
		
		num3 = num1 ;
		
		num1 = num2 ;
		
		num2 = num3 ;
		
		System.out.println("Numero 1 -> " + num1 + ", numero 2 -> " + num2);
		
		teclado.close();
	}

}
