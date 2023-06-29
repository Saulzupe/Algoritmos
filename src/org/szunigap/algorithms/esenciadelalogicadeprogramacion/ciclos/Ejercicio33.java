/*
        Programa: Ejercicio 33 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Si 32768 es el tope superior para los números entero cortos, determinar cuál es el
                    número primo mas cercano por debajo de él
        Fecha:      10/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio33 {
    public static void main(String[] args) {
        int i,j,b,c=0,d=0;

        for (i = 2; i < 32768; i++){
            for (j = 1; j < i; j++){
                b = i % j;
                if (b == 0) {
                    c++;
                }
            }
            if (c == 2) {
                j = i;
            }
            if (d < j) {
                d = j;
            }
        }
        System.out.println("EL primo más cercano = " + d);

       /* int num, indicador, cuentaMultiplos, aux=0;
        num = 31767;
        indicador = 0;

        while (indicador == 0) {
            cuentaMultiplos = 0;
            aux = 1;
            while (aux <= num) {
                if (num % aux == 0) {
                    cuentaMultiplos++;
                }
                aux++;
            }
            if (cuentaMultiplos == 2) {
                indicador = 1;
                aux = num;
            }
            num--;
        }
        System.out.println("Determinar el número primo más cercano a 32768 -> " + aux);*/



    }
}
