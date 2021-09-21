package entidades;

public class TetriminoI extends Tetrimino{

	public TetriminoI() {
		blocks = new Bloque[4];
		for (int i=0; i>4; i++) 
			blocks[i]= new Bloque(i,4,"celeste");
		rotation = 0;		
	}
	
	@Override
	boolean checkmovement(char m) {
		boolean collision = false;
		
		// checkeo la rotacion actual de la ficha
		switch(rotation) {
		case 0:{
			
			//checkeo el movimiento que debe realizar la ficha (d ='down' , l = 'left' , r = 'right')
			switch(m) {
			
			// checkeo que todos los bloques del tetrimino puedan moverse hacia abajo
			case 'd':{
				int actualColumn = blocks[3].getColumna();
				int actualRow = blocks[3].getFila();
				
				// checkeo que el bloque mas abajo no este en la ultima fila posible
				// checkeo que el espacio abajo de dicho bloque este disponible
				if(!(actualRow<20 && Grilla.availableSpace(actualRow+1, actualColumn)))
					collision=true;
					
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la izquierda
			case 'l':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				// checkeo que el primer bloque del arreglo no este en la ultima columna a la izquierda
				if (actualColumn>0) {
					for (int i=0; i<4; i++) {
						// checkeo que el espacio a la izquierda del bloque este disponible
						if(!Grilla.availableSpace(actualRow, actualColumn-1))
							collision=true;
						i++;
						if(i<4) {
							actualRow = blocks[i].getFila();
						}	
					}
				} else
					collision=true;
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la derecha
			case 'r':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				// checkeo que el primer bloque del arreglo no este en la ultima columna a la derecha
				if (actualColumn<9) {
					for (int i=0; i<4; i++) {
						// checkeo que el espacio a la derecha del bloque este disponible
						if(!Grilla.availableSpace(actualRow, actualColumn+1))
							collision=true;
						i++;
						if(i<4) {
							actualRow = blocks[i].getFila();
						}	
					}
				} else
					collision=true;
			}
			
			}
			
		}
		
		case 90:{
			
			//checkeo el movimiento que debe realizar la ficha (d ='down' , l = 'left' , r = 'right')
			switch(m) {
			
			// checkeo que todos los bloques del tetrimino puedan moverse hacia abajo
			case 'd':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				// checkeo que el primer bloque del arreglo no este en la ultima fila posible
				if (actualRow<20) {
					for (int i=0; i<4; i++) {
						// checkeo que el espacio a la izquierda del bloque este disponible
						if(!Grilla.availableSpace(actualRow+1, actualColumn))
							collision=true;
						i++;
						if(i<4) {
							actualRow = blocks[i].getFila();
						}	
					}
				} else
					collision=true;	
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la izquierda
			case 'l':{
				int actualColumn = blocks[3].getColumna();
				int actualRow = blocks[3].getFila();
				
				// checkeo que el bloque mas a la izquierda no este en la primera columna posible
				// checkeo que el espacio izquierdo de dicho bloque este disponible
				if(!(actualColumn>0 && Grilla.availableSpace(actualRow, actualColumn-1)))
					collision=true;
					
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la derecha
			case 'r':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				
				// checkeo que el bloque mas a la derecha no este en la ultima columna posible
				// checkeo que el espacio  a la derecha de dicho bloque este disponible
				if(!(actualColumn<9 && Grilla.availableSpace(actualRow, actualColumn+1)))
					collision=true;
					
			}
			
			}
			
		}
		
		case 180:{
			
			//checkeo el movimiento que debe realizar la ficha (d ='down' , l = 'left' , r = 'right')
			switch(m) {
			
			// checkeo que todos los bloques del tetrimino puedan moverse hacia abajo
			case 'd':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				
				// checkeo que el bloque mas abajo no este en la ultima fila posible
				// checkeo que el espacio abajo de dicho bloque este disponible
				if(!(actualRow<20 && Grilla.availableSpace(actualRow+1, actualColumn)))
					collision=true;
					
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la izquierda
			case 'l':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				// checkeo que el primer bloque del arreglo no este en la ultima columna a la izquierda
				if (actualColumn>0) {
					for (int i=0; i<4; i++) {
						// checkeo que el espacio a la izquierda del bloque este disponible
						if(!Grilla.availableSpace(actualRow, actualColumn-1))
							collision=true;
						i++;
						if(i<4) {
							actualRow = blocks[i].getFila();
						}	
					}
				} else
					collision=true;
			}
						
			// checkeo que todos los bloques del tetrimino puedan moverse a la derecha
			case 'r':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				// checkeo que el primer bloque del arreglo no este en la ultima columna a la derecha
				if (actualColumn<9) {
					for (int i=0; i<4; i++) {
						// checkeo que el espacio a la derecha del bloque este disponible
						if(!Grilla.availableSpace(actualRow, actualColumn+1))
							collision=true;
						i++;
						if(i<4) {
							actualRow = blocks[i].getFila();
						}	
					}
				} else
					collision=true;
			}
			
			}
			
		}
		
		case 270:{
			
			//checkeo el movimiento que debe realizar la ficha (d ='down' , l = 'left' , r = 'right')
			switch(m) {
			
			// checkeo que todos los bloques del tetrimino puedan moverse hacia abajo
			case 'd':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				// checkeo que el primer bloque del arreglo no este en la ultima fila posible
				if (actualRow<20) {
					for (int i=0; i<4; i++) {
						// checkeo que el espacio debajo del bloque este disponible
						if(!Grilla.availableSpace(actualRow+1, actualColumn))
							collision=true;
						i++;
						if(i<4) {
							actualRow = blocks[i].getFila();
						}	
					}
				} else
					collision=true;	
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la izquierda
			case 'l':{
				int actualColumn = blocks[0].getColumna();
				int actualRow = blocks[0].getFila();
				
				// checkeo que el bloque mas a la izquierda no este en la primera columna posible
				// checkeo que el espacio izquierdo de dicho bloque este disponible
				if(!(actualColumn>0 && Grilla.availableSpace(actualRow, actualColumn-1)))
					collision=true;
					
			}
			
			// checkeo que todos los bloques del tetrimino puedan moverse a la derecha
			case 'r':{
				int actualColumn = blocks[3].getColumna();
				int actualRow = blocks[3].getFila();
				
				// checkeo que el bloque mas abajo no este en la ultima fila posible
				// checkeo que el espacio abajo de dicho bloque este disponible
				if(!(actualColumn<9 && Grilla.availableSpace(actualRow, actualColumn+1)))
					collision=true;
					
			}
			
			}
			
		}
		
		}
		return collision;
	}

	@Override
	void movement(char m) {
		switch(m) {
		
		case 'd':{
			Bloque actualBlock;
			int actualRow;
			for (int i=0; i<4; i++) {
				actualBlock = blocks[i];
				actualRow = actualBlock.getFila();
				actualBlock.setFila(actualRow+1);
			}
		}
		
		case 'l':{
			Bloque actualBlock;
			int actualColumn;
			for (int i=0; i<4; i++) {
				actualBlock = blocks[i];
				actualColumn = actualBlock.getColumna();
				actualBlock.setColumna(actualColumn-1);
			}
			
		}
		
		case 'r':{
			Bloque actualBlock;
			int actualColumn;
			for (int i=0; i<4; i++) {
				actualBlock = blocks[i];
				actualColumn = actualBlock.getColumna();
				actualBlock.setColumna(actualColumn+1);
			}
		}
		
		}
		
	}

	@Override
	boolean checkrotation(char m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean rotation(char m) {
		// TODO Auto-generated method stub
		return false;
	}

}
