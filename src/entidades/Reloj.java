package entidades;

import Logica.*;

/*
Debemos hacer algo semejante a esto cuando creamos el reloj. Siendo this una instancia de Logica.
	
	this.reloj = new Reloj(this);
	Thread hiloReloj = new Thread(this.reloj);
	hiloReloj.start();

*/

public class Reloj implements Runnable {
	private Logica juego;
	private long velocidadCaida;
	private int minutos;
	private int segundos;
	
	public Reloj(Logica juego) {
		this.juego = juego;
		minutos = 0;
		segundos = 0;
		velocidadCaida = 1000;
		
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				if(segundos == 59) {
					avisarPasaUnMinuto();
				}else
					segundos++;
				
				avisarCaidaTetrimino();
				Thread.sleep(velocidadCaida);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	
	private void avisarCaidaTetrimino() {
		juego.caer();
	}
	
	private void avisarPasaUnMinuto() {
		segundos = 0;
		minutos++;
		velocidadCaida = (long) (velocidadCaida * 0.75);
	}
	
	public int getMinutos(){
		return minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
}

	
