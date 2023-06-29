// Programa: Logica de programación
// Programador: Saúl Zúñiga
// Descripción:
//                *Leer tres numeros enteros y mostrarlos ascendentemente


package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero1 = sc.nextInt();;
        System.out.print("Ingrese otro número:  ");
        int numero2 = sc.nextInt();
        System.out.print("Ingrese otro número:  ");
        int numero3 = sc.nextInt();
        sc.close();
        System.out.println();
            System.out.println("Ordenando ...");
          //  Leer tres números enteros y mostrarlos ascendentemente.
            if ((numero1>numero2 && numero1 > numero3) && (numero2 > numero3)) {
                System.out.println(numero3 + " ," + numero2 + " ," + numero1);
            } else if ((numero2 > numero1 && numero2 > numero3) && (numero1 > numero3)){
                System.out.println(numero3 + " ," + numero1 + " ," + numero2);
            } else if ((numero3 > numero1 && numero3 > numero2) && numero1 > numero2 ) {
                System.out.println(numero2 + " ," + numero1 + " ," + numero3);
            } else if ((numero2 > numero3 && numero2 > numero1) && (numero3 > numero1)){
                System.out.println(numero1 + " ," + numero3 + " ," + numero2);
            } else if ((numero1>numero2 && numero1 > numero3) && (numero3 > numero2)) {
                System.out.println(numero2 + " ," + numero3 + " ," + numero1);
            } else {
                System.out.println("Todos son iguales o hay números repetido");
            }
    }
}
