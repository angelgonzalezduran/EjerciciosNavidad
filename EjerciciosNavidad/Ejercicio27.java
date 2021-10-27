package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//27)Crea un programa que pida cúantos números aleatorios necesitas y que lo imprima por pantalla
		
		Scanner teclado = new Scanner(System.in) ;
		
		int aleatorios;
		
		System.out.print("Dime cuantos numeros aleatorios quieres -> ");
		
		aleatorios = teclado.nextInt() ;
		
		for(int x = 0 ; x < aleatorios ; x ++) {
			
			System.out.println( x+1 + " -> " + (int) (Math.random()*99 + 1));
			
		}
		
		teclado.close();

	}

}
