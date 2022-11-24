package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	static double calculadora (int operando1, int operando2, int operacion) {
		
		double resultado=0;
		
		switch (operacion) {
		
		case 1 -> resultado = operando1 + operando2;
		
		case 2 -> resultado = operando1 - operando2;
		
		case 3 -> resultado = operando1 * operando2;
		
		case 4 -> resultado = operando1 / operando2;
		
		default -> System.out.println("Error al seleccionar que operacion llevar a cabo. ");
		
		}
		
		return (resultado);
	}

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		int numeroIntroducido2;
		
		int operacion;

		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero real: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.print("Introduzca otro numero real: ");
		
		numeroIntroducido2 = dogma.nextInt();
		
		System.out.println("Introduzca:\n1 Para sumar los numeros.\n2 Para restar los numeros\n3 Para multiplicar los numeros.\n4 Para dividir los numeros ");
		
		operacion = dogma.nextInt();
		
		System.out.println("El resultado de la operacion es: " + (calculadora (numeroIntroducido, numeroIntroducido2, operacion)));

		dogma.close();
		

	}

}
