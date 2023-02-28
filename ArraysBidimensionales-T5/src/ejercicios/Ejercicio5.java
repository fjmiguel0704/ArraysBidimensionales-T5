package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Definimos el array de 4x5
		int tabla[][] = new int[4][5];

		// Guardará la suma de cada una de las filas
		int sumaFila = 0;

		// Guardará la suma de cada una de las columnas
		int sumaColumna = 0;

		// Guardará la suma de todos los valores de la tabla
		int sumaTotal = 0;

		// Recorremos la tabla y la rellenamos con números aleatorios entre 100 y 999
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * (999 - 100 + 1) + 100);
			}
		}

		// Recorremos las filas una a una y agregamos a ellas la suma total de cada uno
		// de sus valores. Mostramos el resultado de la tabla
		for (int i = 0; i < tabla.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println("|" + sumaFila);
		}

		// Recorremos las columnas una a una y agregamos a ellas la suma total de cada
		// uno de sus valores. Calculamos también la suma total de todos los valores de
		// la tabla, sumando todos los valores de la última fila generada y agregando la
		// suma total. Mostramos el resultado de la tabla
		for (int j = 0; j < tabla[0].length; j++) {
			sumaColumna = 0;
			for (int i = 0; i < tabla.length; i++) {
				sumaColumna += tabla[i][j];
				sumaTotal += tabla[i][j];
			}
			System.out.print(sumaColumna + " ");
		}
		System.out.println(sumaTotal);
	}

}
