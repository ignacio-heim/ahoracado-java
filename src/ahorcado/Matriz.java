package ahorcado;

public class Matriz {
	public char[][] matrizPalbras(String[] array, int n) {
		char[][] matrizPalabra = new char[n][6];			
		for (int i = 0; i < n; i++) {	
			String palabraFor = array[i];
			for (int j = 0; j < 6; j++) {
				char letra = palabraFor.charAt(j);
				matrizPalabra[i][j] = letra;
			}
		}
		
		return matrizPalabra;
	}
}
