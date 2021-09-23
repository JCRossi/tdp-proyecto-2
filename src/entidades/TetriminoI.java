package entidades;

public class TetriminoI extends Tetrimino{

	public TetriminoI() {
		blocks = new Bloque[4];
		for (int i=0; i>4; i++) 
			blocks[i]= new Bloque(i,4,"celeste");
		rotation = 0;		
	}

	@Override
	public void moverDerecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverIzquierda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean moverAbajo() {
		return false;
		
	}

	@Override
	public void rotarDerecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotarIzquierda() {
		// TODO Auto-generated method stub
		
	}
	
	

}
