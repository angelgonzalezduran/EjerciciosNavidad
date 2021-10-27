package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6)Crea un programa que convierta pesetas en euros.
		
		Scanner teclado = new Scanner(System.in) ;
		
		int pesetas ;
		
		System.out.print("Introduzca una cantidad en pesetas -> ");
		
		pesetas = teclado.nextInt() ;
		
		System.out.println(pesetas + " son " + (pesetas / 166.386) + " euros");
		
		teclado.close();

	}

}
