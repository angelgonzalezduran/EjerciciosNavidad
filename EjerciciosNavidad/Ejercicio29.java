package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//29)Crea un programa que solicite un número mayor o igual que cero.
		
		
		Scanner teclado = new Scanner(System.in) ;
		
		int numero ;
		
		do {
			
			System.out.print("Dime un numero mayor o igual que 0 -> ");
			
			numero = teclado.nextInt() ;
			
			if(numero <= 0) {
				
				System.out.println("Numero no válido") ;
			}
			
		}while(numero <= 0) ;
		
		System.out.println(numero + " Es correcto");
		
		teclado.close();

	}

}
