package entidades;

import entidades.Tetrimino;

public class Grilla {
	private Tetrimino actual;
	private int filas;
	private int columnas;
	private Bloque[][] matriz;
	
	public Grilla() {
		filas = 21;
		columnas = 10;
		matriz = new Bloque[21][10];
		
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				matriz[i][j] = null;
	}
	
	public void chequearColision(char direccion) {
		boolean colisiona = actual.checkmovement(direccion);
		
		if (!colisiona)
			actual.movement(direccion);
		else if (direccion=='d')
			// aca va la llamada a chequear la definicion de las lineas pq colisiono hacia abajo 
		;
	}
	
	public int despejar() {
		int filasDespejadas = 0;
		
		
		
		return filasDespejadas;
	}
	
	public static boolean avaiableSpace(int R, int C) {
		return matriz[R][C]==null;
	}
}
