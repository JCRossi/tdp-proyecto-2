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

public class Interfaz extends JFrame {

	private JPanel contentPane, panelGrilla;
	private ImageIcon fondoTetrisInGame;
	private Logica juego;
	private JLabel[][] grillaGrafica;
	
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
}
