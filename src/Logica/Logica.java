package Logica;

import entidades.*;

public class Logica {
	private Puntaje puntos;
	private Grilla grilla;
	private Reloj reloj;
	private Tetrimino tetriminoActual;
	private Thread hiloReloj;//Potencialmente innecesario
	
	
	public final int MOVER_IZQUIERDA = 0;
	public final int MOVER_DERECHA = 1;
	public final int MOVER_ABAJO = 2;
	public final int ROTAR_IZQUIERDA = 3;
	public final int ROTAR_DERECHA = 4;
	
	
	public Logica() {
		puntos = new Puntaje();
		grilla = new Grilla();
		reloj = new Reloj(this);
		hiloReloj = new Thread(this.reloj); //No estoy seguro si es necesario guardar el hilo
		hiloReloj.start();
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
				filasCompletadas = grilla.despejar(tetriminoActual.filasOcupadas());
				actualizarPuntaje(filasCompletadas);
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
				break;
			case 3:
				puntos.setPuntaje(puntos.getPuntaje() + 500);
				break;
			case 4:
				puntos.setPuntaje(puntos.getPuntaje() + 800);
				break;
		}
	}
	
	public void finalizarJuego() {
		//...
		//...
		reloj.frenarReloj();
		//hiloReloj.stop();
	}

	//Este método recibe el tiempo directamente desde el reloj y actualiza a la GUI
	public void ActualizarRelojGui(int minutos, int segundos) {
		// TODO Auto-generated method stub
		
	}
}
