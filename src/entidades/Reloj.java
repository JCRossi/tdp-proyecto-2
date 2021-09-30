package entidades;

import Logica.*;

/*
Debemos hacer algo semejante a esto cuando creamos el reloj. Siendo this una instancia de Logica.
	
	this.reloj = new Reloj(this);
	Thread hiloReloj = new Thread(this.reloj);
	hiloReloj.start();

*/

public class Reloj implements Runnable {
	private boolean continuar;
	private Logica juego;
	private long velocidadCaida;
	private int minutos;
	private int segundos;
	
	public Reloj(Logica juego) {
		this.juego = juego;
		minutos = 0;
		segundos = 0;
		velocidadCaida = 1000;
		continuar = true;
	}
	
	@Override
	public void run() {
		try {
			int sumatoriaParaAumentarSegundos = 0;
			int faltanteParaSegundo = 0;
			while(this.continuar) {
				//Me fijo la cantidad de veces que entra una caida en un segundo y las ejecuto
				while((sumatoriaParaAumentarSegundos+velocidadCaida)<=1000){
					Thread.sleep(velocidadCaida);
					avisarCaidaTetrimino();
					sumatoriaParaAumentarSegundos= (int) (sumatoriaParaAumentarSegundos +velocidadCaida);
				}
				//Hago una pausa hasta completar un segundo y lo sumo al contador de segundos 
				faltanteParaSegundo = 1000-sumatoriaParaAumentarSegundos;
				Thread.sleep(faltanteParaSegundo);
				
				//Guardo la diferencia entre la pausa para completar el segundo y el tiempo a esperar para la siguiente caida
				sumatoriaParaAumentarSegundos = (int) (velocidadCaida - faltanteParaSegundo);
				
				if(segundos == 59) {
					avisarPasaUnMinuto();
				}else 
					avisarPasaUnSegundo();

				
				
				//Si tengo diferencia la espero y aviso caida del tetrimino
				if(sumatoriaParaAumentarSegundos != 0) {
					Thread.sleep(sumatoriaParaAumentarSegundos);
					avisarCaidaTetrimino();
				}

			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	
	private void avisarCaidaTetrimino() {
		juego.operar(2);//MOVER_ABAJO
	}
	
	private void avisarPasaUnMinuto() {
		segundos = 0;
		minutos++;
		velocidadCaida = (long) (velocidadCaida * 0.75);
		juego.ActualizarRelojGui(minutos,segundos);
	}
	
	public void avisarPasaUnSegundo() {
		segundos++;
		juego.ActualizarRelojGui(minutos, segundos);
	}
	
	public int getMinutos(){
		return minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public void frenarReloj() {
		continuar = false;
	}

	public void reanudarReloj() {
		continuar = true;
		
	}

}

	
