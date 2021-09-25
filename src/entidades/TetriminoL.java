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
			int[][] bloquesConflictivos = new int[3][2];
			
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
			int[][] bloquesConflictivos = new int[3][2];
			
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
			int[][] bloquesConflictivos = new int[3][2];
			
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
			int[][] bloquesConflictivos = new int[3][2];
			
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
		switch(rotation) {
		case 0:{
			if(blocks[0].getFila() != 0) { //Si no acaba de spawnear
				int[][] bloquesConflictivos = new int[2][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia;
				bloquesConflictivos[1][0] = filaReferencia-2;
				bloquesConflictivos[1][1] = columnaReferencia;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {//Rotacion1
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia-1);
					
					blocks[3].setFila(filaReferencia-2);
					blocks[3].setColumna(columnaReferencia);
					rotation = 90;
					
				}else {	//Rotacion2
					bloquesConflictivos[0][0] = filaReferencia-1;
					bloquesConflictivos[0][1] = columnaReferencia-1;
					bloquesConflictivos[1][0] = filaReferencia-2;
					bloquesConflictivos[1][1] = columnaReferencia-1;
					
					if( !Grilla.chequearColision(bloquesConflictivos) ) {
						blocks[0].setFila(filaReferencia);
						blocks[0].setColumna(columnaReferencia);
						
						blocks[1].setFila(filaReferencia);
						blocks[1].setColumna(columnaReferencia-1);
						
						blocks[2].setFila(filaReferencia-1);
						blocks[2].setColumna(columnaReferencia-1);
						
						blocks[3].setFila(filaReferencia-2);
						blocks[3].setColumna(columnaReferencia-1);
						rotation = 90;
					}
				}
				
			}else { //Acaba de spawnear
				int[][] bloquesConflictivos = new int[3][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia;
				bloquesConflictivos[2][0] = filaReferencia-1;
				bloquesConflictivos[2][1] = columnaReferencia;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[3].setFila(filaReferencia-1);
					blocks[3].setColumna(columnaReferencia);
					rotation = 90;
				}
			}
	
		}
		case 90:{
			if(blocks[0].getColumna() != 1) {
				
				int[][] bloquesConflictivos = new int[3][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia-1;
				bloquesConflictivos[2][0] = filaReferencia;
				bloquesConflictivos[2][1] = columnaReferencia+1;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia-1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia+1);
					rotation = 180;
				}
	
			}
			if(rotation !=180 && blocks[0].getColumna() != 9) {
				int[][] bloquesConflictivos = new int[2][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia+2;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia+2);
					rotation = 180;
				}
			}
				
		}
		case 180:{
			

			int[][] bloquesConflictivos = new int[3][2];
			int filaReferencia = blocks[2].getFila();
			int columnaReferencia = blocks[2].getColumna();
			
			
			bloquesConflictivos[0][0] = filaReferencia-1;
			bloquesConflictivos[0][1] = columnaReferencia-1;
			bloquesConflictivos[1][0] = filaReferencia-1;
			bloquesConflictivos[1][1] = columnaReferencia;
			bloquesConflictivos[2][0] = filaReferencia+1;
			bloquesConflictivos[2][1] = columnaReferencia;
			
			if( !Grilla.chequearColision(bloquesConflictivos) ) {
				blocks[0].setFila(filaReferencia-1);
				blocks[0].setColumna(columnaReferencia-1);
				
				blocks[1].setFila(filaReferencia-1);
				blocks[1].setColumna(columnaReferencia);
				
				blocks[3].setFila(filaReferencia+1);
				blocks[3].setColumna(columnaReferencia);
				rotation = 270;
			}else {
				
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia;
				bloquesConflictivos[1][0] = filaReferencia-1;
				bloquesConflictivos[1][1] = columnaReferencia+1;
				bloquesConflictivos[2][0] = filaReferencia+1;
				bloquesConflictivos[2][1] = columnaReferencia+1;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia-1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia-1);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia+1);
					rotation = 270;
					
				}
				
				
			}
				
			
		}
		case 270:{
			if(blocks[1].getFila() != 9) {//CASO 1
				
				int[][] bloquesConflictivos = new int[3][2];
				int filaReferencia = blocks[3].getFila();
				int columnaReferencia = blocks[3].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia+1;
				bloquesConflictivos[2][0] = filaReferencia;
				bloquesConflictivos[2][1] = columnaReferencia-1;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia-1);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia-1);
					rotation = 0;
				}
					
				
			}
			
			if(rotation !=0 && blocks[0].getFila() != 0) { //CASO 2
				int[][] bloquesConflictivos = new int[2][2];
				int filaReferencia = blocks[3].getFila();
				int columnaReferencia = blocks[3].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia-2;

				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia-1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia-1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia-2);
					rotation = 0;
				
				}
			}
			
			
			
		}
		}
		
	}

	@Override
	public void rotarIzquierda() {
		switch(rotation) {
		case 0:{
			if(blocks[0].getFila() != 0) { //Si no acaba de spawnear
				int[][] bloquesConflictivos = new int[3][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia-2;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia-2;
				bloquesConflictivos[1][1] = columnaReferencia;
				bloquesConflictivos[2][0] = filaReferencia-1;
				bloquesConflictivos[2][1] = columnaReferencia;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {//Rotacion1
					blocks[0].setFila(filaReferencia-2);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia-2);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia-1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia);
					rotation = 270;
				}else {
					int[][] bloquesConflictivos1 = new int[2][2];
		
					bloquesConflictivos1[0][0] = filaReferencia-2;
					bloquesConflictivos1[0][1] = columnaReferencia;
					bloquesConflictivos1[1][0] = filaReferencia-2;
					bloquesConflictivos1[1][1] = columnaReferencia+1;
					
					if( !Grilla.chequearColision(bloquesConflictivos1) ) {
						blocks[0].setFila(filaReferencia-2);
						blocks[0].setColumna(columnaReferencia);
						
						blocks[1].setFila(filaReferencia-2);
						blocks[1].setColumna(columnaReferencia+1);
						
						blocks[2].setFila(filaReferencia-1);
						blocks[2].setColumna(columnaReferencia+1);
						
						blocks[3].setFila(filaReferencia);
						blocks[3].setColumna(columnaReferencia+1);
						rotation = 270;
						
						
					}
				}
			}else { //Si acaba de spawnear
			
				int[][] bloquesConflictivos = new int[3][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia-1;
				bloquesConflictivos[1][1] = columnaReferencia;
				bloquesConflictivos[2][0] = filaReferencia+1;
				bloquesConflictivos[2][1] = columnaReferencia;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {//Rotacion1
					blocks[0].setFila(filaReferencia-1);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia-1);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia);
					rotation = 270;
				}	
				
			}
	
		}
		case 90:{
			if(blocks[2].getColumna() != 0) {//Si no esta en la pared izquierda rotacion 1
				
				int[][] bloquesConflictivos = new int[2][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia-1;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[2].setFila(filaReferencia+1);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia-1);
					
					rotation = 0;
					
					
				}
			}
			
			if(rotation!=0 && blocks[0].getColumna() != 9) {
				
				int[][] bloquesConflictivos = new int[2][2];
				int filaReferencia = blocks[2].getFila();
				int columnaReferencia = blocks[2].getColumna();
				
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia+2;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia+2;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia+2);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia+2);
					
					blocks[2].setFila(filaReferencia+1);
					blocks[2].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia);
					
					rotation = 0;	
					
				}
				
			}
			
		}
		case 180:{

			int[][] bloquesConflictivos = new int[3][2];
			int filaReferencia = blocks[2].getFila();
			int columnaReferencia = blocks[2].getColumna();
			
			
			bloquesConflictivos[0][0] = filaReferencia+1;
			bloquesConflictivos[0][1] = columnaReferencia+1;
			bloquesConflictivos[1][0] = filaReferencia+1;
			bloquesConflictivos[1][1] = columnaReferencia;
			bloquesConflictivos[2][0] = filaReferencia-1;
			bloquesConflictivos[2][1] = columnaReferencia;
			
			if( !Grilla.chequearColision(bloquesConflictivos) ) {//Rotacion 1
				blocks[0].setFila(filaReferencia+1);
				blocks[0].setColumna(columnaReferencia+1);
				
				blocks[1].setFila(filaReferencia+1);
				blocks[1].setColumna(columnaReferencia);
				

				
				blocks[3].setFila(filaReferencia-1);
				blocks[3].setColumna(columnaReferencia);
				
				rotation = 90;	
				
			}else {//Rotacion 2
				
				int[][] bloquesConflictivos1 = new int[2][2];
				
				
				bloquesConflictivos1[0][0] = filaReferencia+1;
				bloquesConflictivos1[0][1] = columnaReferencia;
				bloquesConflictivos1[1][0] = filaReferencia-1;
				bloquesConflictivos1[1][1] = columnaReferencia-1;
				
				if( !Grilla.chequearColision(bloquesConflictivos1) ) {
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia-1);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia-1);
					
					blocks[3].setFila(filaReferencia-1);
					blocks[3].setColumna(columnaReferencia-1);
					
					rotation = 90;	
					
				}
								
			}
	
		}
		case 270:{
			int[][] bloquesConflictivos = new int[3][2];
			int filaReferencia = blocks[2].getFila();
			int columnaReferencia = blocks[2].getColumna();
			
			
			if(blocks[2].getColumna() != 9) {//Si no esta en la pared derecha rotacion 1

				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia-1;
				bloquesConflictivos[2][0] = filaReferencia;
				bloquesConflictivos[2][1] = columnaReferencia+1;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia-1);
						
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia+1);
					
					rotation = 180;
				}
			}
			
			if(rotation != 180 && blocks[0].getColumna() != 0) {//Si no esta en la pared izquierda y no rotó :rotacion 2
			
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia-2;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia-2;
				bloquesConflictivos[2][0] = filaReferencia;
				bloquesConflictivos[2][1] = columnaReferencia-1;
				
				if( !Grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia-2);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia-2);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia-1);
						
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia);
					
					rotation = 180;
				}
				
			}		
			
		}
		}
		
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
