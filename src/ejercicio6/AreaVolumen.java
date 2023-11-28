package ejercicio6;

public class AreaVolumen {
public static double Opcion(int opc, float altura, float radio) {
	double Area;
	if(opc==1) {
		Area= 2*Math.PI * radio * (altura + radio);
		
	}else {
		Area= Math.PI * (radio*radio) * altura;
	}
	return Area;
}
}
