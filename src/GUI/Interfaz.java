package GUI;

import Logica.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private ImageIcon fondoTetris;
	private final JLabel lblFondoTetris = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/icono tetris 2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelGrilla = new JPanel();
		panelGrilla.setBackground(Color.BLACK);
		panelGrilla.setBounds(124, 0, 250, 343);
		contentPane.add(panelGrilla);
		panelGrilla.setLayout(new GridLayout(1, 0, 0, 0));
		
		//Detecta acciones de teclado
		/*KeyListener eventoTeclado = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Se apreto la tecla con codigo:"+e.getKeyCode());
			}
		};
		
		panelGrilla.addKeyListener(eventoTeclado);*/
	}
}
