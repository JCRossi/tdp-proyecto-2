package entidades;

import entidades.Bloque;

public abstract class Tetrimino {
	
	protected int rotation;
	protected Bloque[] blocks;

	
	public abstract void moverDerecha();
	
	public abstract void moverIzquierda();
	
	public abstract boolean moverAbajo();
	
	public abstract void rotarDerecha();
	
	public abstract void rotarIzquierda();
		
	}
