package ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Definimos el array de 6*10
		int tabla[][] = new int[6][10];

		// Definimos el array que va a guardar el maximo de la tabla
		int tablaMax[] = new int[2];

		// Definimos el array que va a guardar el minimo de la tabla
		int tablaMin[] = new int[2];

		// Creación de variable max y min
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		// Le introducimos valores
		// Primero recorre la i hasta el valor total de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// En segundo lugar recorre las jumnas de cada i
			for (int j = 0; j < tabla[i].length; j++) {
				// Rellena la posición con los siguientes valores
				tabla[i][j] = (int) (Math.random() * 1000 + 1);

			}
		} // Fin de bucle

		// Primero recorre la i hasta el valor total de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// En segundo lugar recorre las jumnas de cada i
			for (int j = 0; j < tabla[i].length; j++) {
				// Calcula el máximo comparando el array con el valor del máximo
				if (tabla[i][j] > maximo) {
					// Le asigna la posición de la i y la j y la guarda en la tabla max
					tablaMax[0] = i;
					tablaMax[1] = j;
					// Le da el valor de la tabla a max
					maximo = tabla[i][j];
				}
				// Calcula el mínimo comparando el array con el valor del máximo
				if (tabla[i][j] < minimo) {
					// Le asigna la posición de la i y la j y la guarda en la tabla min
					tablaMin[0] = i;
					tablaMin[1] = j;
					// Le da el valor de la tabla a min
					minimo = tabla[i][j];
				}
			}
		} // Fin de bucle

		// Muestra la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Recorre la jumna teniendo en cuenta la longitud de la i
			for (int j = 0; j < tabla[i].length; j++) {
				// Imprime la tabla mediante tabuladores
				System.out.print(tabla[i][j] + " ");
			}
			// Imprime un espacio
			System.out.println();

		}

		// Muestra el máximo y mínimo
		System.out.print("Máximo: ");
		System.out.println(Arrays.toString(tablaMax));
		System.out.print("Mínimo: ");
		System.out.println(Arrays.toString(tablaMin));

	}

}
