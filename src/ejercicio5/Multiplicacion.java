package ejercicio5;

public class Multiplicacion {

	public static void Multiplicar(int num) {
		int mult=0;
		
		for(int i=0;i<=10;i++) {
			mult=i*num;
			System.out.println(i+" * "+num+" = "+mult);
		}
		
	}
}
