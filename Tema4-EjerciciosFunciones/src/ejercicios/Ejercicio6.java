package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	static boolean esPrimo (int n) {
		
		boolean esPrimo=true;
		
		if (n==1) {
			esPrimo=false;
		
		} else {
		
		for (int i=2; i<n; i++) {
			
			  if (n%i==0) {
				esPrimo=false;
					break;	
			  	}
			}
		}
		
		return esPrimo;
	}

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		Scanner dogma= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero positivo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println(esPrimo(numeroIntroducido) ? "El numero introducido es primo. " : "El numero introducido no es primo. ");
		
		dogma.close();

	}

}
