package Logica;

import entidades.*;
import GUI.Interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Logica {
	public final int MOVER_IZQUIERDA = 0;
	public final int MOVER_DERECHA = 1;
	public final int MOVER_ABAJO = 2;
	public final int ROTAR_IZQUIERDA = 3;
	public final int ROTAR_DERECHA = 4;
	
	private Interfaz pantalla;
	private Puntaje puntos;
	private Grilla grilla;
	private Reloj reloj;
	private Tetrimino tetriminoActual, proximoTetrimino;
	private Thread hiloReloj;//Potencialmente innecesario
	private Random rand;
	private char[] listaTetriminos;
	private boolean primerTetrimino;
	private Bloque[] posAnterior;
	
	public Logica(Interfaz interfaz) {
		puntos = new Puntaje();
		grilla = new Grilla();
		reloj = new Reloj(this);
		pantalla = interfaz;
		pantalla.setJuego(this);
		rand = new Random();
		listaTetriminos = new char[] {'I', 'J', 'L', 'O', 'S', 'T', 'Z'};
		primerTetrimino = true;
		llamarNuevoTetrimino();
		hiloReloj = new Thread(this.reloj); //No estoy seguro si es necesario guardar el hilo
		hiloReloj.start();
		posAnterior = new Bloque[4];
	}
	
	
	public void llamarNuevoTetrimino() {
		int index, indexProx;
		
		if(primerTetrimino) {
			index = rand.nextInt(listaTetriminos.length);
			indexProx = rand.nextInt(listaTetriminos.length);
			tetriminoActual = crearTetrimino(index);
			proximoTetrimino = crearTetrimino(indexProx);
			primerTetrimino = false;
			pantalla.actualizarProximoTetrimino(listaTetriminos[indexProx]);
		}
		else {
			tetriminoActual = proximoTetrimino;
			index = rand.nextInt(listaTetriminos.length);
			proximoTetrimino = crearTetrimino(index);
			
			
			pantalla.actualizarProximoTetrimino(listaTetriminos[index]);
		}
		
		if(chequearFinalizacionJuego())
			finalizarJuego();
		else
			actualizarTetriminoGrafico();
	}
	
	private Tetrimino crearTetrimino(int indice) {
		Tetrimino tetrimino = null;
		
		switch(listaTetriminos[indice]) {
			case 'I':{
				tetrimino = new TetriminoI(grilla);
				break;
			}
			
			case 'J':{
				tetrimino = new TetriminoJ(grilla);
				break;
			}
	
			case 'L':{
				tetrimino = new TetriminoL(grilla);
				break;
			}
			
			case 'O':{
				tetrimino = new TetriminoO(grilla);
				break;
			}
			
			case 'S':{
				tetrimino = new TetriminoS(grilla);
				break;
			}
			
			case 'T':{
				tetrimino = new TetriminoT(grilla);
				break;
			}
			
			case 'Z':{
				tetrimino = new TetriminoZ(grilla);
				break;
			}
		}
		
		return tetrimino;
	}
	
	public synchronized void operar(int operacion) {
		switch(operacion) {
			case MOVER_IZQUIERDA:
				borrarTetriminoGrafico();
				tetriminoActual.moverIzquierda();
				actualizarTetriminoGrafico();
				break;
				
			case MOVER_DERECHA:
				borrarTetriminoGrafico();
				tetriminoActual.moverDerecha();
				actualizarTetriminoGrafico();
				break;
				
			case MOVER_ABAJO:{
				boolean puedeBajar = true;
				int filasCompletadas = 0;
				borrarTetriminoGrafico();
				guardarPosTetrimino();
				puedeBajar = tetriminoActual.moverAbajo();
				actualizarTetriminoGrafico();
				
				if(!puedeBajar) {
					grilla.actualizarGrilla(tetriminoActual);
					filasCompletadas = grilla.despejar(tetriminoActual.filasOcupadas());
					
					if(filasCompletadas>0) {
						refrescarGrillaGrafica();
						actualizarPuntaje(filasCompletadas);
					}
					llamarNuevoTetrimino();
					
				}
				break;
			}
			
	
			case ROTAR_IZQUIERDA:
				borrarTetriminoGrafico();
				tetriminoActual.rotarIzquierda();
				actualizarTetriminoGrafico();
				break;
				
			case ROTAR_DERECHA:
				borrarTetriminoGrafico();
				tetriminoActual.rotarDerecha();
				actualizarTetriminoGrafico();
				break;
		}
	}
	
	private void borrarTetriminoGrafico() {
		JLabel[][] grillaG = pantalla.getGrillaGrafica();
		Bloque[] bloquesTetrimino = tetriminoActual.getBloques();
		for(int i = 0; i<4;i++) {
			grillaG[bloquesTetrimino[i].getFila()][bloquesTetrimino[i].getColumna()].setIcon(new ImageIcon(BloqueGrafico.class.getResource("/images/imagenFondoGrilla.png")));
		}
	}
	
	private void refrescarGrillaGrafica(){
		JLabel[][] grillaG = pantalla.getGrillaGrafica();
		Bloque[][] matriz = grilla.getMatriz();
		Bloque bloqueActual;
		for(int fila=20; fila>=0; fila--) {
			for(int i=0; i<10; i++) {
				bloqueActual = matriz[fila][i];
				if(bloqueActual!=null) {
					grillaG[fila][i].setIcon(bloqueActual.getBloqueG().getBloqueGrafico());
				}
				else
					grillaG[fila][i].setIcon(new ImageIcon(BloqueGrafico.class.getResource("/images/imagenFondoGrilla.png")));
			}
		}
	}


	/*
	 * Actualiza el puntaje del juego en base a las filas que se hayan completado
	 * @param filasCompletadas Cantidad de filas que se completaron
	 */
	public void actualizarPuntaje(int filasCompletadas) {
		switch(filasCompletadas) {
			case 1:
			case 2:
				puntos.setPuntaje(puntos.getPuntaje() + (filasCompletadas * 100));
				break;
			case 3:
				puntos.setPuntaje(puntos.getPuntaje() + 500);
				break;
			case 4:
				puntos.setPuntaje(puntos.getPuntaje() + 800);
				break;
		}
		
		pantalla.actualizarPuntajeGrafico(puntos.getPuntaje());
	}

	
	public void actualizarTetriminoGrafico() {
		
	
		JLabel[][] grillaG = pantalla.getGrillaGrafica();
		Bloque[] bloquesTetrimino = tetriminoActual.getBloques();		
		for(int i = 0; i<4;i++) {
			grillaG[bloquesTetrimino[i].getFila()][bloquesTetrimino[i].getColumna()].setIcon(bloquesTetrimino[i].getBloqueG().getBloqueGrafico());
		}
	}
	
	public void actualizarGrillaGrafica() {
		
	}
	
	//Este método recibe el tiempo directamente desde el reloj y actualiza a la GUI
	public void ActualizarRelojGui(int minutos, int segundos) {
		pantalla.actualizarTiempoGrafico(minutos, segundos);
			
	}
	
	private boolean chequearFinalizacionJuego() {
		Bloque[] bloques = tetriminoActual.getBloques();
		Bloque bloque;
		Bloque[][] grillaBloques = grilla.getMatriz();
		boolean colision = false;
		
		for(int i = 0; i < 4 && !colision; i++) {
			bloque = bloques[i];
			
			if(bloque.getFila() == 0)
				if(grillaBloques[0][bloque.getColumna()] != null)
					colision = true;
		}
		
		return colision;
	}
	
	//Falta deshabilitar acciones por pantalla
	public void finalizarJuego() {
		//...
		//...
		pantalla.finalizarJuego();
		reloj.frenarReloj();
		//hiloReloj.stop();
	}
	
	public void guardarPosTetrimino() {
		//if()
		Bloque[] posActual = tetriminoActual.getBloques();
		for(int i = 0; i<4; i++) {
			posAnterior[i] = posActual[i];
			}
		
	}
	
	
	
}