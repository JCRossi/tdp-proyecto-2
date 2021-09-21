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
	protected boolean checkMovementCollision(char m) {
		boolean collision=false;
		switch(m) {
		
		case 'd':{
			int actualRow = blocks[1].getFila();
			if (actualRow<20) {
				int actualColumn = blocks[1].getColumna();
				if(!Grilla.availableSpace(actualRow+1, actualColumn))
					collision=true;
				else {
					actualColumn = blocks[3].getColumna();
					actualRow = blocks[3].getFila();
					if(!Grilla.availableSpace(actualRow+1, actualColumn))
						collision=true;
				}
				
			} else
				collision=true;
		}
		
		case 'r':{
			int actualColumn = blocks[2].getColumna();
			if (actualColumn<9) {
				int actualRow = blocks[2].getFila();
				if(!Grilla.availableSpace(actualRow, actualColumn+1))
					collision=true;
				else {
					actualColumn = blocks[3].getColumna();
					actualRow = blocks[3].getFila();
					if(!Grilla.availableSpace(actualRow, actualColumn+1))
						collision=true;
				}
				
			} else
				collision=true;
		}
		
		case 'l':{
			int actualColumn = blocks[0].getColumna();
			if (actualColumn>0) {
				int actualRow = blocks[0].getFila();
				if(!Grilla.availableSpace(actualRow, actualColumn-1))
					collision=true;
				else {
					actualColumn = blocks[1].getColumna();
					actualRow = blocks[1].getFila();
					if(!Grilla.availableSpace(actualRow, actualColumn-1))
						collision=true;
				}
				
			} else
				collision=true;
		}
		
		}
		return collision;
	}

	@Override
	protected void movement(char m) {
		switch(m) {
		
		case 'd':{
			for(int i=0; i<4; i++) {
				blocks[i].setFila(blocks[i].getFila()+1);
			}
		}
		
		case 'r':{
			for(int i=0; i<4; i++) {
				blocks[i].setColumna(blocks[i].getColumna()+1);
			}
			
		}
		
		case 'l':{
			for(int i=0; i<4; i++) {
				blocks[i].setColumna(blocks[i].getColumna()-1);
			}
		}
		
		}
		
	}

	@Override
	protected boolean checkRotationCollision(char m) {
		return false;
	}

	@Override
	protected void rotation(char m) {}

}
