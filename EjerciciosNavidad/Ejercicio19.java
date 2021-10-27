package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//19)Crea un programa que pida dos números y muestre por pantalla todos los números
		//que hay entre el número más pequeño y el número más grande introducido
		
		
		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2 ;
		
		System.out.print("Introduzca un número -> ") ;
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca otro número -> ") ;
		
		num2 = teclado.nextInt() ;
		
		if(num1 >= num2) {
			
			for(int x = num2 ; x <= num1 ; x++) {
				
				System.out.println(x);
				
			}
			
		}
		else {
			
			for(int x = num1 ; x <= num2 ; x++) {
				
				System.out.println(x);
				
			}
			
		}
		
		teclado.close();
	}

}
