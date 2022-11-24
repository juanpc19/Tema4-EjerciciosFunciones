package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Antes de llmar ver si 1 mayor que 2
	static int mayor (int numero1, int numero2) {
		
		int numeroMayor = numero1;
		
		if (numero1<numero2) {
			numeroMayor = numero2;
		}
		
		return (numeroMayor);
	}

	public static void main(String[] args) {

		int numeroIntroducido;
		
		int numeroIntroducido2;
		
		int numeroMayor;

		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroIntroducido2 = dogma.nextInt();
		
		numeroMayor = mayor (numeroIntroducido, numeroIntroducido2);
		
		System.out.println("El numero mas grande de los dos es: " + numeroMayor);
		
		dogma.close();
		
	}

}
