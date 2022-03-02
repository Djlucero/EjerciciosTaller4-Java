package com.sofkaEjercicio1_Arreglos;
import java.util.Scanner;

public class Ejercicio1_Arreglos {
	
	
	private static int[] numero;
	private static Scanner lector;
	private static int i;
	
	public void Ejercicio1_Arreglos() {
		lector = new Scanner(System.in);
		numero = new int[5];
		
		CapturarNum();
		ImprimirNum();
		
	}
		private static void CapturarNum() {
	for (i= 0; i<= 4;  i++) {
		System.out.println("Digite numero");
		numero[i]=lector.nextInt();
		System.out.println("");
	}
	}

		private static void ImprimirNum() {
		for( i=0; i<=4; i++) 
		System.out.printf("["+i+"]="+numero[i]+"\n");
	
	}
		


}