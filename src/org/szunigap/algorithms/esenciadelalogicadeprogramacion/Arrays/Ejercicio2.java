package Arrays;

import java.util.Scanner;

/*
    Programa: Ejercico 2 La esencia de la lógica de programación
    Desarrollador: Saúl Zúñiga
    Descripción: Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector
                 está el mayor número par leído.
    Fecha: JUunio 23
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int max = 0;

        System.out.println("Digite 10 numeros enteros");
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int i = 1; i < numeros.length; i++) {

           if (numeros[i] % 2 == 0) {
               max = (numeros[max] >  numeros[i]) ? max : i;
           }

        }
        System.out.println("El máximo esta en la posicion : " + max);
    }
}
