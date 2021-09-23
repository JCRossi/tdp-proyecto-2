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
	public void moverDerecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverIzquierda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean moverAbajo() {
		// TODO Auto-generated method stub
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
