package entidades;

import Logica.*;

public class Reloj {
	private Logica juego;
	private float velocidadCaida;
	private int minutos;
	private int segundos;
	
	public Reloj(Logica juego) {
		this.juego = juego;
		minutos = 0;
		segundos = 0;
		velocidadCaida = 1.5f;
	}
	
	private void avisarCaidaTetrimino() {
		juego.caer();
	}
	
	private void avisarPasaUnMinuto() {
		
	}
}
