package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creación de notas de 5*5
		int tabla[][] = new int[5][5];

		// Variable para comprobar si es simétrico
		boolean estado = false;

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
					estado = true;
				} else {
					estado = false;
					break;
				}

			}
		} // Fin de bucle

		// Muestra tabla Principal
		System.out.println("\tTabla Original");
		// Recorre la i
		for (int i = 0; i < tabla.length; i++) {
			// Recorre la jumna teniendo en cuenta la longitud de la i
			for (int j = 0; j < tabla[i].length; j++) {
				// Imprime la tabla mediante tabuladores
				System.out.print("\t" + tabla[i][j]);
			}
			// Imprime un espacio
			System.out.println();

		}

		// Dice si la tabla es simétrica o no
		System.out.println(estado ? "La tabla es simétrica" : "La tabla no es simétrica");

	}

}
