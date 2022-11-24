package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
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

	 static int divisoresPrimos (int n) {
		 
		int c=0;
		 
		for (int i=n; i>1; i--) {
			 
			 
		   if (esPrimo (i)==true && n%i==0) {
			   c++;
		   }
		 }
		 
		  return (c);
	 }


	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		Scanner dogma= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero positivo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println("El número de divisores primos que tiene el numero introducido es: " + divisoresPrimos (numeroIntroducido));
		
		dogma.close();

		
		// En este usar funcion del 6 esPrimo dentro de la funcion de este ejercicio, 
		// y luego aparte la main pidiendo el resultado de la funcion de este ejercicio 

		
	}

}
