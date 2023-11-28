package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el número del que quieras su tabla");
		num = sc.nextInt();
		
		Multiplicacion.Multiplicar(num);
		sc.close();
	}
}
