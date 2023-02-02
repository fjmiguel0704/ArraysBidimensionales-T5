package ejercicios;

/**
 * Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente
 * forma: el elemento de la posición [n][m] debe contener el valor 10 * n + m.
 * Después se debe mostrar su contenido
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla[][] = new int[5][5];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
