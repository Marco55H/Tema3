package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*
		 * Crear una función que devuelva un tipo booleano que indique si el carácter
		 * que se pasa como parámetro de entrada corresponde con una vocal. Diseña un
		 * método main() que pruebe el funcionamiento de dicha función.
		 */
		String palabra;
		boolean vocal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame la palabra para contar el número de vocales");
		palabra=sc.next();
		
		vocal=Vocal.EsVocal(palabra);
		if (vocal) {
			System.out.println("Es una vocal");
		}
		else{
			System.out.println("No es una vocal");
		}
		System.out.println(vocal);
		sc.close();
	}
}