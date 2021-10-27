package EjerciciosNavidad;

public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//30)Crea un programa que contabilice y exprese por pantalla la cantidad de vocales que posee la frase cadena.
		
		String cadena = "La vida es bella" ;
		
		int contador = 0 ;
		
		for(int x = 0 ; x < cadena.length() ; x++) {
			if(cadena.charAt(x) == 'a' || cadena.charAt(x) == 'e' || cadena.charAt(x) == 'i' || cadena.charAt(x) == 'o' || cadena.charAt(x) == 'u'){
				
				contador ++ ;
			}
		}
		
		System.out.println("La cadena tiene " + contador + " vocales");
		

	}

}
