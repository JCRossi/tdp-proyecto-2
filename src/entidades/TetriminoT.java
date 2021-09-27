package entidades;

public class TetriminoT extends Tetrimino {

	public TetriminoT() {
		blocks = new Bloque[4];
		blocks[2]= new Bloque(0,4,5);
		blocks[1]= new Bloque(1,3,5);
		blocks[0]= new Bloque(1,4,5);
		blocks[3]= new Bloque(1,5,5);
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
		boolean puedeBajar = true;
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
				puedeBajar = Grilla.chequearColision(bloquesConflictivos);
				if(puedeBajar) {
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
				puedeBajar = !Grilla.chequearColision(bloquesConflictivos);
				if(puedeBajar) {
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
				puedeBajar = !Grilla.chequearColision(bloquesConflictivos);
				if(puedeBajar) {
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
				puedeBajar = !Grilla.chequearColision(bloquesConflictivos);
				if(puedeBajar) {
					blocks[0].setFila(filaCentro+1);
					blocks[1].setFila(filaCentro+2);
					blocks[2].setFila(filaCentro+1);
					blocks[3].setFila(filaCentro);
				}
			}
		}
		
		}
		return puedeBajar;
	}

	@Override
	public void rotarDerecha() {
		int filaCentro = blocks[0].getFila();
		int columnaCentro = blocks[0].getColumna();
		int[][] bloquesConflictivos;
		switch(rotation) {
		
		case 0:{
			if(filaCentro<20) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro+1;
				bloquesConflictivos[0][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[1].setColumna(columnaCentro);
					blocks[1].setFila(filaCentro+1);
					rotation = 90;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro;
					bloquesConflictivos[0][1] = columnaCentro-1;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro;
					bloquesConflictivos[3][1] = columnaCentro;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 90;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro-1;
				bloquesConflictivos[0][1] = columnaCentro;
				bloquesConflictivos[1][0] = filaCentro;
				bloquesConflictivos[1][1] = columnaCentro;
				bloquesConflictivos[2][0] = filaCentro-2;
				bloquesConflictivos[2][1] = columnaCentro;
				bloquesConflictivos[3][0] = filaCentro-1;
				bloquesConflictivos[3][1] = columnaCentro+1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 90;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro-1;
					bloquesConflictivos[0][1] = columnaCentro-1;
					bloquesConflictivos[1][0] = filaCentro;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro-2;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 90;
					}
				}
			}
		}
		
		case 90:{
			if(columnaCentro>0) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro-1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[2].setColumna(columnaCentro-1);
					blocks[2].setFila(filaCentro);
					rotation = 180;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro-1;
					bloquesConflictivos[0][1] = columnaCentro;
					bloquesConflictivos[1][0] = filaCentro;
					bloquesConflictivos[1][1] = columnaCentro;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 180;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro+1;
				bloquesConflictivos[1][0] = filaCentro+1;
				bloquesConflictivos[1][1] = columnaCentro+1;
				bloquesConflictivos[2][0] = filaCentro;
				bloquesConflictivos[2][1] = columnaCentro;
				bloquesConflictivos[3][0] = filaCentro;
				bloquesConflictivos[3][1] = columnaCentro+2;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 180;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro-1;
					bloquesConflictivos[0][1] = columnaCentro+1;
					bloquesConflictivos[1][0] = filaCentro;
					bloquesConflictivos[1][1] = columnaCentro+1;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro+2;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 180;
					}
				}
			}
		}
		
		case 180:{
			if(filaCentro>0) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro-1;
				bloquesConflictivos[0][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[3].setColumna(columnaCentro);
					blocks[3].setFila(filaCentro-1);
					rotation = 270;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro;
					bloquesConflictivos[0][1] = columnaCentro+1;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro+1;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 270;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro+1;
				bloquesConflictivos[0][1] = columnaCentro;
				bloquesConflictivos[1][0] = filaCentro+2;
				bloquesConflictivos[1][1] = columnaCentro;
				bloquesConflictivos[2][0] = filaCentro+1;
				bloquesConflictivos[2][1] = columnaCentro-1;
				bloquesConflictivos[3][0] = filaCentro;
				bloquesConflictivos[3][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 270;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro+1;
					bloquesConflictivos[0][1] = columnaCentro+1;
					bloquesConflictivos[1][0] = filaCentro+2;
					bloquesConflictivos[1][1] = columnaCentro+1;
					bloquesConflictivos[2][0] = filaCentro+1;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 270;
					}
				}
			}
		}
		
		case 270:{
			if(columnaCentro<9) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro+1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[1].setColumna(columnaCentro-1);
					blocks[1].setFila(filaCentro);
					blocks[2].setColumna(columnaCentro);
					blocks[2].setFila(filaCentro-1);
					blocks[3].setColumna(columnaCentro+1);
					blocks[3].setFila(filaCentro);
					rotation = 0;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro+1;
					bloquesConflictivos[0][1] = columnaCentro;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro+1;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 0;
					}
				} 
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro-1;
				bloquesConflictivos[1][0] = filaCentro;
				bloquesConflictivos[1][1] = columnaCentro-2;
				bloquesConflictivos[2][0] = filaCentro-1;
				bloquesConflictivos[2][1] = columnaCentro-1;
				bloquesConflictivos[3][0] = filaCentro;
				bloquesConflictivos[3][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 0;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro+1;
					bloquesConflictivos[0][1] = columnaCentro-1;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro-2;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro+1;
					bloquesConflictivos[3][1] = columnaCentro;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 0;
					}
				}
			}
		}
		
		}
		
	}

	@Override
	public void rotarIzquierda() {
		int filaCentro = blocks[0].getFila();
		int columnaCentro = blocks[0].getColumna();
		int[][] bloquesConflictivos;
		switch(rotation) {
		
		case 0:{
			if(filaCentro<20) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro+1;
				bloquesConflictivos[0][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[1].setColumna(columnaCentro);
					blocks[1].setFila(filaCentro+1);
					blocks[2].setColumna(columnaCentro-1);
					blocks[2].setFila(filaCentro);
					blocks[3].setColumna(columnaCentro);
					blocks[3].setFila(filaCentro-1);
					rotation = 270;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro;
					bloquesConflictivos[0][1] = columnaCentro+1;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro+1;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 270;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro-1;
				bloquesConflictivos[0][1] = columnaCentro;
				bloquesConflictivos[1][0] = filaCentro;
				bloquesConflictivos[1][1] = columnaCentro;
				bloquesConflictivos[2][0] = filaCentro-1;
				bloquesConflictivos[2][1] = columnaCentro-1;
				bloquesConflictivos[3][0] = filaCentro-2;
				bloquesConflictivos[3][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 270;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro-1;
					bloquesConflictivos[0][1] = columnaCentro+1;
					bloquesConflictivos[1][0] = filaCentro;
					bloquesConflictivos[1][1] = columnaCentro+1;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro-2;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 270;
					}
				}
			}
		}
		
		case 90:{
			if(columnaCentro>0) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro-1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[1].setColumna(columnaCentro-1);
					blocks[1].setFila(filaCentro);
					rotation = 0;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro+1;
					bloquesConflictivos[0][1] = columnaCentro;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro;
					bloquesConflictivos[3][0] = filaCentro+1;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 0;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro+1;
				bloquesConflictivos[1][0] = filaCentro;
				bloquesConflictivos[1][1] = columnaCentro;
				bloquesConflictivos[2][0] = filaCentro-1;
				bloquesConflictivos[2][1] = columnaCentro+1;
				bloquesConflictivos[3][0] = filaCentro;
				bloquesConflictivos[3][1] = columnaCentro+2;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 0;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro+1;
					bloquesConflictivos[0][1] = columnaCentro+1;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro+1;
					bloquesConflictivos[3][0] = filaCentro+1;
					bloquesConflictivos[3][1] = columnaCentro+2;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 0;
					}
				}
			}
		}
		
		case 180:{
			if(filaCentro>0) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro-1;
				bloquesConflictivos[0][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[2].setColumna(columnaCentro);
					blocks[2].setFila(filaCentro-1);
					rotation = 90;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro;
					bloquesConflictivos[0][1] = columnaCentro-1;
					bloquesConflictivos[1][0] = filaCentro+1;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro;
					bloquesConflictivos[3][1] = columnaCentro;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 90;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro+1;
				bloquesConflictivos[0][1] = columnaCentro;
				bloquesConflictivos[1][0] = filaCentro+2;
				bloquesConflictivos[1][1] = columnaCentro;
				bloquesConflictivos[2][0] = filaCentro;
				bloquesConflictivos[2][1] = columnaCentro;
				bloquesConflictivos[3][0] = filaCentro+1;
				bloquesConflictivos[3][1] = columnaCentro+1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 90;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro+1;
					bloquesConflictivos[0][1] = columnaCentro-1;
					bloquesConflictivos[1][0] = filaCentro+2;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro+1;
					bloquesConflictivos[3][1] = columnaCentro;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 90;
					}
				}
			}
		}
		
		case 270:{
			if(columnaCentro<9) {
				bloquesConflictivos = new int[1][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro+1;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					blocks[3].setColumna(columnaCentro+1);
					blocks[3].setFila(filaCentro);
					rotation = 180;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro-1;
					bloquesConflictivos[0][1] = columnaCentro;
					bloquesConflictivos[1][0] = filaCentro;
					bloquesConflictivos[1][1] = columnaCentro;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro-1;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro+1;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 180;
					}
				}
			} else {
				bloquesConflictivos = new int[4][2];
				bloquesConflictivos[0][0] = filaCentro;
				bloquesConflictivos[0][1] = columnaCentro-1;
				bloquesConflictivos[1][0] = filaCentro+1;
				bloquesConflictivos[1][1] = columnaCentro-1;
				bloquesConflictivos[2][0] = filaCentro;
				bloquesConflictivos[2][1] = columnaCentro-2;
				bloquesConflictivos[3][0] = filaCentro;
				bloquesConflictivos[3][1] = columnaCentro;
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i=0; i<4; i++) {
						blocks[i].setFila(bloquesConflictivos[i][0]);
						blocks[i].setColumna(bloquesConflictivos[i][1]);	
					}
					rotation = 180;
				} else {
					bloquesConflictivos = new int[4][2];
					bloquesConflictivos[0][0] = filaCentro-1;
					bloquesConflictivos[0][1] = columnaCentro-1;
					bloquesConflictivos[1][0] = filaCentro;
					bloquesConflictivos[1][1] = columnaCentro-1;
					bloquesConflictivos[2][0] = filaCentro-1;
					bloquesConflictivos[2][1] = columnaCentro-2;
					bloquesConflictivos[3][0] = filaCentro-1;
					bloquesConflictivos[3][1] = columnaCentro;
					if(!Grilla.chequearColision(bloquesConflictivos)) {
						for(int i=0; i<4; i++) {
							blocks[i].setFila(bloquesConflictivos[i][0]);
							blocks[i].setColumna(bloquesConflictivos[i][1]);	
						}
						rotation = 180;
					}
				}
			}
		}
		
		}
	}

	@Override
	public int[] filasOcupadas() {
		int[] filasOcupadas = null;
		switch (rotation) {
		
		case 0:{
			filasOcupadas = new int[2];
			filasOcupadas[0] = blocks[2].getFila();
			filasOcupadas[1] = blocks[0].getFila();			
		}
		
		case 90:{
			filasOcupadas = new int[3];
			filasOcupadas[0] = blocks[2].getFila();
			filasOcupadas[1] = blocks[0].getFila();
			filasOcupadas[2] = blocks[1].getFila();
		}
		
		case 180:{
			filasOcupadas = new int[2];
			filasOcupadas[0] = blocks[0].getFila();
			filasOcupadas[1] = blocks[1].getFila();
		}
		
		case 270:{
			filasOcupadas = new int[3];
			filasOcupadas[0] = blocks[3].getFila();
			filasOcupadas[1] = blocks[0].getFila();
			filasOcupadas[2] = blocks[1].getFila();
		}
		
		}
		return filasOcupadas;
	}
	
	
}
