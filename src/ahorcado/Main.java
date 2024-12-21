package ahorcado;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Clase principal del programa
		Eleccionpalabra elec = new Eleccionpalabra();
		Matriz creacionMatriz = new Matriz();
		Imagenes img = new Imagenes();
		Esquema esq = new Esquema();
		
		
		int incorrecto = 6;		
		int correcto = 0;

		
		int numAzar = elec.numeroAzaz();		
		String palabraEle = elec.palabraAzar(numAzar);
		String[] palabras = elec.words();
		int n = elec.longitud();
		char[][] matrizPalabras = creacionMatriz.matrizPalbras(palabras, n);	
		char[] palabra = matrizPalabras[numAzar];
		
		char[] progreso = esq.arrayGuiones();
		String result = esq.resultado(progreso);
		
		String mensaje = "!Bienvenido al juego del ahorcado!";
		JOptionPane.showMessageDialog(null, mensaje);
	
		do {
			
			img.imagen(result, incorrecto);
			while (incorrecto >= 0 || correcto == 6) {
				String letraSeleccionada = JOptionPane.showInputDialog("Ingrese la letra: ").toLowerCase();
				char letra = letraSeleccionada.charAt(0);	
				boolean respuesta = false;
				for (int i = 0; i < palabra.length; i++) {			
					if (letra==palabra[i]) {
						progreso[i] = letra;
						correcto++;
						respuesta = true;					
					} 
				}
				
				if (!respuesta) {
					incorrecto--;
				}
				result = esq.resultado(progreso);

				if (incorrecto==0) {				
					img.imagen(result, incorrecto);
					JOptionPane.showMessageDialog(null, "Lo siento, perdiste."+"\nLa palabra era: "+palabraEle);					
					break;					
				} else {
					img.imagen(result, incorrecto);
				}
				
				if (correcto==6) {
					JOptionPane.showMessageDialog(null, "¡¡¡¡ Ganaste !!!!");					
					break;
				}
			}
			mensaje = JOptionPane.showInputDialog("Quieres jugar de nuevo? (Si/No)");
			
			numAzar = elec.numeroAzaz();
			palabraEle = elec.palabraAzar(numAzar);			
			palabra = matrizPalabras[numAzar];
			incorrecto=6;
			correcto=0;		
			progreso = esq.arrayGuiones();
			result = esq.resultado(progreso);

		} while (!mensaje.equalsIgnoreCase("no")); {				
									
		}
				
	}
}

