package ahorcado;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Imagenes {
	public void imagen(String result, int incorrecto) {
		ImageIcon icon = new ImageIcon("img/"+incorrecto+".jpg");
        JOptionPane.showMessageDialog(
                null,
                ("Palbra: "+result+"\n"+"Errores posibles: "+incorrecto),
                "Juego del ahorcado", JOptionPane.INFORMATION_MESSAGE,
                icon);				
	}	
}
