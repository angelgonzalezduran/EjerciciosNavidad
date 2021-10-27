package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in) ;
		
		int obj1 , obj2 ;
		
		
		System.out.print("Peso del primer objeto -> ");
		
		obj1 = teclado.nextInt() ;
		
		System.out.print("Peso del segundo objeeto -> ");
		
		obj2 = teclado.nextInt() ;
		
		if(obj2/4 == obj1) {
			
			System.out.println("Cumple con las especificaciones");
			
		}
		else {
			
			System.out.println("No cumple con las especificaciones");
			
		}
		
		teclado.close();
		
		
		
	}

}
