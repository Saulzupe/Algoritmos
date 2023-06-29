package org.szunigap.algorithms.curso.homeworks;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculandoEdad {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento con formato yyyy-MM-dd: ");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        // Creamos un patron de fecha numérico con el año mes y día.
        df = new SimpleDateFormat("yyyyMMdd");

        // Convertimos ambas fechas en enteros con el año mes y dia
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // restamos ambas fechas y divimos en 10000 para quitar decimales y dejar la fecha
        // en decenas y centenas
        int edad = (hasta-desde) / 10000;
        System.out.println("La edad es  = " + edad);

    }
}
