/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Mostrar en pantalla todos los enteros comprendidos entre 1 y 100;
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Mostrando en pantalla todos los enteros comprendidos entre 1 y 100
        int contador = 1;
        while(contador <= 100) {
            System.out.print(contador + "\t"); ;
            if (contador == 25 || contador == 50 || contador == 75){
                System.out.println("\t");
            }
            contador++;
        }
    }
}
