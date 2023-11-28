package ejercicio7;

public class Primo {
	public static boolean esPrimo(int num) {

		boolean primo = true;

		if (num != 1) {
			for (int i = 2; i < num / Math.sqrt(num); i++) {
				if (num % i == 0) {
					primo = false;
				}
			}
		}
		return primo;
	}

}
