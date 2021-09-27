package GUI;

import Logica.*;
import entidades.*;

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
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame {

	private JPanel contentPane, panelGrilla;
	private ImageIcon fondoTetrisInGame;
	private Logica juego;
	private JLabel[][] grillaGrafica;
	private JLabel lblPuntaje;
	
	/**
	 * Create the frame.
	 */
	public Interfaz(Logica newGame) {
		setTitle("Tetris");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/icono tetris 2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		juego = newGame;
		juego.setInterfaz(this);
		grillaGrafica = new JLabel[21][10];
		
		for(int i = 0; i < grillaGrafica.length; i++)
			for(int j = 0; j < grillaGrafica[0].length; j++)
				grillaGrafica[i][j] = null;
		
		setBounds(100, 100, 514, 475);
		contentPane = new Panel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelGrilla = new JPanel();
		panelGrilla.setForeground(null);
		panelGrilla.setBackground(Color.BLACK);
		panelGrilla.setBounds(107, 0, 284, 436);
		contentPane.add(panelGrilla);
		panelGrilla.setLayout(new GridLayout(21, 10));
		
		JLabel lblPuntajeText = new JLabel("Puntaje: ");
		lblPuntajeText.setFont(new Font("Wide Latin", Font.BOLD, 11));
		lblPuntajeText.setForeground(Color.WHITE);
		lblPuntajeText.setBounds(10, 11, 87, 37);
		contentPane.add(lblPuntajeText);
		
		lblPuntaje = new JLabel(""+0);
		lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntaje.setFont(new Font("Wide Latin", Font.BOLD, 11));
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setBounds(10, 49, 87, 19);
		contentPane.add(lblPuntaje);
		
		//Detecta acciones de teclado
		KeyListener eventoTeclado = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
					case 37:{
						juego.operar(0);
					}
					
					case 39:{
						juego.operar(1);
					}
					
					case 40:{
						juego.operar(2);
					}
					
					case 65:{
						juego.operar(3);
					}
					
					case 68:{
						juego.operar(4);
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		};
		
		panelGrilla.addKeyListener(eventoTeclado);
	}
	
	public void iniciarGridLayout() {
		
		
		for(int j = 0; j < grillaGrafica[0].length; j++)
			for(int i = 0; i < grillaGrafica.length; i++)
				panelGrilla.add(grillaGrafica[i][j]);
	}
	
	public void actualizarPuntajeGrafico(int puntos) {
		lblPuntaje.setText(""+puntos);
	}
}
