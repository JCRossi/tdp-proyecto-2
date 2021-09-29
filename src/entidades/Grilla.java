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
	
	public void actualizarPosicionBloques(Bloque[] bloques) {
		
		for(int i = 0; i < 4; i++) {
			Bloque bloque = bloques[i];
			matriz[bloque.getFila()][bloque.getColumna()] = bloque; 
		}
	}
	
	public Bloque[][] getMatriz(){
		return matriz;
	}

	public int[] checkearFilasCompletadas(int[] filasAChequear) {
		int cantLineas = filasAChequear.length;
		int filasDespejadas[] = new int[cantLineas+1];
		filasDespejadas[0]=0;
		boolean filaCompletada = true;
		
		for(int i = 0; i < cantLineas; i++) {
			for(int j = 0; j < columnas && filaCompletada; j++) {
				if(matriz[filasAChequear[i]][j] == null)
					filaCompletada = false;
			}
			
			if(filaCompletada) {
				actualizarFilas(filasAChequear[i]);
				filasDespejadas[0]++;
				filasDespejadas[i+1]=filasAChequear[i];
			} else
				filasDespejadas[i+1]=-1;
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
