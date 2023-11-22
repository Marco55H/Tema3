package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num1,num2;
			
			System.out.println("Este programa cuenta los números entre los dos valores introducidos por el usuario");
			System.out.println("Primer número");
			num1=sc.nextInt();

			System.out.println("Segundo número");
			num2=sc.nextInt();
			
			numeros.num(num1,num2);
			sc.close();
		

	}
}
