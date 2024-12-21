package ahorcado;

public class Esquema {
	public char[] arrayGuiones() {
	
		char[] progreso = new char[6];
		for (int j = 0; j < 6; j++) {
			progreso[j] = '_';
		}		
		
		return progreso;
	}
	
	public String resultado(char[] miArray) {		
		String resultado = new String(miArray);
		
		String[] caracteres = resultado.split("");
		String result = String.join(" ", caracteres);
				
		return result;
	}
	/*
	public static void main(String[] args) {
		
		Esquema esq = new Esquema();
		
		char[] miArray = esq.arrayGuiones();
		
		String guiones = esq.resultado(miArray);
		
		System.out.println(guiones);					
	}
	*/
}
