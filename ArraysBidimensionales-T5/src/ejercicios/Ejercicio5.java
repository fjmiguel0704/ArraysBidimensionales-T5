package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[][] = new int[4][5];
		int sumaFila = 0;
		int sumaColumna = 0;
		int sumaTotal = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * (999 - 100 + 1) + 100);
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println("|" + sumaFila);
		}

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
