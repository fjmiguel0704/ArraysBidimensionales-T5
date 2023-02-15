package ejercicios;

public class Ejercicio7B {

	public static void main(String[] args) {
		// Creación de tabla principal 4*4
		int tablaPrincipal[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// Creación de variable auxiliar
		int aux;

		// Muestra tabla Principal
		System.out.println("\tTabla Original");
		// Recorre la fila
		for (int fila = 0; fila < tablaPrincipal.length; fila++) {
			// Recorre la columna teniendo en cuenta la longitud de la fila
			for (int col = 0; col < tablaPrincipal[fila].length; col++) {
				// Imprime la tabla mediante tabuladores
				System.out.print("\t" + tablaPrincipal[fila][col]);
			}
			// Imprime un espacio
			System.out.println();

		}

		for (int i = 0; i < tablaPrincipal.length; i++) {
			for (int j = i; j < tablaPrincipal[i].length; j++) {
				aux = tablaPrincipal[i][j];
				tablaPrincipal[i][j] = tablaPrincipal[j][i];
				tablaPrincipal[j][i] = aux;
			}
		} // Fin del bucle

		// Muestra la tabla final
		System.out.println("Tabla Final");
		// Recorre la fila
		for (int fila = 0; fila < tablaPrincipal.length; fila++) {
			// Recorre la columna teniendo en cuenta la longitud de la fila
			for (int col = 0; col < tablaPrincipal[fila].length; col++) {
				// Imprime la tabla mediante tabuladores
				System.out.print("\t" + tablaPrincipal[fila][col] + " ");
			}
			// Imprime un espacio
			System.out.println();

		}
	}

}
