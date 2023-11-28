package ejercicio3;

public class Mayores {
	static public void numero(int num1, int num2) {
		int mayor = 0;
		if (num1 < num2) {
			mayor = 1;
		} else if (num1 == num2) {
			mayor = 2;
		} else {
			mayor = 3;
		}
		
		
		if (mayor == 1) {
			System.out.println("El número " + num2 + " es mayor que " + num1);
		} else if (mayor == 2) {
			System.out.println("El número " + num1 + " es igual que " + num2);
		} else
			System.out.println("El número " + num1 + " es mayor que " + num2);
	}
}
