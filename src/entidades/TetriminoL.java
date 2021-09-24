package entidades;

public class TetriminoL extends Tetrimino {
	
	public TetriminoL() {
		blocks = new Bloque[4];
		
		blocks[0] = new Bloque(0, 5, "naranja");
		blocks[1] = new Bloque(1, 5, "naranja");
		blocks[2] = new Bloque(1, 4, "naranja");
		blocks[3] = new Bloque(1, 3, "naranja");
		
		
		rotation = 0;
	}

	
	@Override
	public boolean moverAbajo() {
		boolean colision = false;
		
		switch(rotation) {
		case 0:{
			int[][] bloquesConflictivos = new int[3][2];
			
			if(blocks[1].getFila() != 20) {
				bloquesConflictivos[0][0] = blocks[1].getFila() + 1;
				bloquesConflictivos[0][1] = blocks[1].getColumna();
				bloquesConflictivos[1][0] = blocks[2].getFila() + 1;
				bloquesConflictivos[1][1] = blocks[2].getColumna();
				bloquesConflictivos[2][0] = blocks[3].getFila() + 1;
				bloquesConflictivos[2][1] = blocks[3].getColumna();
			
				colision = Grilla.chequearColision(bloquesConflictivos);
			
				if(!colision) {
					for(int i = 0; i < 4; i++)
						blocks[i].setFila(blocks[i].getFila() + 1);
				}
				
			}
			else 
				colision = true;
		}
			
		case 90:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[1].getFila() != 20) {
				bloquesConflictivos[0][0] = blocks[0].getFila() + 1;
				bloquesConflictivos[0][1] = blocks[0].getColumna();
				bloquesConflictivos[1][0] = blocks[1].getFila() + 1;
				bloquesConflictivos[1][1] = blocks[1].getColumna();
				
				colision = Grilla.chequearColision(bloquesConflictivos);
				
				if(!colision) {
					for(int i = 0; i < 4; i++)
						blocks[i].setFila(blocks[i].getFila() + 1);
				}
			}
			else
				colision = true;
			
		}
		case 180:{
			int[][] bloquesConflictivos = new int[3][2];
			
			if(blocks[0].getFila() != 20) {
				bloquesConflictivos[0][0] = blocks[0].getFila() + 1;
				bloquesConflictivos[0][1] = blocks[0].getColumna();
				bloquesConflictivos[1][0] = blocks[2].getFila() + 1;
				bloquesConflictivos[1][1] = blocks[2].getColumna();
				bloquesConflictivos[2][0] = blocks[3].getFila() + 1;
				bloquesConflictivos[2][1] = blocks[3].getColumna();
				
				colision = Grilla.chequearColision(bloquesConflictivos);
				
				if(!colision) {
					for(int i = 0; i < 4; i++)
						blocks[i].setFila(blocks[i].getFila() + 1);
				}
			}
			else
				colision = true;
			
		}
		case 270:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[3].getFila() != 20) {
				bloquesConflictivos[0][0] = blocks[0].getFila() + 1;
				bloquesConflictivos[0][1] = blocks[0].getColumna();
				bloquesConflictivos[1][0] = blocks[3].getFila() + 1;
				bloquesConflictivos[1][1] = blocks[3].getColumna();
				
				colision = Grilla.chequearColision(bloquesConflictivos);
				
				if(!colision) {
					for(int i = 0; i < 4; i++)
						blocks[i].setFila(blocks[i].getFila() + 1);
				}
			}
			else
				colision = true;
			
			}
		}
	return !(colision);
	}
	
	
	@Override
	public void moverDerecha() {
		switch(rotation) {
		case 0:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[1].getColumna() != 9) {
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() + 1;
				bloquesConflictivos[1][0] = blocks[1].getFila();
				bloquesConflictivos[1][1] = blocks[1].getColumna() + 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() + 1);
				}
			}
		}
		
		case 90:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[0].getColumna() != 9) {
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() + 1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna() + 1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna() + 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() + 1);
				}
			}
		}
		
		case 180:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[3].getColumna() != 9) {
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() + 1;
				bloquesConflictivos[1][0] = blocks[3].getFila();
				bloquesConflictivos[1][1] = blocks[3].getColumna() + 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() + 1);
				}
			}
		}
		
		case 270:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[1].getColumna() != 9) {
				bloquesConflictivos[0][0] = blocks[1].getFila();
				bloquesConflictivos[0][1] = blocks[1].getColumna() + 1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna() + 1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna() + 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() + 1);
					}
				}
			}
		}
	}

	@Override
	public void moverIzquierda() {
		switch(rotation) {
		case 0:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[3].getColumna() != 0) {
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() - 1;
				bloquesConflictivos[1][0] = blocks[3].getFila();
				bloquesConflictivos[1][1] = blocks[3].getColumna() - 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() - 1);
				}
			}
		}
		
		case 90:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[1].getColumna() != 0) {
				bloquesConflictivos[0][0] = blocks[1].getFila();
				bloquesConflictivos[0][1] = blocks[1].getColumna() - 1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna() - 1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna() - 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() - 1);
				}
			}
		}
		
		case 180:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[1].getColumna() != 0) {
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() - 1;
				bloquesConflictivos[1][0] = blocks[1].getFila();
				bloquesConflictivos[1][1] = blocks[1].getColumna() - 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() - 1);
				}
			}
		}
		
		case 270:{
			int[][] bloquesConflictivos = new int[2][2];
			
			if(blocks[0].getColumna() != 0) {
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna() - 1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna() - 1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna() - 1;
				
				if(!Grilla.chequearColision(bloquesConflictivos)) {
					for(int i = 0; i < 4; i++)
						blocks[i].setColumna(blocks[i].getColumna() - 1);
					}
				}
			}
		}
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
		int[] filasOcupadas = null;
		
		switch(rotation) {
			case 0:{
				filasOcupadas = new int[2];
				
				filasOcupadas[0] = blocks[0].getFila();
				filasOcupadas[1] = blocks[1].getFila();
			}
			
			case 90:{
				filasOcupadas = new int[3];
				
				filasOcupadas[0] = blocks[1].getFila();
				filasOcupadas[1] = blocks[2].getFila();
				filasOcupadas[2] = blocks[3].getFila();
			}
			
			case 180:{
				filasOcupadas = new int[2];
				
				filasOcupadas[0] = blocks[0].getFila();
				filasOcupadas[1] = blocks[1].getFila();
			}
			
			case 270:{
				filasOcupadas = new int[3];
				
				filasOcupadas[0] = blocks[1].getFila();
				filasOcupadas[1] = blocks[2].getFila();
				filasOcupadas[2] = blocks[3].getFila();
			}
		}
		
		return filasOcupadas;
	}
}
