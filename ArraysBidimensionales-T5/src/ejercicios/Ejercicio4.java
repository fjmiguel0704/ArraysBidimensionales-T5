package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Definimos el array de 3x6
		int tabla[][] = new int[3][6];

		// Vamos asignando a cada posición su valor correspondiente
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;

		tabla[1][0] = 75;
		tabla[1][4] = 0;

		tabla[2][5] = 11;
		tabla[2][3] = 9;
		tabla[2][2] = -2;

		// Mostramos el resultado de la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}

			System.out.println();
		}
	}

}
