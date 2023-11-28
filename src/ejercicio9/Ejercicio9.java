package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc, num1, num2;
		float resultado;
		
		do {
		System.out.println("Introduce la opción");
		System.out.println("1- Para la suma");
		System.out.println("2- Para la resta");
		System.out.println("3- Para la multiplicación");
		System.out.println("4- Para la división");
		opc=sc.nextInt();
		
		}while(opc != 1 && opc != 2 &&opc != 3 &&opc != 4);
		
		System.out.println("Introduce el 1º número");
		num1=sc.nextInt();
		
		System.out.println("Introduce el 2º número");
		num2=sc.nextInt();
		
		resultado=Calculadora.calculadora(opc, num1, num2);
		
		System.out.println("El resultado de tu operación es de "+resultado);
	}
}