package entidades;

public class TetriminoT extends Tetrimino {

	public TetriminoT() {
		blocks = new Bloque[4];
		blocks[2]= new Bloque(0,4,"violeta");
		blocks[1]= new Bloque(1,3,"violeta");
		blocks[0]= new Bloque(1,4,"violeta");
		blocks[3]= new Bloque(1,5,"violeta");
		rotation = 0;		
	}

	@Override
	public void moverDerecha() {
		int filaCentro = blocks[0].getFila();
		int columnaCentro = blocks[0].getColumna();
		int[][] bloquesConflictivos;
		switch(rotation) {
		
		case 0:{
			if (columnaCentro+2<10) {
				bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0]=filaCentro-1;
				bloquesConflictivos[0][1]=columnaCentro+1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro+2;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro+1);
					blocks[1].setColumna(columnaCentro);
					blocks[2].setColumna(columnaCentro+1);
					blocks[3].setColumna(columnaCentro+2);
				}
			}
			
		}
		
		case 90:{
			if (columnaCentro+2<10) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro-1;
				bloquesConflictivos[0][1]=columnaCentro+1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro+2;
				bloquesConflictivos[2][0]=filaCentro+1;
				bloquesConflictivos[2][1]=columnaCentro+1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro+1);
					blocks[1].setColumna(columnaCentro+1);
					blocks[2].setColumna(columnaCentro+1);
					blocks[3].setColumna(columnaCentro+2);
				}
			}
		}

		case 180:{
			if (columnaCentro+2<10) {
				bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0]=filaCentro+1;
				bloquesConflictivos[0][1]=columnaCentro+1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro+2;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro+1);
					blocks[1].setColumna(columnaCentro+1);
					blocks[2].setColumna(columnaCentro);
					blocks[3].setColumna(columnaCentro+2);
				}
			}
		}

		case 270:{
			if (columnaCentro+1<10) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro+1;
				bloquesConflictivos[0][1]=columnaCentro+1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro+1;
				bloquesConflictivos[2][0]=filaCentro-1;
				bloquesConflictivos[2][1]=columnaCentro+1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro+1);
					blocks[1].setColumna(columnaCentro+1);
					blocks[2].setColumna(columnaCentro);
					blocks[3].setColumna(columnaCentro+1);
				}
			}
		}
		
		}
		
	}

	@Override
	public void moverIzquierda() {
		int filaCentro = blocks[0].getFila();
		int columnaCentro = blocks[0].getColumna();
		int[][] bloquesConflictivos;
		switch(rotation) {
		
		case 0:{
			if (columnaCentro-2>=0) {
				bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0]=filaCentro-1;
				bloquesConflictivos[0][1]=columnaCentro-1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro-2;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro-1);
					blocks[1].setColumna(columnaCentro-2);
					blocks[2].setColumna(columnaCentro-1);
					blocks[3].setColumna(columnaCentro);
				}
			}
			
		}
		
		case 90:{
			if (columnaCentro-1>=0) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro-1;
				bloquesConflictivos[0][1]=columnaCentro-1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro-1;
				bloquesConflictivos[2][0]=filaCentro+1;
				bloquesConflictivos[2][1]=columnaCentro-1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro-1);
					blocks[1].setColumna(columnaCentro-1);
					blocks[2].setColumna(columnaCentro-1);
					blocks[3].setColumna(columnaCentro);
				}
			}
		}

		case 180:{
			if (columnaCentro-2>=0) {
				bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0]=filaCentro+1;
				bloquesConflictivos[0][1]=columnaCentro-1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro-2;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro-1);
					blocks[1].setColumna(columnaCentro-1);
					blocks[2].setColumna(columnaCentro-2);
					blocks[3].setColumna(columnaCentro);
				}
			}
		}

		case 270:{
			if (columnaCentro-2>=0) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro-1;
				bloquesConflictivos[0][1]=columnaCentro-1;
				bloquesConflictivos[1][0]=filaCentro;
				bloquesConflictivos[1][1]=columnaCentro-2;
				bloquesConflictivos[2][0]=filaCentro+1;
				bloquesConflictivos[2][1]=columnaCentro-1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[0].setColumna(columnaCentro-1);
					blocks[1].setColumna(columnaCentro-1);
					blocks[2].setColumna(columnaCentro-2);
					blocks[3].setColumna(columnaCentro-1);
				}
			}
		}
		
		}
		
	}

	@Override
	public boolean moverAbajo() {
		boolean colision = false;
		int filaCentro = blocks[0].getFila();
		int columnaCentro = blocks[0].getColumna();
		int[][] bloquesConflictivos;
		switch(rotation) {
		
		case 0:{
			if (filaCentro+1<21) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro+1;
				bloquesConflictivos[0][1]=columnaCentro-1;
				bloquesConflictivos[1][0]=filaCentro+1;
				bloquesConflictivos[1][1]=columnaCentro;
				bloquesConflictivos[2][0]=filaCentro+1;
				bloquesConflictivos[2][1]=columnaCentro+1;
				colision = Grilla.chequearColision(bloquesConflictivos);
				if(!colision) {
					blocks[0].setFila(filaCentro+1);
					blocks[1].setFila(filaCentro+1);
					blocks[2].setFila(filaCentro);
					blocks[3].setFila(filaCentro+1);
				}
			}
			
		}
		
		case 90:{
			if (filaCentro+2<21) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro+2;
				bloquesConflictivos[0][1]=columnaCentro;
				bloquesConflictivos[1][0]=filaCentro+1;
				bloquesConflictivos[1][1]=columnaCentro+1;
				colision = Grilla.chequearColision(bloquesConflictivos);
				if(!colision) {
					blocks[0].setFila(filaCentro+1);
					blocks[1].setFila(filaCentro+2);
					blocks[2].setFila(filaCentro);
					blocks[3].setFila(filaCentro+1);
				}
			}
		}

		case 180:{
			if (filaCentro+2<21) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro+1;
				bloquesConflictivos[0][1]=columnaCentro-1;
				bloquesConflictivos[1][0]=filaCentro+2;
				bloquesConflictivos[1][1]=columnaCentro;
				bloquesConflictivos[2][0]=filaCentro+1;
				bloquesConflictivos[2][1]=columnaCentro+1;
				colision = Grilla.chequearColision(bloquesConflictivos);
				if(!colision) {
					blocks[0].setFila(filaCentro+1);
					blocks[1].setFila(filaCentro+2);
					blocks[2].setFila(filaCentro+1);
					blocks[3].setFila(filaCentro+1);
				}
			}
		}

		case 270:{
			if (filaCentro+2<21) {
				bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0]=filaCentro+2;
				bloquesConflictivos[0][1]=columnaCentro;
				bloquesConflictivos[1][0]=filaCentro+1;
				bloquesConflictivos[1][1]=columnaCentro-1;
				colision = Grilla.chequearColision(bloquesConflictivos);
				if(!colision) {
					blocks[0].setFila(filaCentro+1);
					blocks[1].setFila(filaCentro+2);
					blocks[2].setFila(filaCentro+1);
					blocks[3].setFila(filaCentro);
				}
			}
		}
		
		}
		return colision;
	}

	@Override
	public void rotarDerecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotarIzquierda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] filasOcupadas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
