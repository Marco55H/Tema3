package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num;
	boolean primo;
	System.out.println("Introduce un número ¿Será primo?");
	num=sc.nextInt();
	
	primo=Primo.esPrimo(num);
	if (num==1) {
		primo=false;
	}
	
	System.out.println("Tu número es primo? "+primo);
	sc.close();
}
}
