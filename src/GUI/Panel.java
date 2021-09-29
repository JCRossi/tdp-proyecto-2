package GUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
	private Image fondo;
	
	public void paint(Graphics g) {
		fondo = new ImageIcon(Interfaz.class.getResource("/images/fondoTetrisInGame.png")).getImage();
		g.drawImage(fondo, 0, 0, 616, 700, this);
		setOpaque(false);
		super.paint(g);
	}
}
