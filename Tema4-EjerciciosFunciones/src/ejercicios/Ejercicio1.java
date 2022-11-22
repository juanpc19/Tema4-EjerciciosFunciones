package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	static void eco (int numero) {
		for (int i=1; i<=numero; i++) {
		System.out.println ("eco...");
		}
	}
	public static void main(String[] args) {

		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Cuantas veces quiere llamar a la funcion eco? ");
		
		numeroIntroducido = dogma.nextInt();
		
		eco (numeroIntroducido);
		
		dogma.close();

	}

}
