package entidades;

public class TetriminoI extends Tetrimino{

	public TetriminoI() {
		blocks = new Bloque[4];
		for (int i=0; i<4; i++) 
			blocks[i]= new Bloque(1,6-i,"celeste");
		rotation = 90;		
	}

	@Override
	public void moverDerecha() {
		int[][] bloquesConflictivos = null;
		if(blocks[0].getColumna()!=9) {
			if (rotation==0) {
				bloquesConflictivos =  new int[4][2];
				for (int i=0; i<4; i++) {
					bloquesConflictivos[i][0] = blocks[i].getFila();
					bloquesConflictivos[i][1] = blocks[i].getColumna() + 1;
				}
			} else {
				bloquesConflictivos =  new int[1][2];
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() + 1;		
			}
			if(!Grilla.chequearColision(bloquesConflictivos)) {
				for(int i = 0; i<4; i++)
					blocks[i].setColumna(blocks[i].getColumna()+1);
			}	
		}
	}

	@Override
	public void moverIzquierda() {
		int[][] bloquesConflictivos = null;
		if(blocks[3].getColumna()!=0) {
			if (rotation==0) {
				bloquesConflictivos =  new int[4][2];
				for (int i=0; i<4; i++) {
					bloquesConflictivos[i][0] = blocks[i].getFila();
					bloquesConflictivos[i][1] = blocks[i].getColumna() - 1;
				}
			} else {
				bloquesConflictivos =  new int[1][2];
				bloquesConflictivos[0][0] = blocks[3].getFila();
				bloquesConflictivos[0][1] = blocks[3].getColumna() - 1;			
			}
			if(!Grilla.chequearColision(bloquesConflictivos)) {
				for(int i = 0; i<4; i++)
					blocks[i].setColumna(blocks[i].getColumna()-1);
			}
		}
		
	}

	@Override
	public boolean moverAbajo() {
		boolean puedeBajar = true;
		int[][] bloquesConflictivos = null;
		if(blocks[3].getFila()!=20) {
			if (rotation==90) {
				bloquesConflictivos =  new int[4][2];
				for (int i=0; i<4; i++) {
					bloquesConflictivos[i][0] = blocks[i].getFila() + 1;
					bloquesConflictivos[i][1] = blocks[i].getColumna();
				}
			} else {
				bloquesConflictivos =  new int[1][2];
				bloquesConflictivos[0][0] = blocks[3].getFila() + 1;
				bloquesConflictivos[0][1] = blocks[3].getColumna();			
			}
			puedeBajar = !Grilla.chequearColision(bloquesConflictivos);
			if(puedeBajar) {
				for(int i = 0; i<4; i++)
					blocks[i].setFila(blocks[i].getFila()+1);
			}
		} else puedeBajar = false;
		return puedeBajar;	
	}

	@Override
	public void rotarDerecha() {
		int[][] bloquesConflictivos = new int[4][2];
		if (rotation==0) {
			int fila = blocks[2].getFila();
			int columna = blocks[2].getColumna();
			for(int i = 0; i<4; i++) {
				bloquesConflictivos[i][0] = fila;
			}
			if(columna<1) {
				bloquesConflictivos[0][1] = 3;
				bloquesConflictivos[1][1] = 2;
				bloquesConflictivos[2][1] = 1;
				bloquesConflictivos[3][1] = 0;
				if (Grilla.chequearColision(bloquesConflictivos)) {
					bloquesConflictivos[0][1] = columna+1;
					bloquesConflictivos[1][1] = columna;
					bloquesConflictivos[2][1] = columna-1;
					bloquesConflictivos[3][1] = columna-2;
				}
			} else if(columna>7) {
				bloquesConflictivos[0][1] = 9;
				bloquesConflictivos[1][1] = 8;
				bloquesConflictivos[2][1] = 7;
				bloquesConflictivos[3][1] = 6;
				if (Grilla.chequearColision(bloquesConflictivos)) {
					bloquesConflictivos[0][1] = columna+1;
					bloquesConflictivos[1][1] = columna;
					bloquesConflictivos[2][1] = columna-1;
					bloquesConflictivos[3][1] = columna-2;
				}
			} else {
				bloquesConflictivos[0][1] = columna+2;
				bloquesConflictivos[1][1] = columna+1;
				bloquesConflictivos[2][1] = columna;
				bloquesConflictivos[3][1] = columna-1;
				if (Grilla.chequearColision(bloquesConflictivos)) {
					bloquesConflictivos[0][1] = columna+1;
					bloquesConflictivos[1][1] = columna;
					bloquesConflictivos[2][1] = columna-1;
					bloquesConflictivos[3][1] = columna-2;
					
				}
			}
			if(!Grilla.chequearColision(bloquesConflictivos)) {
				for(int i = 0; i<4; i++) {
					blocks[i].setFila(bloquesConflictivos[i][0]);
					blocks[i].setColumna(bloquesConflictivos[i][1]);	
				}
				rotation=90;

			}
		} else {
			int fila = blocks[2].getFila();
			int columna = blocks[2].getColumna();
			for(int i = 0; i<4; i++) {
				bloquesConflictivos[i][1] = columna;
			}
			if(fila<2) {
				bloquesConflictivos[0][0] = 0;
				bloquesConflictivos[1][0] = 1;
				bloquesConflictivos[2][0] = 2;
				bloquesConflictivos[3][0] = 3;
				if (Grilla.chequearColision(bloquesConflictivos)) {
					bloquesConflictivos[0][0] = fila-1;
					bloquesConflictivos[1][0] = fila;
					bloquesConflictivos[2][0] = fila+1;
					bloquesConflictivos[3][0] = fila+2;
				}
			} else if(fila>19) {
				bloquesConflictivos[0][0] = 17;
				bloquesConflictivos[1][0] = 18;
				bloquesConflictivos[2][0] = 19;
				bloquesConflictivos[3][0] = 20;
				if (Grilla.chequearColision(bloquesConflictivos)) {
					bloquesConflictivos[0][0] = fila-1;
					bloquesConflictivos[1][0] = fila;
					bloquesConflictivos[2][0] = fila+1;
					bloquesConflictivos[3][0] = fila+2;
				}
			} else {
				bloquesConflictivos[0][0] = fila-2;
				bloquesConflictivos[1][0] = fila-1;
				bloquesConflictivos[2][0] = fila;
				bloquesConflictivos[3][0] = fila+1;
				if (Grilla.chequearColision(bloquesConflictivos)) {
					bloquesConflictivos[0][0] = fila-1;
					bloquesConflictivos[1][0] = fila;
					bloquesConflictivos[2][0] = fila+1;
					bloquesConflictivos[3][0] = fila+2;
				}
			}
			if(!Grilla.chequearColision(bloquesConflictivos)) {
				for(int i = 0; i<4; i++) {
					blocks[i].setFila(bloquesConflictivos[i][0]);
					blocks[i].setColumna(bloquesConflictivos[i][1]);	
				}
				rotation=0;

			}
		}
	}

	@Override
	public void rotarIzquierda() {
		rotarDerecha();
	}
	
	public int[] filasOcupadas() {
		int[] filasOcupadas;
		if(rotation==0) {
			filasOcupadas = new int[4];
			
			filasOcupadas[0] = blocks[0].getFila();
			filasOcupadas[1] = blocks[1].getFila();
			filasOcupadas[2] = blocks[2].getFila();
			filasOcupadas[3] = blocks[3].getFila();
		} else {
			filasOcupadas = new int[1];			
			filasOcupadas[0] = blocks[2].getFila();
		}
		return filasOcupadas;
	}

}