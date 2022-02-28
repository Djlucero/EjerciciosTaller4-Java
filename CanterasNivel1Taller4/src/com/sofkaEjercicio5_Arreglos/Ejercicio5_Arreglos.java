package com.sofkaEjercicio5_Arreglos;

import java.util.Scanner;

public class Ejercicio5_Arreglos {
	
	

	public static void Ejercicio5_Arreglos() {
		
	Scanner lector =new Scanner(System.in);
	int matriz[][]=new int [10][10];
	
	imprimirTalba();
	CapturarMatrix();
	
	
	
	}
	
	private static void imprimirTalba() {
	
	    
	
	System.out.println("          ------------------------------------------------------------");
	System.out.println("         |                    C O L U M N A S                         |");
	System.out.println("          ------------------------------------------------------------");
	System.out.println(" ________|  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9   |");
	System.out.println("|   |  0 | 1x1 | 2x1 | 3x1 | 4x1 | 5x1 | 6x1 | 7x1 | 8x1 | 9x1 | 10x1 |");
	System.out.println("|   |  1 | 1x2 | 2x2 | 3x2 | 4x2 | 5x2 | 6x2 | 7x2 | 8x2 | 9x2 | 10x2 |");
	System.out.println("| F |  2 | 1x3 | 2x3 | 3x3 | 4x3 | 5x3 | 6x3 | 7x3 | 8x3 | 9x3 | 10x3 |");
	System.out.println("| I |  3 | 1x4 | 2x4 | 3x4 | 4x4 | 5x4 | 6x4 | 7x4 | 8x4 | 9x4 | 10x4 |");
	System.out.println("| L |  4 | 1x5 | 2x5 | 3x5 | 4x5 | 5x5 | 6x5 | 7x5 | 8x5 | 9x5 | 10x5 |");
	System.out.println("| A |  5 | 1x6 | 2x6 | 3x6 | 4x6 | 5x6 | 6x6 | 7x6 | 8x6 | 9x6 | 10x6 |");
	System.out.println("| S |  6 | 1x7 | 2x7 | 3x7 | 4x7 | 5x7 | 6x7 | 7x7 | 8x7 | 9x7 | 10x7 |");
	System.out.println("|   |  7 | 1x8 | 2x8 | 3x8 | 4x8 | 5x8 | 6x8 | 7x8 | 8x8 | 9x8 | 10x8 |");
	System.out.println("|   |  8 | 1x9 | 2x9 | 3x9 | 4x9 | 5x9 | 6x9 | 7x9 | 8x9 | 9x9 | 10x9 |");
	System.out.println("|   |  9 | 1x10| 2x10| 3x10| 4x10| 5x10| 6x10| 7x10| 8x10| 9x10| 10x10|");
	System.out.println(" _____________________________________________________________________");
	System.out.println(" ");
	
	}
	
	
	private static void CapturarMatrix() {
	Scanner lector =new Scanner(System.in);
	int matriz[][]=new int [10][10];
    for(int fila =0;fila<matriz.length;fila++){
        for(int columna=0;columna<matriz.length+1;columna++){
	    
	 
	matriz[0][0] = (1*1);
	matriz[0][1] = (2*1);
	matriz[0][2] = (3*1);
	matriz[0][3] = (4*1);
	matriz[0][4] = (5*1);
	matriz[0][5] = (6*1);
	matriz[0][6] = (7*1);
	matriz[0][7] = (8*1);
	matriz[0][8] = (9*1);
	matriz[0][9] = (10*1);
	matriz[1][0] = (1*2);
	matriz[1][1] = (2*2);
	matriz[1][2] = (3*2);
	matriz[1][3] = (4*2);
	matriz[1][4] = (5*2);
	matriz[1][5] = (6*2);
	matriz[1][6] = (7*2);
	matriz[1][7] = (8*2);
	matriz[1][8] = (9*2);
	matriz[1][9] = (1021);
	matriz[2][1] = (2*3);
	matriz[2][2] = (3*3);
	matriz[2][3] = (4*3);
	matriz[2][4] = (5*3);
	matriz[2][5] = (6*3);
	matriz[2][6] = (7*3);
	matriz[2][7] = (8*3);
	matriz[2][8] = (9*3);
	matriz[2][9] = (10*3);
	matriz[3][1] = (2*4);
	matriz[3][2] = (3*4);
	matriz[3][3] = (4*4);
	matriz[3][4] = (5*4);
	matriz[3][5] = (6*4);
	matriz[3][6] = (7*4);
	matriz[3][7] = (8*4);
	matriz[3][8] = (9*4);
	matriz[3][9] = (10*4);
	matriz[4][1] = (2*5);
	matriz[4][2] = (3*5);
	matriz[4][3] = (4*5);
	matriz[4][4] = (5*5);
	matriz[4][5] = (6*5);
	matriz[4][6] = (7*5);
	matriz[4][7] = (8*5);
	matriz[4][8] = (9*5);
	matriz[4][9] = (10*5);
	matriz[5][1] = (2*6);
	matriz[5][2] = (3*6);
	matriz[5][3] = (4*6);
	matriz[5][4] = (5*6);
	matriz[5][5] = (6*6);
	matriz[5][6] = (7*6);
	matriz[5][7] = (8*6);
	matriz[5][8] = (9*6);
	matriz[5][9] = (10*6);
	matriz[6][1] = (2*7);
	matriz[6][2] = (3*7);
	matriz[6][3] = (4*7);
	matriz[6][4] = (5*7);
	matriz[6][5] = (6*7);
	matriz[6][6] = (7*7);
	matriz[6][7] = (8*7);
	matriz[6][8] = (9*7);
	matriz[6][9] = (10*7);
	matriz[7][1] = (2*8);
	matriz[7][2] = (3*8);
	matriz[7][3] = (4*8);
	matriz[7][4] = (5*8);
	matriz[7][5] = (6*8);
	matriz[7][6] = (7*8);
	matriz[7][7] = (8*8);
	matriz[7][8] = (9*8);
	matriz[7][9] = (10*8);
	matriz[8][1] = (2*9);
	matriz[8][2] = (3*9);
	matriz[8][3] = (4*9);
	matriz[8][4] = (5*9);
	matriz[8][5] = (6*9);
	matriz[8][6] = (7*9);
	matriz[8][7] = (8*9);
	matriz[8][8] = (9*9);
	matriz[8][9] = (10*9);
	matriz[9][1] = (2*10);
	matriz[9][2] = (3*10);
	matriz[9][3] = (4*10);
	matriz[9][4] = (5*10);
	matriz[9][5] = (6*10);
	matriz[9][6] = (7*10);
	matriz[9][7] = (8*10);
	matriz[9][8] = (9*10);
	matriz[9][9] = (10*10);
	
	
        }
    }
	


   for (int fila=0; fila<9; fila++) {
	for (int columna=0; columna<9; columna++) {
		System.out.print("digite No.fila\n");
		fila = lector.nextInt();
		System.out.print("digite No. columna\n");
		columna = lector.nextInt();
		System.out.print("el resultado de la multiplicacion es: "+matriz[fila][columna]+"\n"+"\n");
		
	}
    
   }
}
}



