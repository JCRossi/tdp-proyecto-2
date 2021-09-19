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
	
}
