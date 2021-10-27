package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//25)Crea un programa que al introducir el día de la semana, este te diga si es laborable o no
		
		Scanner teclado = new Scanner(System.in) ;
		
		int menu ;
		do {
			
			System.out.println("---------------------------------------");
			System.out.println("1: lunes");
			System.out.println("2: martes");
			System.out.println("3: miercoles");
			System.out.println("4: jueves");
			System.out.println("5: viernes");
			System.out.println("6: sabado");
			System.out.println("7: domingo");
			System.out.println("---------------------------------------");
			System.out.print("-> ");
			menu = teclado.nextInt() ;
			
		}while(menu < 1 || menu > 7 ) ;
		
		switch (menu) {
		case 1:
			
			System.out.println("Es laborable");
			
			break;

		case 2:
			
			System.out.println("Es laborable");
			
			break;
			
		case 3:
			
			System.out.println("Es laborable");
			
			break;
			
		case 4:
			
			System.out.println("Es laborable");
			
			break;
			
		case 5:
			
			System.out.println("Es laborable");
			
			break;
			
		case 6:
			
			System.out.println("No es laborable");
			break;
			
		case 7:
			
			System.out.println("No es laborable");
			
			break;
		}
		
		teclado.close();
	}

}
