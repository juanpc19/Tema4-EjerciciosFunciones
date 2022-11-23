package ejercicios;

import java.util.Scanner;

public class Ejercicio5 { 
	
	static boolean vocal (String letra) {
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			return true;
			
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		String letra;
		
		Scanner dogma = new Scanner (System.in);
		
		System.out.println("Introduzca una letra: ");

		letra = dogma.nextLine();
		
		System.out.println(vocal (letra)); 
		
		dogma.close();
	}

}
