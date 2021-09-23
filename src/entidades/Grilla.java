package entidades;

import entidades.Tetrimino;

public class Grilla {
	
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
	
	public static boolean chequearColision(int[][] posiciones) {
		boolean colisiona = false;
		int i = 0;
		while(!colisiona && i<posiciones.length) {
			
			colisiona = matriz[posiciones[i][0]][posiciones[i][1]]!=null;
			i++;
		}
		return colisiona;	
	}
	

	//completar
	public int despejar() {
		int filasDespejadas = 0;
		
		
		
		return filasDespejadas;
	}
	
	
}
