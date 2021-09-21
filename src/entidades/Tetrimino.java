package entidades;

import entidades.Bloque;

public abstract class Tetrimino {
	
	int rotation;
	Bloque[] blocks;
	
	abstract boolean checkmovement(char m);
	
	abstract void movement(char m);
	
	abstract boolean checkrotation(char m);
	
	abstract boolean rotation(char m);
		
	}
