package Logica;

import entidades.*;

public class Logica {
	private Puntaje puntos;
	private Grilla grilla;
	private Reloj reloj;
	
	public Logica() {
		puntos = new Puntaje();
		grilla = new Grilla();
		reloj = new Reloj(this);
	}
	
	/*
	 * 
	 */
	public void caer() {
		boolean puedeCaer;
		int filasCompletadas;
		puedeCaer = !grilla.chequearColision('d');
		filasCompletadas = 0;
		
		if(puedeCaer) {
			grilla.move('d');
			//actualizar gui
		}
		else {
			filasCompletadas = grilla.despejar();
			
			if(filasCompletadas != 0)
				sumarPuntaje(filasCompletadas);
		}
	}
	
	
	/*
	 * 
	 */
	public void moverADerecha() {
		boolean sePuedeMover = !grilla.chequearColision('r');
		
		if(sePuedeMover)
			grilla.move('r');
	}
	
	/*
	 * 
	 */
	public void moverAIzquierda() {
		boolean sePuedeMover = grilla.chequearColision('l');
		
		if(sePuedeMover)
			grilla.move('l');
	}
	
	
	/*
	 * 
	 */
	public void moverParaAbajo() {
		caer();
	}
	
	/*
	 * Actualiza el puntaje del juego en base a las filas que se hayan completado
	 * @param filasCompletadas Cantidad de filas que se completaron
	 */
	public void sumarPuntaje(int filasCompletadas) {
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
	}
	
	public void finalizarJuego() {
		
	}

	//Este método recibe el tiempo directamente desde el reloj y actualiza a la GUI
	public void ActualizarRelojGui(int minutos, int segundos) {
		// TODO Auto-generated method stub
		
	}
}
