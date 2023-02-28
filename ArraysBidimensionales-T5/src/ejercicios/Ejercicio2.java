package ejercicios;

/**
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las
 * tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una fila).
 * Luego mostrará la matriz por pantalla
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Definimos el array de 10x10
		int tabla[][] = new int[10][10];

		// Recorremos filas y columnas, donde se irán rellenando según los cálculos de
		// multiplicar ambas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}

		// Mostramos cpmo quedaría la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("\t" + tabla[i][j] + " ");
			}

			System.out.println();
		}
	}

}
