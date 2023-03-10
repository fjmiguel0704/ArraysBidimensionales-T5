package ejercicios;

import java.util.Scanner;

/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
 * notas por teclado y luego el programa mostrará la tabla con las notas. A
 * continuación, mostrará la nota mínima, máxima y media de cada alumno
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Definimos el array de 4x5
		int tabla[][] = new int[4][5];

		// Guardará las notas de cada uno de los alumnos
		int notas;

		// Recorremos filas y columnas, donde iremos preguntando cada una de las notas
		// del alumno y las iremos guardando en la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce las notas de los alumos:");
			for (int j = 0; j < tabla[i].length; j++) {
				notas = read.nextInt();
				tabla[i][j] = notas;
			}
		}

		// Mostramos la tabla de notas
		System.out.println("Tabla de notas:");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		// Recorremos de nuevo las filas y columnas de la tabla e iremos comprobando
		// cual es la nota más baja y mas alta y calculamos la media de todas las notas
		for (int i = 0; i < tabla.length; i++) {
			int max = 0;
			int min = 10;
			int media = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] > max) {
					max = tabla[i][j];
				}

				if (tabla[i][j] < min) {
					min = tabla[i][j];
				}

				media += tabla[i][j];
			}

			// Finalmente mostramos nota mas baja, mas alta y nota media
			media = media / tabla[i].length;
			System.out.println("Nota mínima: " + (i + 1) + min);
			System.out.println("Nota máxina: " + (i + 1) + max);
			System.out.println("Nota media: " + (i + 1) + media);
		}

	}

}
