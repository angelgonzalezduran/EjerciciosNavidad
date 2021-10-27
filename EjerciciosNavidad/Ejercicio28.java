package EjerciciosNavidad;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//28)Crea un programa que imprima los numero del 0 al 100 con un salto de 6 entre cada numero
		
		for(int x = 0 ; x <= 100 ; x++) {
			
			if(x % 2 == 0 && x % 3 == 0) {
				
				System.out.println(x);
				
			}
			
		}

	}

}
