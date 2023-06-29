package org.szunigap.algorithms.curso.homeworks;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    static double producto1, producto2, resultado, resultadoImpuesto, total = 0;

    public static void main(String[] args) {

        double impuesto = 0.19;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Descripción de factura: ");
        String descripcion = scanner.nextLine();

        try {
            System.out.println("Ingrese el precio del primer producto: ");
            producto1 = scanner.nextDouble();
            System.out.println("Ingrese el precio del segundo producto: ");
            producto2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El número debe ser de tipo flotante");
            main(args);
            System.exit(0);
        }

        resultado = producto1 + producto2;
        resultadoImpuesto = resultado * impuesto;
        total = resultado + resultadoImpuesto;


        System.out.println("La factura de " + descripcion + "tiene un total bruto de "
                + resultado + " Con un impuesto de " + resultadoImpuesto +
                " y el monto después de impuesto es de " + total );
    }
}
