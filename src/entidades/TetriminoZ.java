package entidades;

public class TetriminoZ extends Tetrimino{
	
	public TetriminoZ() {
		blocks = new Bloque[4];
		
		blocks[0] = new Bloque(0, 3, "rojo");
		blocks[1] = new Bloque(0, 4, "rojo");
		blocks[2] = new Bloque(1, 4, "rojo");
		blocks[3] = new Bloque(1, 5, "rojo");
		
		rotation = 0;
	}
	
	@Override
	protected boolean checkMovementCollision(char m) {
		boolean collision = false;
		
		switch(rotation){
			case 0:
				switch(m){
					case 'd':{
						int actualColumn1 = blocks[0].getColumna();
						int actualRow1 = blocks[0].getFila();
						int actualColumn2 = blocks[2].getColumna();
						int actualRow2 = blocks[2].getFila();
						int actualColumn3 = blocks[3].getColumna();
						int actualRow3 = blocks[3].getFila();
					
						if(!Grilla.availableSpace(actualRow1 + 1, actualColumn1))
							collision = true;
						
						if(actualRow2 < 20) {
							if(!Grilla.availableSpace(actualRow2 + 1, actualColumn2))
								collision = true;
						}
						else
							collision = true;
						
						if(actualRow3 < 20) {
							if(!Grilla.availableSpace(actualRow3 + 1, actualColumn3))
								collision = true;
						}
						else
							collision = true;
					}
						
					case 'l':{
						int actualColumn1 = blocks[0].getColumna();
						int actualRow1 = blocks[0].getFila();
						int actualColumn2 = blocks[2].getColumna();
						int actualRow2 = blocks[2].getFila();

						if(actualColumn1 > 0) {
							if(!Grilla.availableSpace(actualRow1, actualColumn1 - 1))
								collision = true;
						}
						else
							collision = true;
						
						if(!Grilla.availableSpace(actualRow2, actualColumn2 - 1))
							collision = true;
					}
				
					case 'r':{
						int actualColumn1 = blocks[1].getColumna();
						int actualRow1 = blocks[1].getFila();
						int actualColumn2 = blocks[3].getColumna();
						int actualRow2 = blocks[3].getFila();

						if(actualColumn2 < 9) {
							if(!Grilla.availableSpace(actualRow2, actualColumn2 + 1))
								collision = true;
						}
						else
							collision = true;
						
						if(!Grilla.availableSpace(actualRow1, actualColumn1 + 1))
							collision = true;
					}
				}
				
			case 90:
				switch(m){
					case 'd':{
						int actualColumn1 = blocks[1].getColumna();
						int actualRow1 = blocks[1].getFila();
						int actualColumn2 = blocks[3].getColumna();
						int actualRow2 = blocks[3].getFila();
					
						if(!Grilla.availableSpace(actualRow1 + 1, actualColumn1))
							collision = true;
						
						if(actualRow2 < 20) {
							if(!Grilla.availableSpace(actualRow2 + 1, actualColumn2))
								collision = true;
						}
						else
							collision = true;
					}
						
					case 'l':{
						int actualColumn1 = blocks[0].getColumna();
						int actualRow1 = blocks[0].getFila();
						int actualColumn2 = blocks[2].getColumna();
						int actualRow2 = blocks[2].getFila();
						int actualColumn3 = blocks[3].getColumna();
						int actualRow3 = blocks[3].getFila();
	
						if(!Grilla.availableSpace(actualRow1, actualColumn1 - 1))
							collision = true;
						
						if(actualColumn2 > 0) {
							if(!Grilla.availableSpace(actualRow2, actualColumn2 - 1))
								collision = true;
						}
						else
							collision = true;
						
						if(actualColumn3 > 0) {
							if(!Grilla.availableSpace(actualRow3, actualColumn3 - 1))
								collision = true;
						}
						else
							collision = true;	
					}
				
					case 'r':{
						int actualColumn1 = blocks[0].getColumna();
						int actualRow1 = blocks[0].getFila();
						int actualColumn2 = blocks[1].getColumna();
						int actualRow2 = blocks[1].getFila();
						int actualColumn3 = blocks[3].getColumna();
						int actualRow3 = blocks[3].getFila();
	
						if(actualColumn1 < 9) {
							if(!Grilla.availableSpace(actualRow1, actualColumn1 + 1))
								collision = true;
						}
						else
							collision = true;
						
						if(actualColumn2 < 9) {
							if(!Grilla.availableSpace(actualRow2, actualColumn2 + 1))
								collision = true;
						}
						else
							collision = true;
						
						if(!Grilla.availableSpace(actualRow3, actualColumn3 + 1))
							collision = true;
					}
				}
				
			case 180:
				switch(m){
					case 'd':{
						int actualColumn1 = blocks[3].getColumna();
						int actualRow1 = blocks[3].getFila();
						int actualColumn2 = blocks[1].getColumna();
						int actualRow2 = blocks[1].getFila();
						int actualColumn3 = blocks[0].getColumna();
						int actualRow3 = blocks[0].getFila();
					
						if(!Grilla.availableSpace(actualRow1 + 1, actualColumn1))
							collision = true;
						
						if(actualRow2 < 20) {
							if(!Grilla.availableSpace(actualRow2 + 1, actualColumn2))
								collision = true;
						}
						else
							collision = true;
						
						if(actualRow3 < 20) {
							if(!Grilla.availableSpace(actualRow3 + 1, actualColumn3))
								collision = true;
						}
						else
							collision = true;
					}
						
					case 'l':{
						int actualColumn1 = blocks[3].getColumna();
						int actualRow1 = blocks[3].getFila();
						int actualColumn2 = blocks[1].getColumna();
						int actualRow2 = blocks[1].getFila();
	
						if(actualColumn1 > 0) {
							if(!Grilla.availableSpace(actualRow1, actualColumn1 - 1))
								collision = true;
						}
						else
							collision = true;
						
						if(!Grilla.availableSpace(actualRow2, actualColumn2 - 1))
							collision = true;
					}
				
					case 'r':{
						int actualColumn1 = blocks[2].getColumna();
						int actualRow1 = blocks[2].getFila();
						int actualColumn2 = blocks[0].getColumna();
						int actualRow2 = blocks[0].getFila();
	
						if(actualColumn2 < 9) {
							if(!Grilla.availableSpace(actualRow2, actualColumn2 + 1))
								collision = true;
						}
						else
							collision = true;
						
						if(!Grilla.availableSpace(actualRow1, actualColumn1 + 1))
							collision = true;
					}
				}
				
			case 270:
				switch(m){
					case 'd':{
						int actualColumn1 = blocks[2].getColumna();
						int actualRow1 = blocks[2].getFila();
						int actualColumn2 = blocks[0].getColumna();
						int actualRow2 = blocks[0].getFila();
					
						if(!Grilla.availableSpace(actualRow1 + 1, actualColumn1))
							collision = true;
						
						if(actualRow2 < 20) {
							if(!Grilla.availableSpace(actualRow2 + 1, actualColumn2))
								collision = true;
						}
						else
							collision = true;
					}
						
					case 'l':{
						int actualColumn1 = blocks[3].getColumna();
						int actualRow1 = blocks[3].getFila();
						int actualColumn2 = blocks[1].getColumna();
						int actualRow2 = blocks[1].getFila();
						int actualColumn3 = blocks[0].getColumna();
						int actualRow3 = blocks[0].getFila();
	
						if(!Grilla.availableSpace(actualRow1, actualColumn1 - 1))
							collision = true;
						
						if(actualColumn2 > 0) {
							if(!Grilla.availableSpace(actualRow2, actualColumn2 - 1))
								collision = true;
						}
						else
							collision = true;
						
						if(actualColumn3 > 0) {
							if(!Grilla.availableSpace(actualRow3, actualColumn3 - 1))
								collision = true;
						}
						else
							collision = true;	
					}
				
					case 'r':{
						int actualColumn1 = blocks[3].getColumna();
						int actualRow1 = blocks[3].getFila();
						int actualColumn2 = blocks[2].getColumna();
						int actualRow2 = blocks[2].getFila();
						int actualColumn3 = blocks[0].getColumna();
						int actualRow3 = blocks[0].getFila();
	
						if(actualColumn1 < 9) {
							if(!Grilla.availableSpace(actualRow1, actualColumn1 + 1))
								collision = true;
						}
						else
							collision = true;
						
						if(actualColumn2 < 9) {
							if(!Grilla.availableSpace(actualRow2, actualColumn2 + 1))
								collision = true;
						}
						else
							collision = true;
						
						if(!Grilla.availableSpace(actualRow3, actualColumn3 + 1))
							collision = true;
					}
				}
		}
		
		return collision;
	}
	
	@Override
	protected void movement(char m){
		Bloque actualBlock;
		
		switch(m) {
			case 'd':{
				int actualRow;
				
				for (int i = 0; i < 4; i++) {
					actualBlock = blocks[i];
					actualRow = actualBlock.getFila();
					actualBlock.setFila(actualRow + 1);
				}
			}
		
			case 'l':{
				int actualColumn;
				
				for (int i = 0; i < 4; i++) {
					actualBlock = blocks[i];
					actualColumn = actualBlock.getColumna();
					actualBlock.setColumna(actualColumn - 1);
				}
			
			}
		
			case 'r':{
				int actualColumn;
				
				for (int i = 0; i < 4; i++) {
					actualBlock = blocks[i];
					actualColumn = actualBlock.getColumna();
					actualBlock.setColumna(actualColumn + 1);
				}
			}
		}
	}
	
	@Override
	protected boolean checkRotationCollision(char m) {
		boolean collision = false;
		
		switch(rotation) {
			case 0:{
				switch(m) {
					case 'l':{
						int row = blocks[3].getFila();
						int column = blocks[3].getColumna();
						
						if(row == 1) {
							if(!Grilla.availableSpace(row - 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row + 1, column - 1))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row - 2, column))
								collision = true;
							
							if(!Grilla.availableSpace(row - 1, column))
								collision = true;
						}
					}
				
					case 'r':{
						int row = blocks[0].getFila();
						int column = blocks[0].getColumna();
						
						if(row == 0) {
							if(!Grilla.availableSpace(row + 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row + 2, column))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row + 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row - 1, column + 1))
								collision = true;
						}
					}
				}
			}
			
			case 90:{
				switch(m) {
					case 'l':{
						int row = blocks[2].getFila();
						int column = blocks[2].getColumna();
						
						if(column == 0) {
							if(!Grilla.availableSpace(row - 1, column))
									collision = true;
							
							if(!Grilla.availableSpace(row, column + 2))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row - 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row - 1, column - 1))
								collision = true;
						}
					}
					
					case 'r':{
						int row = blocks[1].getFila();
						int column = blocks[1].getColumna();
						
						if(column == 9) {
							if(!Grilla.availableSpace(row - 1, column - 1))
								collision = true;
						
							if(!Grilla.availableSpace(row - 1, column - 2))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row - 1, column - 1))
								collision = true;
							
							if(!Grilla.availableSpace(row, column + 1))
								collision = true;
						}
					}
				}
			}
			
			case 180:{
				switch(m) {
					case 'l':{
						int row = blocks[0].getFila();
						int column = blocks[0].getColumna();
						
						if(row == 1) {
							if(!Grilla.availableSpace(row - 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row + 1, column - 1))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row - 2, column))
								collision = true;
							
							if(!Grilla.availableSpace(row - 1, column))
								collision = true;
						}
					}
					
					case 'r':{
						int row = blocks[3].getFila();
						int column = blocks[3].getColumna();
						
						if(row == 0) {
							if(!Grilla.availableSpace(row + 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row + 2, column))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row + 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row - 1, column + 1))
								collision = true;
						}
					}
				}
			}
			
			case 270:{
				switch(m) {
					case 'l':{
						int row = blocks[1].getFila();
						int column = blocks[1].getColumna();
						
						if(column == 0) {
							if(!Grilla.availableSpace(row - 1, column))
									collision = true;
							
							if(!Grilla.availableSpace(row, column + 2))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row - 1, column))
								collision = true;
							
							if(!Grilla.availableSpace(row - 1, column - 1))
								collision = true;
						}
					}
					
					case 'r':{
						int row = blocks[2].getFila();
						int column = blocks[2].getColumna();
						
						if(column == 9) {
							if(!Grilla.availableSpace(row - 1, column - 1))
								collision = true;
						
							if(!Grilla.availableSpace(row - 2, column - 2))
								collision = true;
						}
						else {
							if(!Grilla.availableSpace(row - 1, column - 1))
								collision = true;
							
							if(!Grilla.availableSpace(row, column + 1))
								collision = true;
						}
					}
				}
			}
		}
		
		return collision;
	}
	
	@Override
	protected void rotation(char m) {
		switch(rotation) {
			case 0: {
				switch(m) {
					case 'l': {
						int row = blocks[3].getFila();
						
						if(row == 1) {
							blocks[0].setFila(blocks[0].getFila() + 2);
							blocks[0].setColumna(blocks[0].getColumna() + 1);
							blocks[1].setFila(blocks[1].getFila() + 1);
							blocks[2].setColumna(blocks[2].getColumna() + 1);
							blocks[3].setFila(blocks[3].getFila() - 1);
						}
						else {
							blocks[0].setFila(blocks[0].getFila() + 1);
							blocks[0].setColumna(blocks[0].getColumna() + 1);
							blocks[2].setFila(blocks[2].getFila() - 1);
							blocks[2].setColumna(blocks[2].getColumna() + 1);
							blocks[3].setFila(blocks[3].getFila() - 2);
						}
						
						rotation = 270;
					}
					
					case 'r': {
						int row = blocks[0].getFila();
						
						if(row == 0) {
							blocks[0].setColumna(blocks[0].getColumna() + 1);
							blocks[1].setFila(blocks[1].getFila() + 1);
							blocks[2].setColumna(blocks[2].getColumna() - 1);
							blocks[3].setFila(blocks[3].getFila() + 1);
							blocks[3].setColumna(blocks[3].getColumna() - 2);
						}
						else {
							blocks[0].setFila(blocks[0].getFila() - 1);
							blocks[0].setColumna(blocks[0].getColumna() + 1);
							blocks[2].setFila(blocks[2].getFila() - 1);
							blocks[2].setColumna(blocks[2].getColumna() - 1);
							blocks[3].setColumna(blocks[3].getColumna() - 2);
						}
						
						rotation = 90;
					}
				}
			}
			
			case 90: {
				switch(m) {
					case 'l': {
						int column = blocks[2].getColumna();
						
						if(column == 0) {
							blocks[0].setColumna(blocks[0].getColumna() - 1);
							blocks[1].setFila(blocks[1].getFila() - 1);
							blocks[2].setColumna(blocks[2].getColumna() + 1);
							blocks[3].setFila(blocks[3].getFila() - 1);
							blocks[3].setColumna(blocks[3].getColumna() + 2);
						}
						else {
							blocks[0].setColumna(blocks[0].getColumna() - 2);
							blocks[1].setFila(blocks[1].getFila() - 1);
							blocks[1].setColumna(blocks[1].getColumna() - 1);
							blocks[3].setFila(blocks[3].getFila() - 1);
							blocks[3].setColumna(blocks[3].getColumna() + 1);
						}
						
						rotation = 0;
					}
					
					case 'r': {
						int column = blocks[1].getColumna();
						
						if(column == 9) {
							blocks[0].setFila(blocks[0].getFila() + 1);
							blocks[1].setColumna(blocks[1].getColumna() - 1);
							blocks[2].setFila(blocks[2].getFila() - 1);
							blocks[3].setFila(blocks[3].getFila() - 1);
							blocks[3].setColumna(blocks[3].getColumna() - 2);
						}
						else {
							blocks[0].setFila(blocks[0].getFila() + 1);
							blocks[0].setColumna(blocks[0].getColumna() + 1);
							blocks[2].setFila(blocks[2].getFila() - 1);
							blocks[2].setColumna(blocks[2].getColumna() + 1);
							blocks[3].setColumna(blocks[3].getColumna() - 2);
						}
						
						rotation = 180;
					}
				}
			}
			
			case 180: {
				switch(m) {
					case 'l': {
						int row = blocks[0].getFila();
						
						if(row == 1) {
							blocks[3].setFila(blocks[3].getFila() + 2);
							blocks[3].setColumna(blocks[3].getColumna() + 1);
							blocks[2].setFila(blocks[2].getFila() + 1);
							blocks[1].setColumna(blocks[1].getColumna() + 1);
							blocks[0].setFila(blocks[0].getFila() - 1);
						}
						else {
							blocks[3].setFila(blocks[3].getFila() + 1);
							blocks[3].setColumna(blocks[3].getColumna() + 1);
							blocks[1].setFila(blocks[1].getFila() - 1);
							blocks[1].setColumna(blocks[1].getColumna() + 1);
							blocks[0].setFila(blocks[0].getFila() - 2);
						}
						
						rotation = 90;
					}
					
					case 'r': {
						int row = blocks[3].getFila();
						
						if(row == 0) {
							blocks[3].setColumna(blocks[3].getColumna() + 1);
							blocks[2].setFila(blocks[2].getFila() + 1);
							blocks[1].setColumna(blocks[1].getColumna() - 1);
							blocks[0].setFila(blocks[0].getFila() + 1);
							blocks[0].setColumna(blocks[0].getColumna() - 2);
						}
						else {
							blocks[3].setFila(blocks[3].getFila() - 1);
							blocks[3].setColumna(blocks[3].getColumna() + 1);
							blocks[1].setFila(blocks[1].getFila() - 1);
							blocks[1].setColumna(blocks[1].getColumna() - 1);
							blocks[0].setColumna(blocks[0].getColumna() - 2);
						}
						
						rotation = 270;
					}
				}
			}
			
			case 270: {
				switch(m) {
					case 'l': {
						int column = blocks[1].getColumna();
						
						if(column == 0) {
							blocks[3].setColumna(blocks[3].getColumna() - 1);
							blocks[2].setFila(blocks[2].getFila() - 1);
							blocks[1].setColumna(blocks[1].getColumna() + 1);
							blocks[0].setFila(blocks[0].getFila() - 1);
							blocks[0].setColumna(blocks[0].getColumna() + 2);
						}
						else {
							blocks[3].setColumna(blocks[3].getColumna() - 2);
							blocks[2].setFila(blocks[2].getFila() - 1);
							blocks[2].setColumna(blocks[2].getColumna() - 1);
							blocks[0].setFila(blocks[0].getFila() - 1);
							blocks[0].setColumna(blocks[0].getColumna() + 1);
						}
						
						rotation = 180;
					}
					
					case 'r': {
						int column = blocks[2].getColumna();
						
						if(column == 9) {
							blocks[3].setFila(blocks[3].getFila() + 1);
							blocks[2].setColumna(blocks[2].getColumna() - 1);
							blocks[1].setFila(blocks[1].getFila() - 1);
							blocks[0].setFila(blocks[0].getFila() - 1);
							blocks[0].setColumna(blocks[0].getColumna() - 2);
						}
						else {
							blocks[3].setFila(blocks[3].getFila() + 1);
							blocks[3].setColumna(blocks[3].getColumna() + 1);
							blocks[1].setFila(blocks[1].getFila() - 1);
							blocks[1].setColumna(blocks[1].getColumna() + 1);
							blocks[0].setColumna(blocks[0].getColumna() - 2);
						}
						
						rotation = 0;
					}
				}
			}
		}
	}
}
