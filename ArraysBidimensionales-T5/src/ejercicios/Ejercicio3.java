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
		Scanner read = new Scanner (System.in);
		
		int tabla [][]=new int[4][5];
		int notas;
		
		for (int i = 0; i<tabla.length; i++) {
			System.out.println("Introduce las notas de los alumos:");
			for (int j = 0; j<tabla[i].length;j++) {
				notas=read.nextInt();
			}
		}
	}

}
