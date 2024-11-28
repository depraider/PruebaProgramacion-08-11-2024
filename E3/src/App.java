import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		// Creamos el array que almacena la frase
		String[][] vPalabras = new String[3][3];

		// Solicitamos la frase
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();

		// Dividimos la palabra y la almacenamos
		String[] palabras = frase.split(" ");

		int f = 0, c = 0;
		for (String palabra : palabras) {
			vPalabras[f][c] = palabra;
			c++;

			if (c == 3) {
				f++;
				c = 0;
			}
			if (f >= 3) {
				break; // Sale del array en caso que esté lleno
			}
		}

		// Llenamos las celdas vacías
		for (int i = f; i < vPalabras.length; i++) {
			for (int j = 0; j < vPalabras[i].length; j++) {
				if (vPalabras[i][j] == null) {
					vPalabras[i][j] = "vacio";
				}
			}
		}

		// Mostramos el Array
		System.out.println("Contenido del array:");
		for (String[] fpalabras : vPalabras) {
			for (String palabra : fpalabras) {
				System.out.print(palabra + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
