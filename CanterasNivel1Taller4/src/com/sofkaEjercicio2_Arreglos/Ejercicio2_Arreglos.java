package com.sofkaEjercicio2_Arreglos;

import java.util.Random;

import java.util.Arrays;

public class Ejercicio2_Arreglos {
	
	public static void rellenaArray(int[] a, int max){
		Random aleatorio = new Random(System.currentTimeMillis());
		int intAleatorio;
		for (int i = 0; i < a.length; i++){
			a[i] = aleatorio.nextInt(max);
		}
		}
	public static void main(String[] args) {
		int[] array1 = new int[20];
		rellenaArray(array1, 30);
		int par;
		int impar;
 
		System.out.println("Array : "+Arrays.toString(array1));
 
		par = 0;
		impar = 0;
 
		for (int z = 0; z < array1.length ; z++ ) {
			if (z % 2 == 0) {
				par = par + 1;
			}else{
				impar = impar + 1;
			}
		}
		
		 
		System.out.println("N�meros pares:: " +par);
		System.out.println("el n�mero de impares son: " +impar);
	}
}