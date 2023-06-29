package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 29
    Desarrollador: Saúl Zúñiga
    Descripción:Escribe un programa qu emuestre por pantallla todos los números enteros positivos
                menores a uno leído por teclado que no sean divisibles entre otro también leído
                 de igual forma

 */
public class EnterosPositivosMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean multiplo = false;
        System.out.print("Digite un número: ");
        int numero = sc.nextInt();

        System.out.print("Digite un segundo número: ");
        int numero2 = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if ((numero2 % i) != 0) {
                multiplo = true;
                System.out.print(i + "\t");
            }
        }
    }
}
