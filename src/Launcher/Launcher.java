package Launcher;

import java.awt.EventQueue;

import GUI.*;
import Logica.*;

public class Launcher {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logica nuevoJuego = new Logica();
					Interfaz frame = new Interfaz(nuevoJuego);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		/*Logica nuevoJuego = new Logica();
		Interfaz presentacion = new Interfaz(nuevoJuego);
    	presentacion.setVisible(true);*/
}
