package entidades;

public class Grilla {
	
	private int filas;
	private int columnas;
	private static Bloque[][] matriz;
	
	public Grilla() {
		filas = 21;
		columnas = 10;
		matriz = new Bloque[21][10];
		
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				matriz[i][j] = null;
	}
	
	public static boolean chequearColision(int[][] posiciones) {
		boolean colisiona = false;
		int i = 0;
		while(!colisiona && i<posiciones.length) {
			
			colisiona = matriz[posiciones[i][0]][posiciones[i][1]]!=null;
			i++;
		}
		return colisiona;	
	}
	

	public int despejar(int[] filasAChequear) {
		int filasDespejadas = 0;
		boolean filaCompletada = true;
		
		for(int i = 0; i < filasAChequear.length; i++) {
			for(int j = 0; j < columnas && filaCompletada; j++) {
				if(matriz[filasAChequear[i]][j] == null)
					filaCompletada = false;
			}
			
			if(filaCompletada)
				filasDespejadas++;
		}
		
		return filasDespejadas;
	}
}
