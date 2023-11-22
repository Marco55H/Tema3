package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);

		do
		try {
			System.out.println("Cuantas veces quieres repeptir eco?");
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error de tipo");
			sc.nextLine();
		}
		while(num<0);

		Eco1.eco(num);
		sc.close();
	}

}
