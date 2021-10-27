package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//7)Crea un programa para que al introducir dos números se realicen las cuatros
		//operaciones matemáticas.
		
		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2 ;
		
		System.out.print("Introduzca un primer número -> ");
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca otro número ->");
		
		num2 = teclado.nextInt() ;
		
		System.out.print("Suma -> " +suma(num1,num2));
		
		System.out.print("Resta -> " +resta(num1,num2));
		
		System.out.println("Multiplicación -> " + multiplicacion(num1 , num2));
		
		System.out.println("División -> " + division(num1, num2));
		teclado.close();

	}
	
	static int suma(int num1 , int num2) {
		
		
		return num2 + num1 ;
		
	}
	
	static int resta(int num1 , int num2) {
		
		if(num1 > num2) {
			
			return num1 - num2 ;
		}
		else {
			return num2 - num1 ;
		}
		
	}
	
	static int multiplicacion(int num1 , int num2) {
		
		
		return num2 * num1 ;
		
	}
	
	static int division(int num1 , int num2) {
		
		if(num1 > num2) {
			
			return num1 / num2 ;
		}
		else {
			return num2 / num1 ;
		}
		
	}
}
