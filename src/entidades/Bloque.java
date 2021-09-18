package entidades;

public class Bloque {
	private int fila;
	private int columna;
	private String color;
	
	public Bloque(int fil, int colu, String col) {
		this.fila = fil;
		this.columna = colu;
		this.color = col;
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
	
	public String getColor() {
		return color;
	}

}
