package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce el número para contar divisores primos");
		num = sc.nextInt();
	
		System.out.println("Tu número tiene "+Divisores.divisorPrimo(num)+ " divisores que sean números primos");
		sc.close();
	}
}
