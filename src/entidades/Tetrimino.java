package entidades;

import entidades.Bloque;

public abstract class Tetrimino {
	
	int rotation;
	Bloque[] blocks;
	
	protected abstract boolean checkMovementCollision(char m);
	
	protected abstract void movement(char m);
	
	protected abstract boolean checkRotationCollision(char m);
	
	protected abstract void rotation(char m);
		
	}
