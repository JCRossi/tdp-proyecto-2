package entidades;

public class TetriminoO extends Tetrimino{


	public TetriminoO() {
		blocks = new Bloque[4];
		blocks[0]= new Bloque(0,4,"amarillo");
		blocks[1]= new Bloque(1,4,"amarillo");
		blocks[2]= new Bloque(0,5,"amarillo");
		blocks[3]= new Bloque(1,5,"amarillo");
	}

	@Override
	public void moverDerecha() {
		int columna = blocks[2].getColumna();
		if(columna!=9) {
			int[][] bloquesConflictivos = new int[2][2];
			bloquesConflictivos[0][0] = blocks[2].getFila();
			bloquesConflictivos[0][1] =	columna+1;
			bloquesConflictivos[1][0] = blocks[3].getFila();
			bloquesConflictivos[1][1] = blocks[3].getColumna()+1;
			if(!Grilla.chequearColision(bloquesConflictivos)) {
				for(int i = 0; i<4; i++)
					blocks[i].setColumna(blocks[i].getColumna()+1);
			}
		}
	}

	@Override
	public void moverIzquierda() {
		int columna = blocks[0].getColumna();
		if(columna!=0) {
			int[][] bloquesConflictivos = new int[2][2];
			bloquesConflictivos[0][0] = blocks[0].getFila();
			bloquesConflictivos[0][1] =	columna-1;
			bloquesConflictivos[1][0] = blocks[1].getFila();
			bloquesConflictivos[1][1] = blocks[1].getColumna()-1;
			if(!Grilla.chequearColision(bloquesConflictivos)) {
				for(int i = 0; i<4; i++)
					blocks[i].setColumna(blocks[i].getColumna()-1);
			}
		}
	}

	@Override
	public boolean moverAbajo() {
		int fila = blocks[1].getFila();
		boolean colision = false;
		if(fila!=20) {
			int[][] bloquesConflictivos = new int[2][2];
			bloquesConflictivos[0][0] = fila+1;
			bloquesConflictivos[0][1] =	blocks[1].getColumna();
			bloquesConflictivos[1][0] = blocks[3].getFila()+1;
			bloquesConflictivos[1][1] = blocks[3].getColumna();
			colision = Grilla.chequearColision(bloquesConflictivos);
			if(!colision) {
				for(int i = 0; i<4; i++)
					blocks[i].setFila(blocks[i].getFila()+1);
			}
		}
		return colision;
	}

	@Override
	public void rotarDerecha() {
	}

	@Override
	public void rotarIzquierda() {
	}
	
	public int[] filasOcupadas() {
		int[] filasOcupadas = new int[2];
		filasOcupadas[0]= blocks[0].getFila();
		filasOcupadas[1]= blocks[1].getFila();
		return filasOcupadas;
		
	}
		
	

}
