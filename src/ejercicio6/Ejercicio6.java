package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int opc;
		float radio, altura, area;
		double Volumen, Area;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Quieres saber el área (1) o el Volumen (2) ");
			opc = sc.nextInt();
		} while (opc != 1 && opc != 2);

		if (opc == 1) {
			System.out.println("Introduzca los datos para calcular el Área");

			System.out.println("Introduce el radio");
			radio = sc.nextFloat();
			System.out.println("Introduce la altura");
			altura = sc.nextFloat();
			Area = AreaVolumen.Opcion(opc, altura, radio);
			System.out.println("El area del cilindro es de "+Area);
		}
		if (opc == 2) {
			System.out.println("Introduzca los datos para calcular el Volumen");

			System.out.println("Introduce el radio");
			radio = sc.nextFloat();
			System.out.println("Introduce la altura");
			altura = sc.nextFloat();
			Volumen = AreaVolumen.Opcion(opc, altura, radio);
			System.out.println("El area del cilindro es de "+Volumen);
		}
		sc.close();
	}
}