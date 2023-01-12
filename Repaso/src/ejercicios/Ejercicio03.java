package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Ejercicio 3. Desarrollar un programa en el que se pida al usuario una matriz de 
		//dimensiones N ×M y compruebe si la matriz es simétrica. (Los elementos de la matriz 
		//		(i, j) y (j, i), si existen, son iguales).
		
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

	}

}
