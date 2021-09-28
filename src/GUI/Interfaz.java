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
	private JLabel lblTiempo, lblProximoTetrimino;
	
	////////////////
	ImageIcon imagenFondo = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/imagenFondoGrilla.png"))).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH) );
	ImageIcon imagenBloqueJ = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/Bloque J.png"))).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) );
	ImageIcon imagenBloqueZ = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/Bloque Z.png"))).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH) );
	ImageIcon imagenBloqueO = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/Bloque O.png"))).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH) );
	ImageIcon imagenBloqueT = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/Bloque T.png"))).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH) );
	///////////////////
	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setTitle("Tetris");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/icono tetris 2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		grillaGrafica = new JLabel[21][10];//
		
		for(int i = 0; i < grillaGrafica.length; i++)
			for(int j = 0; j < grillaGrafica[0].length; j++) { //////////////////////////////
				JLabel imagen = new JLabel("");
				imagen.setIcon(imagenFondo);
				imagen.setBounds(0, 0, 50, 50);
				grillaGrafica[i][j] = imagen;
			} ////////////////////////////////////////////////////////////////////////////////
		
		
		
		
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
		panelGrilla.setFocusable(true);
        panelGrilla.requestFocusInWindow();
		
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
		
		JLabel lblRelojText = new JLabel("Tiempo: ");
		lblRelojText.setFont(new Font("Wide Latin", Font.BOLD, 11));
		lblRelojText.setForeground(Color.WHITE);
		lblRelojText.setBounds(401, 10, 87, 37);
		contentPane.add(lblRelojText);
		
		lblTiempo = new JLabel(""+0+":"+0+0);
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setFont(new Font("Wide Latin", Font.BOLD, 11));
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setBounds(401, 49, 87, 19);
		contentPane.add(lblTiempo);
		
		lblProximoTetrimino = new JLabel("");
		lblProximoTetrimino.setHorizontalAlignment(SwingConstants.CENTER);
		lblProximoTetrimino.setBounds(401, 79, 87, 47);
		contentPane.add(lblProximoTetrimino);
		
		
		
		
		iniciarGridLayout(); ////////////////////////////////////////
		
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
						break;
					}
					
					case 39:{
						juego.operar(1);
						break;
					}
					
					case 40:{
						juego.operar(2);
						break;
					}
					
					case 65:{
						juego.operar(3);
						break;
					}
					
					case 68:{
						juego.operar(4);
						break;
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
		
		
		for(int j = 0; j < grillaGrafica.length; j++)
			for(int i = 0; i < (grillaGrafica[0].length); i++)//yytryty
				panelGrilla.add(grillaGrafica[j][i]);
	}//HOLA
	
	public void actualizarPuntajeGrafico(int puntos) {
		lblPuntaje.setText(""+puntos);
	}
	
	public void actualizarTiempoGrafico(int minutos, int segundos) {
		int i = segundos;
		if (i<10) {
		lblTiempo.setText(minutos + ":"+0+ segundos);
		}else
		lblTiempo.setText(minutos + ":"+ segundos);
	}
	
	
	public JLabel[][] getGrillaGrafica(){
		return grillaGrafica;
	}
	
	
	public void setJuego(Logica juego) {
		this.juego = juego;
	}
	
	public void actualizarProximoTetrimino(char tetrimino) {
		switch(tetrimino) {
			case 'I':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino I.png")).getImage().getScaledInstance(80, 25, Image.SCALE_SMOOTH))));
				break;
				
			case 'J':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino J.png")).getImage().getScaledInstance(80, 50, Image.SCALE_SMOOTH))));
				break;
				
			case 'L':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino L.png")).getImage().getScaledInstance(80, 50, Image.SCALE_SMOOTH))));
				break;
				
			case 'O':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino O.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
				break;
				
			case 'S':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino S.png")).getImage().getScaledInstance(80, 50, Image.SCALE_SMOOTH))));
				break;
				
			case 'T':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino T.png")).getImage().getScaledInstance(80, 50, Image.SCALE_SMOOTH))));
				break;
				
			case 'Z':
				lblProximoTetrimino.setIcon((new ImageIcon (new ImageIcon(Interfaz.class.getResource("/images/Tetrimino Z.png")).getImage().getScaledInstance(80, 50, Image.SCALE_SMOOTH))));
				break;
		}
	}
	
	public void finalizarJuego() {
		panelGrilla.setFocusable(false);
	}
}
