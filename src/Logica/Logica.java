package Logica;

import entidades.*;

public class Logica {
	private Puntaje puntos;
	private Grilla grilla;
	private Reloj reloj;
	private Tetrimino tetriminoActual;
	private Thread hiloReloj;
	
	public Logica() {
		puntos = new Puntaje();
		grilla = new Grilla();
		reloj = new Reloj(this);
	}
	
	/*
	 * 
	 */
	public void moverADerecha() {
		tetriminoActual.moverDerecha();
	}
	
	/*
	 * 
	 */
	public void moverAIzquierda() {
		tetriminoActual.moverIzquierda();
	}
	
	
	/*
	 * 
	 */
	public void moverParaAbajo() {
		boolean colisiono = false;
		int filasCompletadas = 0;
		
		colisiono = tetriminoActual.moverAbajo();
		
		if(colisiono) {
			filasCompletadas = grilla.despejar(tetriminoActual.filasOcupadas());
			actualizarPuntaje(filasCompletadas);
		}
	}
	
	/*
	 * 
	 */
	public void rotarDerecha() {
		tetriminoActual.rotarDerecha();
	}
	
	/*
	 * 
	 */
	public void rotarIzquierda() {
		tetriminoActual.rotarIzquierda();
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
		
	}

	//Este método recibe el tiempo directamente desde el reloj y actualiza a la GUI
	public void ActualizarRelojGui(int minutos, int segundos) {
		// TODO Auto-generated method stub
		
	}
}
