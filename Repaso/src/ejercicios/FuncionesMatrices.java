package ejercicios;

import java.util.Scanner;

public class FuncionesMatrices {

	public static void pedirMatriz(int matriz[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d)", i, j);
				matriz[i][j] = teclado.nextInt();

			}
		}
	}
//////

	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	
}
	public static boolean esDispersa(int matriz[][]) {
		boolean esDispersa=true;

		if (matriz.length!=matriz[0].length || matriz.length<=1 
				|| matriz==null) {
			return false;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length;j++) {
				if (matriz[i][j]!=0) {
					esDispersa = false;
					
				}
		}
		return esDispersa;
	
		}
	
	

	
