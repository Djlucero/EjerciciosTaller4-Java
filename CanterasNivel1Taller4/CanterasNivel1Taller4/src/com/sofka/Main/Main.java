package com.sofka.Main;

import java.io.IOException;
import java.util.Scanner;

import com.sofkaEjercicio1_Arreglos.Ejercicio1_Arreglos;
import com.sofkaEjercicio2_Arreglos.Ejercicio2_Arreglos;
import com.sofkaEjercicio3_Arreglos.Ejercicio3_Arreglos;
import com.sofkaEjercicio4_Arreglos.Ejercicio4_Arreglos;
import com.sofkaEjercicio5_Arreglos.Ejercicio5_Arreglos;



public class Main {

    private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

    private static void menu() {
    	System.out.println("------------------------------------------------");
        System.out.println("TALLER N.5 Arreglos");
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Ejercicio3_Arreglos N.1");
        System.out.println("2. Ejercicio3_Arreglos N.2");
        System.out.println("3. Ejercicio3_Arreglos N.3");
        System.out.println("4. Ejercicio3_Arreglos N.4");
        System.out.println("5. Ejercicio3_Arreglos N.5");
        System.out.println("6. Salir");
        System.out.println("------------------------------------------------");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
            	Ejercicio1_Arreglos p1 = new Ejercicio1_Arreglos();
                p1.Ejercicio1_Arreglos();
                return true;
                
            case 2:
            	Ejercicio2_Arreglos p2 = new Ejercicio2_Arreglos();
                p2.main(null);
                return true;
                
            case 3:
            	Ejercicio3_Arreglos p3 = new Ejercicio3_Arreglos();
                p3.main(null);
                return true;
                
            case 4:
            	Ejercicio4_Arreglos p4 = new Ejercicio4_Arreglos();
                p4.Ejercicio4_Arreglos();
                return true;
                
                
            case 5:
            	Ejercicio5_Arreglos p5 = new Ejercicio5_Arreglos();
                p5.Ejercicio5_Arreglos();
                return true;
            
           
                
            case 7:
                return false;
                // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
                
        }
        return true;
    }

    private static void limpiarPantalla() {
    		System.out.println();
    		}
    

}
