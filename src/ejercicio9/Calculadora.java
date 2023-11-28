package ejercicio9;

public class Calculadora {
static public float calculadora(int opc, int num1, int num2) {
	float resultado=0;
	
	switch(opc) {
	case 1:
		resultado = num1+num2;
		break;
	case 2:
		resultado = num1-num2;
		break;
	case 3:
		resultado = num1*num2;
		break;
	case 4:
		resultado = num1/num2;
		break;
	
	}
	
	
	return resultado;
}
}
