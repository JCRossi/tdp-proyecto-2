package entidades;

public class TetriminoJ extends Tetrimino{
	
	public TetriminoJ(Grilla g) {
		blocks = new Bloque[4];
		blocks[0]= new Bloque(0,4,1);
		blocks[1]= new Bloque(1,4,1);
		blocks[2]= new Bloque(1,5,1);
		blocks[3]= new Bloque(1,6,1);
		grilla = g;
		rotation=0;
	}

	@Override
	public void moverDerecha() {
		
		switch(rotation) {
		case 0:{
			if(blocks[3].getColumna() != 9) {
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna()+1;
				bloquesConflictivos[1][0] = blocks[3].getFila();
				bloquesConflictivos[1][1] = blocks[3].getColumna()+1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()+1 );
					
				}
			
			}
			break;
		}
		case 90:{
			if(blocks[0].getColumna() != 9) {
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna()+1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna()+1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna()+1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()+1 );
					
				}
			}
			break;
		}
		case 180:{
			if(blocks[0].getColumna() != 9) {
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = blocks[1].getFila();
				bloquesConflictivos[0][1] = blocks[1].getColumna()+1;
				bloquesConflictivos[1][0] = blocks[0].getFila();
				bloquesConflictivos[1][1] = blocks[0].getColumna()+1;


				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()+1 );
					
				}
			}
			break;
		}
		case 270:{
			if(blocks[3].getColumna() != 9) {
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = blocks[1].getFila();
				bloquesConflictivos[0][1] = blocks[1].getColumna()+1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna()+1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna()+1;


				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()+1 );
					
				}
				
			}
			break;
		}
		}
		
		
	}

	@Override
	public void moverIzquierda() {
		switch(rotation) {
		case 0:{
			if(blocks[0].getColumna() != 0) {
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna()-1;
				bloquesConflictivos[1][0] = blocks[1].getFila();
				bloquesConflictivos[1][1] = blocks[1].getColumna()-1;
				
				
					
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()-1 );
					
				}
			}
			break;
		} 
		case 90:{
			if(blocks[1].getColumna() != 0) {
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = blocks[1].getFila();
				bloquesConflictivos[0][1] = blocks[1].getColumna()-1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna()-1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna()-1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()-1 );
					
				}
			}
			break;
		}
		case 180:{
			if(blocks[3].getColumna() != 0) {
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = blocks[3].getFila();
				bloquesConflictivos[0][1] = blocks[3].getColumna()-1;
				bloquesConflictivos[1][0] = blocks[0].getFila();
				bloquesConflictivos[1][1] = blocks[0].getColumna()-1;
	
	
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()-1 );
					
				}
			}
			break;
		}
		case 270:{
			if(blocks[0].getColumna() != 0) {
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = blocks[0].getFila();
				bloquesConflictivos[0][1] = blocks[0].getColumna()-1;
				bloquesConflictivos[1][0] = blocks[2].getFila();
				bloquesConflictivos[1][1] = blocks[2].getColumna()-1;
				bloquesConflictivos[2][0] = blocks[3].getFila();
				bloquesConflictivos[2][1] = blocks[3].getColumna()-1;
	
	
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setColumna( blocks[i].getColumna()-1 );
					
				}
			}
			break;
			
		}
	}
	
		
	}

	@Override
	public boolean moverAbajo() {
		boolean puedeBajar = true;
		switch(rotation) {
		case 0:{
			if(blocks[1].getFila() == 20) 
				puedeBajar = false;
			else {
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = blocks[1].getFila()+1;
				bloquesConflictivos[0][1] = blocks[1].getColumna();
				bloquesConflictivos[1][0] = blocks[2].getFila()+1;
				bloquesConflictivos[1][1] = blocks[2].getColumna();
				bloquesConflictivos[2][0] = blocks[3].getFila()+1;
				bloquesConflictivos[2][1] = blocks[3].getColumna();
	

				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setFila( blocks[i].getFila()+1 );
					
				}else
					puedeBajar = false;
				
			}
			
			break;
		}
		case 90:{
			if(blocks[3].getFila() == 20)
				puedeBajar = false;
			else{ 

				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = blocks[0].getFila()+1;
				bloquesConflictivos[0][1] = blocks[0].getColumna();
				bloquesConflictivos[1][0] = blocks[3].getFila()+1;
				bloquesConflictivos[1][1] = blocks[3].getColumna();
			
	

				if( !grilla.chequearColision(bloquesConflictivos) ) {
					for(int i = 0; i<4;i++) 
						blocks[i].setFila( blocks[i].getFila()+1 );
					
				}else
					puedeBajar = false;
				
				
			}
			
			
			break;
		}
		case 180:{
			if(blocks[0].getFila() == 20)
				puedeBajar = false;
			else{ 
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = blocks[0].getFila()+1;
				bloquesConflictivos[0][1] = blocks[0].getColumna();
				bloquesConflictivos[1][0] = blocks[2].getFila()+1;
				bloquesConflictivos[1][1] = blocks[2].getColumna();
				bloquesConflictivos[2][0] = blocks[3].getFila()+1;
				bloquesConflictivos[2][1] = blocks[3].getColumna();
	

				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setFila( blocks[i].getFila()+1 );
					
				}else {
					puedeBajar = false;
				}
				
			}
			
			break;
		}
		case 270:{
			if(blocks[0].getFila() == 20)
				puedeBajar = false;
			else{ 
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = blocks[0].getFila()+1;
				bloquesConflictivos[0][1] = blocks[0].getColumna();
				bloquesConflictivos[1][0] = blocks[1].getFila()+1;
				bloquesConflictivos[1][1] = blocks[1].getColumna();
				
	

				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					for(int i = 0; i<4;i++) 
						blocks[i].setFila( blocks[i].getFila()+1 );
					
				}else
					puedeBajar = false;
				
			}
			break;
		}
		}
		return puedeBajar;
	}

	@Override
	public void rotarDerecha() {
		switch(rotation) {
		case 0:{
			if(blocks[0].getFila()==0) { //CASO ESPECIAL: Rotar cuando spawneas
				int [][] bloquesConflictivos = new int[3][2];
				int columnaReferencia = blocks[0].getColumna();
				int filaReferencia= blocks[0].getFila();
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia +2;
				bloquesConflictivos[2][0] = filaReferencia+2;
				bloquesConflictivos[2][1] = columnaReferencia+1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setColumna(columnaReferencia+2);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia+2);
					blocks[3].setColumna(columnaReferencia+1);
					rotation = 90;
				}
			}else {    //Me parece positivo NO usar wallkick en este caso
				int [][] bloquesConflictivos = new int[2][2];
				int columnaReferencia = blocks[0].getColumna();
				int filaReferencia= blocks[0].getFila();
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia;
				bloquesConflictivos[1][0] = filaReferencia-1;
				bloquesConflictivos[1][1] = columnaReferencia +1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					blocks[0].setFila(filaReferencia-1);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia-1);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia);
					
					blocks[3].setFila(filaReferencia-1);
					blocks[3].setColumna(columnaReferencia);
					
					rotation = 90;
				}
			
				
			}
				
			break;
		}
		case 90:{
			if(blocks[2].getColumna()==0) {//CASO ESPECIAL: wallkick limite izquierdo
				
				int [][] bloquesConflictivos = new int[3][2];
				int columnaReferencia = blocks[2].getColumna();
				int filaReferencia= blocks[2].getFila();
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia +2;
				bloquesConflictivos[2][0] = filaReferencia+1;
				bloquesConflictivos[2][1] = columnaReferencia +2;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia+2);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia+2);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia);
					rotation = 180;
				}
				
				
			}else {
				int [][] bloquesConflictivos = new int[3][2];
				int columnaReferencia = blocks[2].getColumna();
				int filaReferencia= blocks[2].getFila();
				
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia +1;
				bloquesConflictivos[2][0] = filaReferencia;
				bloquesConflictivos[2][1] = columnaReferencia -1;
				
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia-1);
					
					rotation = 180;
				}
				
				
			}
			
			break;
		}
		case 180:{
			
			int [][] bloquesConflictivos = new int[3][2];
			int columnaReferencia = blocks[2].getColumna();
			int filaReferencia= blocks[2].getFila();
			
			bloquesConflictivos[0][0] = filaReferencia+1;
			bloquesConflictivos[0][1] = columnaReferencia-1;
			bloquesConflictivos[1][0] = filaReferencia+1;
			bloquesConflictivos[1][1] = columnaReferencia ;
			bloquesConflictivos[2][0] = filaReferencia-1;
			bloquesConflictivos[2][1] = columnaReferencia;
			
			if( !grilla.chequearColision(bloquesConflictivos) ) {//Caso default
				
				blocks[0].setFila(filaReferencia+1);
				blocks[0].setColumna(columnaReferencia-1);
				
				blocks[1].setFila(filaReferencia+1);
				blocks[1].setColumna(columnaReferencia);
				
				blocks[3].setFila(filaReferencia-1);
				blocks[3].setColumna(columnaReferencia);
				
				rotation = 270;
				
			}else {//Caso wallkick
				int [][] bloquesConflictivos2 = new int[2][2];
				bloquesConflictivos2[0][0] = filaReferencia+1;
				bloquesConflictivos2[0][1] = columnaReferencia;
				bloquesConflictivos2[1][0] = filaReferencia-1;
				bloquesConflictivos2[1][1] = columnaReferencia+1;

				if( !grilla.chequearColision(bloquesConflictivos2) ) {
					

					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia-1);
					blocks[3].setColumna(columnaReferencia+1);
					rotation = 270;
				}
				
			}
			
			break;
		}
		case 270:{
			int [][] bloquesConflictivos = new int[2][2];
			int columnaReferencia = blocks[2].getColumna();
			int filaReferencia= blocks[2].getFila();
			
			if(columnaReferencia !=9) {	//Caso default
				
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia+1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia-1);
					
					blocks[2].setFila(filaReferencia+1);
					blocks[2].setColumna(columnaReferencia);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia+1);
					
					rotation = 0;
					
				}
			}
				if(columnaReferencia !=1 && rotation!=0) {  //Caso especial || wallkick
					bloquesConflictivos[0][0] = filaReferencia;
					bloquesConflictivos[0][1] = columnaReferencia-2;
					bloquesConflictivos[1][0] = filaReferencia+1;
					bloquesConflictivos[1][1] = columnaReferencia-2;
				
					if( !grilla.chequearColision(bloquesConflictivos) ) {
						
						blocks[0].setFila(filaReferencia);
						blocks[0].setColumna(columnaReferencia-2);
						
						blocks[1].setFila(filaReferencia+1);
						blocks[1].setColumna(columnaReferencia-2);
						
						blocks[2].setFila(filaReferencia+1);
						blocks[2].setColumna(columnaReferencia-1);
						
						blocks[3].setFila(filaReferencia+1);
						blocks[3].setColumna(columnaReferencia);
						
						rotation = 0;
						
					}
					
					
					
				}
					
					
					
		}
				
		}
			
			
			
		
	}

	@Override
	public void rotarIzquierda() {
		switch(rotation) {
		case 0:{

			
			int columnaReferencia = blocks[2].getColumna();
			int filaReferencia= blocks[2].getFila();
			
			if(filaReferencia == 1) {   //CASO ESPECIAL: Rotaci�n en spawn
				int [][] bloquesConflictivos = new int[3][2];
				
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia ;
				bloquesConflictivos[2][0] = filaReferencia-1;
				bloquesConflictivos[2][1] = columnaReferencia;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia);
				
					blocks[3].setFila(filaReferencia-1);
					blocks[3].setColumna(columnaReferencia);
					rotation = 270;
				}
	
			}else {	 //Rotaci�n default
				
				int [][] bloquesConflictivos = new int[2][2];
				
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia;
				bloquesConflictivos[1][0] = filaReferencia-2;
				bloquesConflictivos[1][1] = columnaReferencia ;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia-1);
					blocks[2].setColumna(columnaReferencia);
				
					blocks[3].setFila(filaReferencia-2);
					blocks[3].setColumna(columnaReferencia);
					rotation = 270;
					
					
				}else { //Rotaci�n 2 || wallkick
					
					bloquesConflictivos[0][0] = filaReferencia-1;
					bloquesConflictivos[0][1] = columnaReferencia+1;
					bloquesConflictivos[1][0] = filaReferencia-2;
					bloquesConflictivos[1][1] = columnaReferencia+1;
					
					if( !grilla.chequearColision(bloquesConflictivos) ) {
						blocks[0].setFila(filaReferencia);
						blocks[0].setColumna(columnaReferencia);
						
						blocks[1].setFila(filaReferencia);
						blocks[1].setColumna(columnaReferencia+1);
						
						blocks[2].setFila(filaReferencia-1);
						blocks[2].setColumna(columnaReferencia+1);
					
						blocks[3].setFila(filaReferencia-2);
						blocks[3].setColumna(columnaReferencia+1);
						rotation = 270;
						
					}
					
				}
				
			}
			break;
		}
		case 90:{
			
			
			int columnaReferencia = blocks[2].getColumna();
			int filaReferencia= blocks[2].getFila();
			
			if(columnaReferencia !=0) {	//Caso default
				
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia-1;
				bloquesConflictivos[2][0] = filaReferencia+1;
				bloquesConflictivos[2][1] = columnaReferencia+1;
				
				
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia-1);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia-1);
					
					blocks[2].setFila(filaReferencia+1);
					blocks[2].setColumna(columnaReferencia);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia+1);
					
					rotation = 0;
					
				}
			}
			if(columnaReferencia !=8 && rotation!=0) {  //Caso especial || wallkick
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia+1;
				bloquesConflictivos[1][1] = columnaReferencia+2;
			
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia+1);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia+1);
					blocks[2].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia+3);
					
					rotation = 0;
					
				}
				
		
					
			}
			break;
		}
		case 180:{
			int [][] bloquesConflictivos = new int[3][2];
			int columnaReferencia = blocks[2].getColumna();
			int filaReferencia= blocks[2].getFila();
			
			bloquesConflictivos[0][0] = filaReferencia-1;
			bloquesConflictivos[0][1] = columnaReferencia+1;
			bloquesConflictivos[1][0] = filaReferencia-1;
			bloquesConflictivos[1][1] = columnaReferencia;
			bloquesConflictivos[2][0] = filaReferencia+1;
			bloquesConflictivos[2][1] = columnaReferencia;
			
			if( !grilla.chequearColision(bloquesConflictivos) ) {
				blocks[0].setFila(filaReferencia-1);
				blocks[0].setColumna(columnaReferencia+1);
				
				blocks[1].setFila(filaReferencia-1);
				blocks[1].setColumna(columnaReferencia);
				
				blocks[3].setFila(filaReferencia+1);
				blocks[3].setColumna(columnaReferencia);
				
				rotation = 90;
			}else {
				bloquesConflictivos[0][0] = filaReferencia-1;
				bloquesConflictivos[0][1] = columnaReferencia;
				bloquesConflictivos[1][0] = filaReferencia-1;
				bloquesConflictivos[1][1] = columnaReferencia-1;
				bloquesConflictivos[2][0] = filaReferencia+1;
				bloquesConflictivos[2][1] = columnaReferencia-1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia-1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia-1);
					blocks[1].setColumna(columnaReferencia-1);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia-1);
					
					blocks[3].setFila(filaReferencia+1);
					blocks[3].setColumna(columnaReferencia-1);
					
					rotation = 90;
				}
				
			}
			
			break;
		}
		case 270:{
			
			int columnaReferencia = blocks[2].getColumna();
			int filaReferencia= blocks[2].getFila();
			
			
			if(columnaReferencia != 9) {
				int [][] bloquesConflictivos = new int[3][2];
				bloquesConflictivos[0][0] = filaReferencia+1;
				bloquesConflictivos[0][1] = columnaReferencia+1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia+1;
				bloquesConflictivos[2][0] = filaReferencia;
				bloquesConflictivos[2][1] = columnaReferencia-1;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia+1);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia+1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia-1);
					
					rotation = 180;
				}
				
				
				
			}
			
			if(columnaReferencia != 1 && rotation !=180) {
				int [][] bloquesConflictivos = new int[2][2];
				bloquesConflictivos[0][0] = filaReferencia;
				bloquesConflictivos[0][1] = columnaReferencia-1;
				bloquesConflictivos[1][0] = filaReferencia;
				bloquesConflictivos[1][1] = columnaReferencia-2;
				
				if( !grilla.chequearColision(bloquesConflictivos) ) {
					
					blocks[0].setFila(filaReferencia+1);
					blocks[0].setColumna(columnaReferencia);
					
					blocks[1].setFila(filaReferencia);
					blocks[1].setColumna(columnaReferencia);
					
					blocks[2].setFila(filaReferencia);
					blocks[2].setColumna(columnaReferencia-1);
					
					blocks[3].setFila(filaReferencia);
					blocks[3].setColumna(columnaReferencia-2);
	
				}
				
			}
			
			break;
		}
		
		}
		
	}

	@Override
	public int[] filasOcupadas() {
		
		int [] filasOcupadas = null;
		switch(rotation) {
		
		case 0:{
			int filaBloque0= blocks[0].getFila();
			filasOcupadas = new int[2];
			filasOcupadas[0] = filaBloque0;
			filasOcupadas[1] = filaBloque0+1;
			break;
		}
		
		case 90:{
			int filaBloque1= blocks[1].getFila();
			filasOcupadas = new int[3];
			filasOcupadas[0] = filaBloque1;
			filasOcupadas[1] = filaBloque1+1;
			filasOcupadas[2] = filaBloque1+2;
			break;
		}
		
		case 180:{
			int filaBloque1= blocks[1].getFila();
			filasOcupadas = new int[2];
			filasOcupadas[0] = filaBloque1;
			filasOcupadas[1] = filaBloque1+1;
			break;
		}
		
		case 270:{
			int filaBloque3= blocks[3].getFila();
			filasOcupadas = new int[3];
			filasOcupadas[0] = filaBloque3;
			filasOcupadas[1] = filaBloque3+1;
			filasOcupadas[2] = filaBloque3+2;	
			break;
		}
		
		}
		
		return filasOcupadas;
	}

}
