package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//17)Crear un programa donde te pida tres numeros y calcule si la multiplicación 
		//de los dos primeros es igual al tercero.


		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2 , num3 ;
		
		System.out.print("Introduzca el primer numero -> ");
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca el segundo número -> ");
		
		num2 = teclado.nextInt() ;
		
		System.out.print("Introduzca el tercer número -> ");
		
		num3 = teclado.nextInt() ;
		
		if(num1 * num2 == num3) {
			
			System.out.println("Es válido");
			
		}
		else {
			
			System.out.println("Es inválido");
			
		}
		
		teclado.close();
	}

}
