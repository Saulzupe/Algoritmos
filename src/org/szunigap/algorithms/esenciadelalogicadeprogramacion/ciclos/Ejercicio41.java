/*
        Programa: Ejercicio 41 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: determinar a cuánto es igual la suma de los elementos de la serie de Fibonacci
                    entre 0 y 100
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio41 {
    public static void main(String[] args) {
        int numero1, numero2, fibonacci=0, suma = 0;
        numero1 = 0; numero2 = 1;

        do{
            //System.out.print(fibonacci);
            suma += fibonacci;

            numero1 = numero2;
            numero2 = fibonacci;
            fibonacci = numero1 + numero2;

            /*System.out.println("numero1 = " + numero1);
            System.out.println("numero2 = " + numero2);*/
            System.out.println("fibonacci = " + fibonacci);
          /*  System.out.println("suma = " + suma);
            System.out.println("====================");*/

        } while (fibonacci < 5);
        System.out.println("LA suma de los primeros 100 números de la serie es : " + suma);
    }
}
