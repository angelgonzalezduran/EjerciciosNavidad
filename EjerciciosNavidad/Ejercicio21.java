package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in) ;
		
		int numero, sumatorio = 0 ;
		
		System.out.print("Dime un numero de inicio -> ");
		
		numero = teclado.nextInt() ;
		
		for(int x = numero ; x <= numero + 100 ; x++) {
			
			sumatorio = sumatorio + x ;
			
		}
		
		System.out.println("La suma total es " + sumatorio);
		
		teclado.close() ;

	}

}
