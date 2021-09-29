package entidades;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BloqueGrafico extends JLabel{
	private ImageIcon grafico;
	private String[] imagenes;
	
	public BloqueGrafico() {
		grafico = new ImageIcon();
		imagenes = new String[] {"/images/Bloque I.png", "/images/Bloque J.png", "/images/Bloque L.png", "/images/Bloque O.png", "/images/Bloque S.png", "/images/Bloque T.png", "/images/Bloque Z.png","/images/Bloque L.png"};
	}
	
	public void actualizar(int indice) {
		//ImageIcon icon = new ImageIcon(BloqueGrafico.class.getResource(imagenes[indice]));
		ImageIcon icon = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(BloqueGrafico.class.getResource(imagenes[indice]))).getImage().getScaledInstance(28,28,Image.SCALE_DEFAULT) );
		setBloqueGrafico(icon);
	}
	
	public ImageIcon getBloqueGrafico() {
		return grafico;
	}
	
	public void setBloqueGrafico(ImageIcon grafico) {
		this.grafico = grafico;
	}
}
