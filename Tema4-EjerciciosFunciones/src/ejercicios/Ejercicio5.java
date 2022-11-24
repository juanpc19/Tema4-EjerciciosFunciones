package ejercicios;

import java.util.Scanner;

public class Ejercicio5 { 
	
	static boolean vocal (String letra) {
		
		boolean resultado = false;
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			resultado = true;	
		} 
			
		return (resultado);
	}

	public static void main(String[] args) {
		
		String letra;
		
		Scanner dogma = new Scanner (System.in);
		
		System.out.println("Introduzca una letra: ");

		letra = dogma.nextLine();
		
		System.out.println((vocal (letra))? "La letra introducida es una vocal. " : "La letra introducida no es una vocal. "); 
		
		dogma.close();
	}

}
