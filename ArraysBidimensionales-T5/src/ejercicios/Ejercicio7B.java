package ejercicios;

public class Ejercicio7B {

	public static void main(String[] args) {
		// Creación de tabla principal 4*4
		int tablaPrincipal[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// Creación de variable auxiliariliar
		int auxiliar;

		// Muestra tabla Principal
		System.out.println("Tabla Original");
		// Recorre la i
		for (int i = 0; i < tablaPrincipal.length; i++) {
			// Recorre la jumna teniendo en cuenta la longitud de la i
			for (int j = 0; j < tablaPrincipal[i].length; j++) {
				// Imprime la tabla mediante tabuladores
				System.out.print(tablaPrincipal[i][j] + " ");
			}
			// Imprime un espacio
			System.out.println();

		}

		for (int i = 0; i < tablaPrincipal.length; i++) {
			for (int j = i; j < tablaPrincipal[i].length; j++) {
				auxiliar = tablaPrincipal[i][j];
				tablaPrincipal[i][j] = tablaPrincipal[j][i];
				tablaPrincipal[j][i] = auxiliar;
			}
		} // Fin del bucle

		// Muestra la tabla final
		System.out.println("Tabla Final");
		// Recorre la i
		for (int i = 0; i < tablaPrincipal.length; i++) {
			// Recorre la jumna teniendo en cuenta la longitud de la i
			for (int j = 0; j < tablaPrincipal[i].length; j++) {
				// Imprime la tabla mediante tabuladores
				System.out.print(tablaPrincipal[i][j] + " ");
			}
			// Imprime un espacio
			System.out.println();

		}
	}

}
