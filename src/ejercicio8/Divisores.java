package ejercicio8;

import ejercicio7.Primo;

public class Divisores {
	public static int divisorPrimo(int num) {
		int numprim = 0;
		boolean primo;
		for (int i = 2; num/2 > i; i++) {
			if (num % i == 0) {
				primo = Primo.esPrimo(num);
				if (primo = true) {
					numprim++;
				}
			}
		}

		return numprim;
	}

}
