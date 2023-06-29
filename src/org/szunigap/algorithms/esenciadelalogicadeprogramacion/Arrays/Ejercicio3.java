package Arrays;

import java.util.Scanner;

/*
    Programa: Ejercico 1 La esencia de la lógica de programación
    Desarrollador: Saúl Zúñiga
    Descripción: Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector
                 está el mayor primo leído.
    Fecha: JUunio 23
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean primo = false;
        int max=0, posicion = 0;

        System.out.println("Digite 10 enteros: ");
        for (int i = 0; i <= numeros.length-1; i++){
            numeros[i] = sc.nextInt();
        }

        // recorriendo el array
        for (int i = 0; i <= numeros.length-1; i++){
            if (esPrimo(numeros[i])) {
                if (numeros[max] > numeros[i]) {
                    max = numeros[i];
                    posicion = i;
                }
            }
        }
        System.out.println("EL número primo mayor está en la posición: " + posicion);

    }
    public static Boolean esPrimo(int numero){
        for (int i = 2; i < numero; i++){
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
