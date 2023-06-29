package Arrays;

import java.util.Scanner;

/*
    Programa: Ejemplo
    Desarrollador: Saúl Zúñiga
    Descripción: Leer 10 números enteros. Luego leer 1 número entero y determinar cuántas veces está
                    entre los 10 primeros, además decir en qué posiciones está.
    Fecha: JUunio 23
 */
public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int num, cont = 0, ind = 0;

        while (ind < numeros.length){
            numeros[ind] = sc.nextInt();
            ind++;
        }
        System.out.println("Dígite un número entero");
        num = sc.nextInt();
        ind = 0;
        while(ind < numeros.length){
            if (num == numeros[ind]){
                System.out.println("El número " + num + " esta en la posición " + ind);
                cont++;
            }
            ind++;
        }
        if (cont == 0) {
            System.out.println("El número no se encuentra");
        } else {
            System.out.println("En total está " + cont + " veces");
        }
    }
}
