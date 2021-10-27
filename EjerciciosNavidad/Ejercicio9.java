package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado =  new Scanner(System.in) ;
		
		Scanner teclado2 =  new Scanner(System.in) ;
		
		int numero ;
		
		char letra ;
		
		float dec ;
		
		String frase ;
		
		System.out.print("Número -> ");
		
		numero = teclado.nextInt() ;
		
		System.out.print("letra -> ");
		
		letra = teclado.next().charAt(0); ;
		
		System.out.print("Decimal -> ");
		
		dec = teclado2.nextFloat() ;
		
		System.out.print("Cadena -> ");
		
		frase = teclado2.next() ;
		
		System.out.println(numero + " " + dec + " " + letra + " " + frase);
		
		teclado.close();
		
		teclado2.close();	
	}

}

