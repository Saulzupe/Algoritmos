package Arrays;
/*
    Programa: Ejemplo
    Desarrollador: Saúl Zúñiga
    Descripción: Leer 10 números enteros y determinar cuál es el promedio entero de dichos números
    Fecha: JUunio 23
    */

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10]; // Almacenara los 10 datos enteros que se lean
        int  promedio;       // Servira como variable subíndice, almacenara el promedio entero

        System.out.println("Digite 10 números enteros: "); // avisamos que vamos a leer 10 enteros
        for(int i = 0 ;  i <= numeros.length-1; i++) { // leemos
            numeros[i] = sc.nextInt();
        }

        promedio = 0;                   // inicializamos el promedio en 0
        for (int i = 0; i <= numeros.length-1; i++){ // calculando el promedio como tal
            promedio = promedio + numeros[i];
        }
        promedio /= 10;
        System.out.println("El promedio entero es " + promedio); // mostramos el calculo en pantalla
    }

}
