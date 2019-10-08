import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad,por favor");
		
		int edad=entrada.nextInt();
		
		if (edad<18) {
			
			System.out.println("Usted es menor de edad");
		}
		
		else if (edad<40) {
			
			System.out.println("Usted es joven");
		}
		
		else if (edad<60) {
			
			System.out.println("Usted es maduro");
		}
		
		else {
			
			System.out.println("Piense en jubilarse");
		}

	}

}
