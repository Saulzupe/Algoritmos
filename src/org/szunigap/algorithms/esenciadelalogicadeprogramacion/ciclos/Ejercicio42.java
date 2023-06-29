/*
        Programa: Ejercicio 42 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: determinar a cuánto es el promedio entero  de los elementos de la serie de Fibonacci
                    entre 0 y 100
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio42 {
    public static void main(String[] args) {
        int numero1, numero2, fibonacci=0, suma = 0, promedio = 0, contador = 0;
        numero1 = 0; numero2 = 1;

        do{
            suma += fibonacci;
            numero1 = numero2;
            numero2 = fibonacci;
            fibonacci = numero1 + numero2;
            contador++;
        } while (fibonacci < 100);
            promedio = suma/contador;
        System.out.println("promedio de los primeros 100 números de la serie es : " + promedio);
    }
}
