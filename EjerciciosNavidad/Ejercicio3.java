package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3) Introduce el año de tu nacimiento para expresar por pantalla tu edad actual.
		
		Scanner teclado = new Scanner(System.in) ;
		
		int years;
		
		System.out.print("Introduceme tu año de nacimiento -> ");
		
		years = teclado.nextInt() ;
		
		System.out.println("Tienes " + (2021 - years)+" años.");
		
		teclado.close();
		

	}

}
