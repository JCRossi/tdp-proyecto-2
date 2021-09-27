package Logica;

import entidades.*;
import GUI.Interfaz;
import java.util.Random;

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
	
	public Logica() {
		puntos = new Puntaje();
		grilla = new Grilla();
		reloj = new Reloj(this);
		rand = new Random();
		listaTetriminos = new char[] {'I', 'J', 'L', 'O', 'S', 'T', 'Z'};
		primerTetrimino = true;
		llamarNuevoTetrimino();
		hiloReloj = new Thread(this.reloj); //No estoy seguro si es necesario guardar el hilo
		hiloReloj.start();
	}
	
	public void setInterfaz(Interfaz interfaz) {
		pantalla = interfaz;
	}
	
	public void llamarNuevoTetrimino() {
		int index, indexProx;
		
		if(primerTetrimino) {
			index = rand.nextInt(listaTetriminos.length);
			indexProx = rand.nextInt(listaTetriminos.length);
			
			switch(listaTetriminos[index]) {
				case 'I':{
					tetriminoActual = new TetriminoI();
				}
				
				case 'J':{
					tetriminoActual = new TetriminoJ();
				}

				case 'L':{
					tetriminoActual = new TetriminoL();
				}
				
				case 'O':{
					tetriminoActual = new TetriminoO();
				}
				
				case 'S':{
					tetriminoActual = new TetriminoS();
				}
				
				case 'T':{
					tetriminoActual = new TetriminoT();
				}
				
				case 'Z':{
					tetriminoActual = new TetriminoZ();
				}
			}
			
			switch(listaTetriminos[indexProx]) {
				case 'I':{
					proximoTetrimino = new TetriminoI();
				}
				
				case 'J':{
					proximoTetrimino = new TetriminoJ();
				}
	
				case 'L':{
					proximoTetrimino = new TetriminoL();
				}
				
				case 'O':{
					proximoTetrimino = new TetriminoO();
				}
				
				case 'S':{
					proximoTetrimino = new TetriminoS();
				}
				
				case 'T':{
					proximoTetrimino = new TetriminoT();
				}
				
				case 'Z':{
					proximoTetrimino = new TetriminoZ();
				}
			}
			
			primerTetrimino = false;
		}
		else {
			tetriminoActual = proximoTetrimino;
			index = rand.nextInt(listaTetriminos.length);
			
			switch(listaTetriminos[index]) {
				case 'I':{
					proximoTetrimino = new TetriminoI();
				}
				
				case 'J':{
					proximoTetrimino = new TetriminoJ();
				}

				case 'L':{
					proximoTetrimino = new TetriminoL();
				}
				
				case 'O':{
					proximoTetrimino = new TetriminoO();
				}
				
				case 'S':{
					proximoTetrimino = new TetriminoS();
				}
				
				case 'T':{
					proximoTetrimino = new TetriminoT();
				}
				
				case 'Z':{
					proximoTetrimino = new TetriminoZ();
				}
			}
		}
	}
	
	public synchronized void operar(int operacion) {
		switch(operacion) {
			case MOVER_IZQUIERDA:
				tetriminoActual.moverIzquierda();
				
			case MOVER_DERECHA:
				tetriminoActual.moverDerecha();
				
			case MOVER_ABAJO:{
				boolean puedeBajar = true;
				int filasCompletadas = 0;
				
				puedeBajar = tetriminoActual.moverAbajo();
				
				if(!puedeBajar) {
					grilla.actualizarGrilla(tetriminoActual);
					filasCompletadas = grilla.despejar(tetriminoActual.filasOcupadas());
					actualizarPuntaje(filasCompletadas);
					llamarNuevoTetrimino();
				}	
			}
			
	
			case ROTAR_IZQUIERDA:
				tetriminoActual.rotarIzquierda();
				
			case ROTAR_DERECHA:
				tetriminoActual.rotarDerecha();
		}
	}
	
	/*
	 * Actualiza el puntaje del juego en base a las filas que se hayan completado
	 * @param filasCompletadas Cantidad de filas que se completaron
	 */
	public void actualizarPuntaje(int filasCompletadas) {
		switch(filasCompletadas) {
			case 0:
			case 1:
			case 2:
				puntos.setPuntaje(puntos.getPuntaje() + (filasCompletadas * 100));
			case 3:
				puntos.setPuntaje(puntos.getPuntaje() + 500);
			case 4:
				puntos.setPuntaje(puntos.getPuntaje() + 800);
		}
		
		pantalla.actualizarPuntajeGrafico(puntos.getPuntaje());
	}

	
	public void actualizarTetriminoGrafico() {
		//pantalla.metodoDeActualziacion(tetriminoActual);
	}
	
	public void actualizarGrillaGrafica() {
		
	}
	
	//Este método recibe el tiempo directamente desde el reloj y actualiza a la GUI
	public void ActualizarRelojGui(int minutos, int segundos) {
		// TODO Auto-generated method stub
			
	}
	
	public void finalizarJuego() {
		//...
		//...
		reloj.frenarReloj();
		//hiloReloj.stop();
	}
}