package GUI;

import Logica.*;
import entidades.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JLabel lblTiempo, lblProximoTetrimino, lblTetriminoGuardado;
	
	////////////////
	ImageIcon imagenFondo = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/images/imagenFondoGrilla.png"))).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH) );
	ImageIcon imagenTetriminoI = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino I.png")).getImage().getScaledInstance(112, 28, Image.SCALE_SMOOTH));
	ImageIcon imagenTetriminoJ = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino J.png")).getImage().getScaledInstance(84, 56, Image.SCALE_SMOOTH));
	ImageIcon imagenTetriminoL = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino L.png")).getImage().getScaledInstance(84, 56, Image.SCALE_SMOOTH));
	ImageIcon imagenTetriminoO = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino O.png")).getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH));
	ImageIcon imagenTetriminoS = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino S.png")).getImage().getScaledInstance(84, 56, Image.SCALE_SMOOTH));
	ImageIcon imagenTetriminoT = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino T.png")).getImage().getScaledInstance(84, 56, Image.SCALE_SMOOTH));
	ImageIcon imagenTetriminoZ = new ImageIcon(new ImageIcon(Interfaz.class.getResource("/images/Tetrimino Z.png")).getImage().getScaledInstance(84, 56, Image.SCALE_SMOOTH));
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
		
		
		
		
		setBounds(378, 4, 631, 739);
		contentPane = new Panel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);
		
		panelGrilla = new JPanel();
		panelGrilla.setForeground(null);
		panelGrilla.setBackground(Color.BLACK);
		panelGrilla.setBounds(167, 85, 280, 589);
		contentPane.add(panelGrilla);
		panelGrilla.setLayout(new GridLayout(21, 10, 1, 1));
		panelGrilla.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelGrilla.setFocusable(true);
        panelGrilla.requestFocusInWindow();
		
		JLabel lblPuntajeText = new JLabel("Puntaje: ");
		lblPuntajeText.setFont(new Font("Wide Latin", Font.BOLD, 13));
		lblPuntajeText.setForeground(Color.WHITE);
		lblPuntajeText.setBounds(21, 98, 112, 56);
		contentPane.add(lblPuntajeText);
		
		lblPuntaje = new JLabel(""+0);
		lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntaje.setFont(new Font("Wide Latin", Font.BOLD, 13));
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setBounds(17, 126, 112, 56);
		contentPane.add(lblPuntaje);
		
		JLabel lblRelojText = new JLabel("Tiempo: ");
		lblRelojText.setFont(new Font("Wide Latin", Font.BOLD, 13));
		lblRelojText.setForeground(Color.WHITE);
		lblRelojText.setBounds(490, 98, 112, 56);
		contentPane.add(lblRelojText);
		
		lblTiempo = new JLabel(""+0+":"+0+0);
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setFont(new Font("Wide Latin", Font.BOLD, 13));
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setBounds(483, 126, 112, 56);
		contentPane.add(lblTiempo);
		
		JLabel lblProxText = new JLabel("Proximo: ");
		lblProxText.setFont(new Font("Wide Latin", Font.BOLD, 12));
		lblProxText.setForeground(Color.WHITE);
		lblProxText.setBounds(487, 225, 160, 80);
		contentPane.add(lblProxText);
		
		JLabel lblHoldText = new JLabel("Guardado: ");
		lblHoldText.setFont(new Font("Wide Latin", Font.BOLD, 12));
		lblHoldText.setForeground(Color.WHITE);
		lblHoldText.setBounds(16, 225, 160, 80);
		contentPane.add(lblHoldText);
		
		lblProximoTetrimino = new JLabel("");
		lblProximoTetrimino.setHorizontalAlignment(SwingConstants.CENTER);
		lblProximoTetrimino.setBounds(484, 294, 112, 56);
		contentPane.add(lblProximoTetrimino);
		
		lblTetriminoGuardado = new JLabel("");
		lblTetriminoGuardado.setHorizontalAlignment(SwingConstants.CENTER);
		lblTetriminoGuardado.setBounds(20, 294, 112, 56);
		contentPane.add(lblTetriminoGuardado);
		
		
		
		
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
					
					case 88:{
						juego.operar(3);
						break;
					}
					
					case 38:{
						juego.operar(4);
						break;
					}
					
					case 32:{
						juego.operar(5);
						break;
					}
					
					case 67:{
						juego.operar(6);
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
			for(int i = 0; i < (grillaGrafica[0].length); i++)
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
				lblProximoTetrimino.setIcon(imagenTetriminoI);
				break;
				
			case 'J':
				lblProximoTetrimino.setIcon(imagenTetriminoJ);
				break;
				
			case 'L':
				lblProximoTetrimino.setIcon(imagenTetriminoL);
				break;
				
			case 'O':
				lblProximoTetrimino.setIcon(imagenTetriminoO);
				break;
				
			case 'S':
				lblProximoTetrimino.setIcon(imagenTetriminoS);
				break;
				
			case 'T':
				lblProximoTetrimino.setIcon(imagenTetriminoT);
				break;
				
			case 'Z':
				lblProximoTetrimino.setIcon(imagenTetriminoZ);
				break;
		}
	}
	
	public void actualizarTetriminoGuardado(char tetrimino) {
		switch(tetrimino) {
			case 'I':
				lblTetriminoGuardado.setIcon(imagenTetriminoI);
				break;
				
			case 'J':
				lblTetriminoGuardado.setIcon(imagenTetriminoJ);
				break;
			
			case 'L':
				lblTetriminoGuardado.setIcon(imagenTetriminoL);
				break;
			
			case 'O':
				lblTetriminoGuardado.setIcon(imagenTetriminoO);
				break;
			
			case 'S':
				lblTetriminoGuardado.setIcon(imagenTetriminoS);
				break;
			
			case 'T':
				lblTetriminoGuardado.setIcon(imagenTetriminoT);
				break;
			
			case 'Z':
				lblTetriminoGuardado.setIcon(imagenTetriminoZ);
				break;
	}
	}
	
	public void finalizarJuego(int puntosFinales) {
		panelGrilla.setFocusable(false);
		//ImageIcon gameOver = new ImageIcon(Interfaz.class.getResource("/images/GameOver.png"));
		JOptionPane.showMessageDialog(null, "Puntuacion: "+puntosFinales, "Game Over", 0, new ImageIcon((new ImageIcon(Interfaz.class.getResource("/images/GameOver.png"))).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
	}

	public void borrarTetriminoGrafico(int[][] posiciones) {
		for(int i = 0; i<4;i++) {
			grillaGrafica[posiciones[i][0]][posiciones[i][1]].setIcon(imagenFondo);
		}
	}
	
	public void refrescarGrillaGrafica(int[] filasCompletadas){
		for (int i=1; i<filasCompletadas.length; i++) {
			if(filasCompletadas[i]!=-1)
				actualizarFilasGraficas(filasCompletadas[i]);
		}
	}
	
	private void actualizarFilasGraficas(int fila) {
		for(; fila>=0 ; fila--) {
			for(int i=0; i<10; i++) {
				if (fila==0)
					grillaGrafica[fila][i].setIcon(imagenFondo);
				else
					grillaGrafica[fila][i].setIcon(grillaGrafica[fila-1][i].getIcon());
			}
		}
	}

	public void actualizarTetriminoGrafico(int[][] posiciones, ImageIcon iconoBloque ) {		
		for(int i = 0; i<4;i++) {
			grillaGrafica[posiciones[i][0]][posiciones[i][1]].setIcon(iconoBloque);
		}
	}
}
