package EjerciciosNavidad;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumatorio = 0 ;
		
		for(int x = 0 ; x <= 100 ; x++) {
			
			sumatorio = (int) (sumatorio + Math.pow(x , 2)) ;
		}
		
		System.out.println(sumatorio);
	}

}
