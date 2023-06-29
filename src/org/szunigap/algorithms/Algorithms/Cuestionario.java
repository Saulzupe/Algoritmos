/* Programa: Ejercicio 12 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
    que se imparten en el curso. Cada pregunta acertada sumará un punto. El
    programa mostrará al final la calificación obtenida. Pásale el minicuestionario
    a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
    en las diferentes asignaturas del curso.
 *  Fecha: 21/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class Cuestionario {
    public static void main(String[] args) {
        Scanner  resp0 = new Scanner(System.in);
        Scanner resp = new Scanner(System.in);
        Scanner res = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        Scanner r1 = new Scanner(System.in);
        int cont = 0;
        System.out.println("Bienvenido al Test ");
        System.out.println("Favor de contestar el cuestionario...");

        System.out.println("¿Cual es el río más largo del mundo?");
        String resp1 = res.next();
        System.out.println("¿Cómo se llama la Reina del Reino Unido?");
        String resp2 = res.next();
        System.out.println("¿En qué continente esta ecuador?");
        String resp3 = resp0.next();
        System.out.println("¿Dónde se originaron los juegos olimpicos?");
        String resp4 = resp0.next();
        System.out.println("¿Qué tipo de animal es la ballena?");
        String resp5 = resp.next();
        System.out.println("¿Cuantos colores tiene la bandera de México?");
        String resp6 = resp.next();
        System.out.println("¿Cuantos huesos tiene el cuerpo humano?");
        int resp7 = resp0.nextInt();
        System.out.println("¿Quien pinto la última cena?");
        String resp8 = r.nextLine();
        System.out.println("¿quien es el autor del quijote?");
        String resp9 = r1.nextLine();
        System.out.println("¿Año en que acabo la II Guerra mundial?");
        int resp10 = resp0.nextInt();

        if (resp1.equalsIgnoreCase("Amazonas")){
            System.out.println("correcto");
            ++cont;

        } else {
            System.out.println("Incorrecto");
        }
        if (resp2.equalsIgnoreCase("Isabel")){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp3.equalsIgnoreCase("America")){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp4.equalsIgnoreCase("Grecia")){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp5.equalsIgnoreCase("Mamifero")){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp6.equalsIgnoreCase("3")){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp7 == 206){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp8.equalsIgnoreCase("Leonardo da Vinci")){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }
        if (resp9.equalsIgnoreCase("Miguel de Cervantes")){
            System.out.println("correcto");
            ++cont;

        } else {
            System.out.println("Incorrecto");
        }
        if (resp10 == 1945){
            System.out.println("correcto");
            ++cont;
        } else {
            System.out.println("Incorrecto");
        }

        float total = ((float)cont/10);
        System.out.println("Puntuación: " + total );
    }
}
