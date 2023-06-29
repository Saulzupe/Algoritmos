package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 21 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Realiza un programa que vaya pidiendo números hasta que se introduzca un
//              numero negativo y nos diga cuantos números se han introducido, la media de los impares
//              y el mayor de los pares. El número negativo sólo se utiliza para indicar el final
//              de la introducción de datos no se incluye en el cómputo
// Fecha: Mayo - 2023
public class ConjuntoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, contador = 0, mayorPar = 0, contadorImpar = 0;
        double mediaImpar = 0.0d, suma = 0.0d;

        System.out.println("**** Ingrese números positivos, negativo para salir ****");
        while(numero >= 0) {
            System.out.print("introduce su número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            } else {
                suma += numero;
                contadorImpar++;
            }
            contador++;
        }
        suma -= numero;
        System.out.println("El mayor de los pares es = " + mayorPar);
        mediaImpar = suma/(contadorImpar-1);
        System.out.println("La media de los impares es: " + mediaImpar);
        System.out.println("Se han introducido: " + (contador - 1) + " números");
    }
}
