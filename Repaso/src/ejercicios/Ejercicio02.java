package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Ejercicio 2. Desarrollar un programa en el que se pida al usuario una matriz de
		//dimensiones N ×M, y compruebe si la matriz es dispersa. 
		//(Todos las filas y todas las columnas contienen al menos un elemento nulo).
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número de Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Introduzca el número de Columnas: ");
		int columnas = teclado.nextInt();
		
		System.out.println("Introduce los datos de la matriz");
		int matriz[][] = new int[filas][columnas];
		//función pedir datos
		FuncionesMatrices.pedirMatriz(matriz);
		
		//función mostrar matriz.
		System.out.println("Su matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		// decir si la matriz es dispersa o no = devolver verdadero o falso
		//función es dispersa
		
		boolean esDispersa = FuncionesMatrices.esDispersa(matriz);
		if (esDispersa) {
			System.out.println("No es Una matriz Dispersa");
		} else {
			System.out.println("ES es una matriz dispersa");
		}
		
		
		
		
	}
	

}
