package ejercicios;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Tabla inicializada con los valores del ejercicio
				int tabla[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
				
				// Variable auxiliariliar intermedia
				int auxiliar;
				
				for(int i=0; i<tabla.length; i++) {
					for(int j=i; j<tabla[i].length; j++) {
						// intercambiamos las posiciones
						auxiliar = tabla[i][j];
						tabla[i][j] = tabla[j][i];
						tabla[j][i] = auxiliar;
					}
				}
				
				System.out.println(Arrays.deepToString(tabla));

	}

}
