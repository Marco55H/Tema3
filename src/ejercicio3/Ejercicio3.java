package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Este programa te dirá que número es mayor entre los introducidos por el usuario");
		System.out.println("Primer número");
		num1 = sc.nextInt();

		System.out.println("Segundo número");
		num2 = sc.nextInt();

		Mayores.numero(num1, num2);

		sc.close();

	}
}
