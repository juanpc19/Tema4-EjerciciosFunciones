package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Para crear funcion nomenclatura camel	
	//Crear static void nombre y variables a usar como argumentos de entrada (cuantas veces hacer la funcion, datos, etc...)
	static void eco (int numero) {
		
		//En el bucle (o el bloque de instrucciones de turno) uso la variable de dentro de la funcion
		//a la que le doy valor en la funcion publica con numeroIntroducido
		for (int i=1; i<=numero; i++) {
		System.out.println ("eco...");
		}
	}
	public static void main(String[] args) {

		//Declaro variables
		int numeroIntroducido;
		
		//Creo escaner para recibir valor de variable (o se lo doy a mano)
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario numero de funciones eco a ejecutar
		System.out.print("Cuantas veces quiere llamar a la funcion eco? ");
		
		//Recojo valor con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Llamo a funcion eco y le doy valor con variable numeroIntroducido
		//Ejemplo: Para dar varios valores a la funcion eco DE FORMA ORDENADA, POR ORDEN DE ENTRADA! 
		//eco (numeroIntroducido, area, volumen);
		eco (numeroIntroducido);
		
		//Cierro escaner
		dogma.close();

	}

}
