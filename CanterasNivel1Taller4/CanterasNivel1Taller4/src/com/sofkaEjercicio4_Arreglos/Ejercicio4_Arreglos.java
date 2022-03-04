package com.sofkaEjercicio4_Arreglos;

import java.util.Scanner;

public class Ejercicio4_Arreglos {
	
	public void Ejercicio4_Arreglos() {
		// TODO Auto-generated method stub
			
	
	
	    // TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
	    int matriz[][]=new int [4][5];
	    for(int fila =0;fila<4;fila++){
	        for(int columna=0;columna<5;columna++){
	        	
	        	matriz[0][0] = 1;
	    		matriz[0][1] = 2;
	    		matriz[0][2] = 3;
	    		matriz[0][3] = 4;
	    		matriz[0][4] = 5;
	    		matriz[1][0] = 6;
	    		matriz[1][1] = 7;
	    		matriz[1][2] = 8;
	    		matriz[1][3] = 9;
	    		matriz[1][4] = 10;
	    		matriz[2][0] = 11;
	    		matriz[2][1] = 12;
	    		matriz[2][2] = 13;
	    		matriz[2][3] = 14;
	    		matriz[2][4] = 15;
	    		matriz[3][0] = 16;
	    		matriz[3][1] = 17;
	    		matriz[3][2] = 18;
	    		matriz[3][3] = 19;
	    		matriz[3][4] = 20;

	        }
	    }
	    
	    
	    
	    for(int fila=0;fila<4;fila++){
	    	System.out.println(" ");
	        for(int columna=0;columna<5;columna++){
	            System.out.print(matriz[fila][columna]+"\t");
	            System.out.print(" ");
	            
	        }
	    }
	    
	    
	    System.out.println(" ");
	    for(int fila=0;fila<1;fila++){
	    	System.out.println(" ");
	        for(int columna=0;columna<5;columna++){
	            System.out.print(matriz[fila][columna]+"\t");
	           
	        }
	    }

	    for(int fila=1;fila<2;fila++){
	    	System.out.println(" ");
	        for(int columna=5-1;columna>=0;columna--){
	            System.out.print(matriz[fila][columna]+"\t");
	           
	        }
	    }
	    for(int fila=2;fila<3;fila++){
	    	System.out.println(" ");
	        for(int columna=0;columna<5;columna++){
	            System.out.print(matriz[fila][columna]+"\t");
	           
	        }
	    }
		
	    for(int fila=3;fila<4;fila++){
	    	System.out.println(" ");
	        for(int columna=5-1;columna>=0;columna--){
	            System.out.print(matriz[fila][columna]+"\t");
	    
	}
	    }
	}
	}
	    
	

			
	    
	

