package ejercicios;

import java.util.Scanner;

public class FuncionesVectores {
	

		
			// función para pedir un vector tipo int
		
		public static void pedirVector (int vector []) {
		
			Scanner teclado =new Scanner (System.in);
			
			for (int i=0; i<vector.length; i++){	
				System.out.printf("Introduce el elemento: %d\n",i);
				vector[i]=teclado.nextInt();
		}
	}
			//función para mostrar un vector tipo int
		
		public static void mostrarVector (int vector[]) {
			for ( int i=0; i<vector.length; i++) {
				System.out.printf("%d ", vector[i]);
			}
			System.out.println();
		}
			//fucnión que devueve los impres de vector tipo int
		
			public static int devuelveImpares(int vector[]) {
				
			int impar =vector[0]; //mete los datos impares en otro vector llamado impar
				
				for (int i=0; i<vector.length; i++);
				 	if ((vector[0])%2 !=0) {
				 		impar= vector[i];
				 	System.out.print(impar+ " ");
				
				
			}
		}
	Return impar;		
		
}
