package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	static void rango (int numero1, int numero2) {
		
		while (numero1<=numero2) {
		System.out.println(numero1);
		numero1++;
		}
	}

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		int numeroIntroducido2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero del rango: ");

		numeroIntroducido = dogma.nextInt();
				
		System.out.print("Introduzca el segundo numero del rango: ");
			
		numeroIntroducido2 = dogma.nextInt();
				
		if (numeroIntroducido<numeroIntroducido2) {
		rango (numeroIntroducido, numeroIntroducido2);
		}
		
		else {
		rango (numeroIntroducido2, numeroIntroducido);
		}
				
		dogma.close();
	}

}
