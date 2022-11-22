package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	static void cilindro (int seleccion, double radio, double altura) {
		
		switch (seleccion) {
		
		case 1 -> System.out.print("El area es: " + 2*Math.PI*radio);
		
		case 2 -> System.out.print("El volumen es: " + Math.PI*Math.pow(radio,2)*altura);
		
		default -> System.out.print("Error al seleccionar");

		}
	}

	public static void main(String[] args) {

		double radio;
		
		double altura;
		
		int seleccion;
		
		Scanner dogma = new Scanner (System.in);
		
		System.out.print("Introduzca el radio de la base: ");
		
		radio = dogma.nextDouble();
		
		System.out.print("Introduzca la altura del cilindro: ");
		
		altura = dogma.nextDouble();
		
		System.out.print("Seleccione:\n1 para obtener el area del cilindro.\n2 para obtener el volumen del cilindro.");

		seleccion = dogma.nextInt();
		
		cilindro (seleccion, radio, altura);
		
		dogma.close();
		
	}

}
