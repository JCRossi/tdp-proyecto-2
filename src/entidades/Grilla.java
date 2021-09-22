package entidades;

import entidades.Tetrimino;

public class Grilla {
	private Tetrimino actual;
	private int filas;
	private int columnas;
	private static Bloque[][] matriz;
	
	public Grilla() {
		filas = 21;
		columnas = 10;
		matriz = new Bloque[21][10];
		
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				matriz[i][j] = null;
	}
	
	public boolean chequearColision(char direccion) {
		return actual.checkMovementCollision(direccion);	
	}
	
	public void move(char direccion) {
		actual.movement(direccion);
		//settear bloques nueva posicion
	}
	
	public int despejar() {
		int filasDespejadas = 0;
		
		
		
		return filasDespejadas;
	}
	
	public static boolean availableSpace(int R, int C) {
		return matriz[R][C]==null;
	}
}
