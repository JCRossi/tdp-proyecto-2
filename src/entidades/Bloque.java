package entidades;

public class Bloque {
	private int fila;
	private int columna;
	private BloqueGrafico imagenBloque;
	
	public Bloque(int fil, int colu, int index) {
		this.fila = fil;
		this.columna = colu;
		imagenBloque = new BloqueGrafico();
		imagenBloque.actualizar(index);
	}
	
	public void setFila(int f) {
		fila = f;
	}
	
	public void setColumna(int c) {
		columna = c;
	}
	
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}

}
