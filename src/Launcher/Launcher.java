package Launcher;

import java.awt.EventQueue;
import java.io.File;

import GUI.*;
import Logica.*;
import entidades.PlayMusic;

public class Launcher {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					Logica nuevoJuego = new Logica(frame);
					frame.setVisible(true);
					File archivo = new File("src/Music/Tetris.wav");
					PlayMusic p = new PlayMusic(archivo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
