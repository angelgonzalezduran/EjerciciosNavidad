package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12)Crea un programa que al introducir un valor te diga si es apto o no
		
		int resistencia ;

		Scanner teclado = new Scanner(System.in) ;
		
		System.out.print("Introduzca la resistencia del material -> ");
		
		resistencia = teclado.nextInt() ;
		
		if(resistencia >= 100) {
			
			System.out.println("El material es apto");
		}
		else {
			
			System.out.println("El material no es apto");
		}
		
		teclado.close();

	}

}
