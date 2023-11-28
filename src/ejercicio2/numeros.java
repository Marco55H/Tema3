package ejercicio2;

public class numeros {
	static public void num(int num1, int num2) {
		if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		}
		if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}
	}
}
