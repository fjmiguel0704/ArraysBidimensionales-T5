package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creación de notas de 5*5
		int tabla[][] = new int[5][5];

		// Variable para comprobar si es simétrico
		boolean simetrico = false;

		// Rellena valores
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * 10 + 1);
			}
		} // Fin de bucle

		// Bucle para comprobar si es simétrica la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] == tabla[j][i]) {
					simetrico = true;
				} else {
					simetrico = false;
					break;
				}

			}
		} // Fin de bucle

		// Muestra tabla Principal
		System.out.println("\tTabla Original");
		// Recorre la fila
		for (int fila = 0; fila < tabla.length; fila++) {
			// Recorre la columna teniendo en cuenta la longitud de la fila
			for (int col = 0; col < tabla[fila].length; col++) {
				// Imprime la tabla mediante tabuladores
				System.out.print("\t" + tabla[fila][col]);
			}
			// Imprime un espacio
			System.out.println();

		}

		// Dice si la tabla es simétrica o no
		System.out.println(simetrico ? "La tabla es simétrica" : "La tabla no es simétrica");

	}

}
