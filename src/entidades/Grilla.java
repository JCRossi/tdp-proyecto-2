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
	
	public boolean chequearColision(char direccion) {
		boolean colisiona = false;
		
		switch(direccion) {
			case 'A' :
				//Colision caida/movimiento para abajo
			case 'D' :
				//Colision movimiento a derecha
			case 'I' :
				//Colision movimiento a izquierda
		}
		
		return colisiona;
	}
	
	public int despejar() {
		int filasDespejadas = 0;
		
		
		
		return filasDespejadas;
	}
}
