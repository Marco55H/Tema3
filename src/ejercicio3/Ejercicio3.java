package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
	
		System.out.println("Este programa te dirá que número es mayor entre los introducidos por el usuario");
		System.out.println("Primer número");
		num1=sc.nextInt();

		System.out.println("Segundo número");
		num2=sc.nextInt();
		
		mayor.numero(num1,num2);
		boolean mayor;
		if(mayor=false) {
			System.out.println("El número "+num2+" es mayor que "+num1);
		}else {
			System.out.println("El número "+num1+" es mayor que "+num2);
		}
		sc.close();
	

}
}
