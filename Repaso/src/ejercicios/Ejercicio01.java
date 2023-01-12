package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	private static final String FuncionesVector = null;

	public static void main(String[] args) {


		// Ejercicio 1. Desarrollar un programa en el que se pida al usuario un vector de 
		//números enteros e indique en pantalla cuantos de dichos elementos son números impares.
		
		Scanner teclado= new Scanner(System.in);
;
		int longitud;
		int vector[];
		
		System.out.println("Introduzca los elementos que desea: ");
		 longitud=teclado.nextInt();
		
		System.out.println("Introduzca el valor de los elementos: ");
		
		//le doy memoria al vector

		vector= new int [longitud];
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Su vector es: ");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("Los números impares son: ");
		
		
		
		
	

	}

}
