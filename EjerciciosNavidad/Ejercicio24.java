package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//24)Crea un programa que solicite unos números al usuario y que al introducir el usuario 0,
		//el programa se cierre expresando la cantidad de números que el usuario ha introducido
		
		Scanner teclado = new Scanner(System.in) ;
		
		int numero , contador = 0 ;

		do {
			System.out.print("Introduzca un número -> ");
			
			numero = teclado.nextInt() ;
			
			if(numero != 0) {
				
				contador++ ;
			}
			
		}while(numero != 0) ;
		
		System.out.println("El numero total de numeros introducidos es de -> " + contador);
		
		teclado.close();

	}

}
