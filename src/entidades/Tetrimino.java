package entidades;

public abstract class Tetrimino {
	
	protected int rotation;
	protected Bloque[] blocks;

	public abstract void moverDerecha();
	
	public abstract void moverIzquierda();
	
	public abstract boolean moverAbajo();
	
	public abstract void rotarDerecha();
	
	public abstract void rotarIzquierda();
	
	public abstract int[] filasOcupadas();
	
	public Bloque[] getBloques() {
		return blocks;
	}
}
