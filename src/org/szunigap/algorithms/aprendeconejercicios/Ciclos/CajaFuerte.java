package Ciclos;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion = 4539;
        int intento = 0;

        System.out.println("Control de acceso a caja fuerte");

        while (intento < 4) {
            System.out.print("Ingrese la combinación: ");
            int combinacionIngresada = sc.nextInt();

            if (combinacion == combinacionIngresada) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            intento++;
        }
    }
}
