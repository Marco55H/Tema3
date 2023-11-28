package ejercicio4;

public class Vocal {

	public static boolean EsVocal(String palabra) {
		boolean vocal=true;
		palabra=palabra.toUpperCase();
		if(palabra == "A" || palabra=="E"||palabra == "I" || palabra=="O"||palabra == "U") {
			vocal=true;
		}
		else {
			vocal=false;
		}
		return vocal;
	}
}
