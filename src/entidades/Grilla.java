package entidades;

public class Grilla {
	
	private int filas;
	private int columnas;
	private Bloque[][] matriz;
	
	public Grilla() {
		filas = 21;
		columnas = 10;
		matriz = new Bloque[21][10];
		
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				matriz[i][j] = null;
	}
	
	public boolean chequearColision(int[][] posiciones) {
		boolean colisiona = false;
		int i = 0;
		while(!colisiona && i<posiciones.length) {
			
			colisiona = matriz[posiciones[i][0]][posiciones[i][1]]!=null;
			i++;
		}
		return colisiona;	
	}
	
	public void actualizarGrilla(Tetrimino actual) {
		Bloque[] bloques = actual.getBloques();
		
		for(int i = 0; i < 4; i++) {
			Bloque bloque = bloques[i];
			matriz[bloque.getFila()][bloque.getColumna()] = bloque; 
		}
	}
	
	public Bloque[][] getMatriz(){
		return matriz;
	}

	//Falta que actualice grilla
	public int despejar(int[] filasAChequear) {
		int filasDespejadas = 0;
		boolean filaCompletada = true;
		
		for(int i = 0; i < filasAChequear.length; i++) {
			for(int j = 0; j < columnas && filaCompletada; j++) {
				if(matriz[filasAChequear[i]][j] == null)
					filaCompletada = false;
			}
			
			if(filaCompletada) {
				actualizarFilas(filasAChequear[i]);
				filasDespejadas++;
			}
				
			filaCompletada=true;		
		}
		
		return filasDespejadas;
	}

	private void actualizarFilas(int fila) {
		for(int i=0; i<10; i++) {
			matriz[fila][i]=null;
		}
		Bloque bloqueActual;
		boolean filaVacia=false;
		fila--;
		while(!filaVacia && fila>=0) {
			filaVacia=true;
			for(int i=0; i<10; i++) {
				bloqueActual=matriz[fila][i];
				if (bloqueActual!=null) {
					matriz[fila+1][i]=bloqueActual;
					matriz[fila][i]=null;
					filaVacia=false;
				}
			}
			fila--;
		}
		
	}
}
