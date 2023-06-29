package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 14 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
//              saque por pantalla todas las potencias con base el número dado y exponentes entre y uno
//                 y el exponente introducido. No se deben utilizar funciones de exponenciación.
//              Por ejemplos, si introducimos el 2 y el 5 se deberan mostrar
//              2¹, 2², 2³, 2⁴, 2⁵
// Fecha: Mayo - 2023
public class PotenciasConBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Calculando la potencia ***");
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        int potencia = 1;
        for (int i = 1; i <= exponente; i++){
            System.out.print(base + "⁽" + i +"⁾ = " + (potencia *= base) + ",\t");
        }
    }
}
