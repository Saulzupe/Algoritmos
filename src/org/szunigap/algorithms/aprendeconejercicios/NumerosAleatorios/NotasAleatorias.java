package NumerosAleatorios;
/*
    Programa: Ejercicio 11
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer
                de la forma: suspenso, suficienrte, bien, notable o sobre saliente. Al final
                aparecera el número de suspensos, el número de suficientes, el número de bienes
                ,etc.
    Fecha: JUNIO - 23
 */
public class NotasAleatorias {
    public static void main(String[] args) {
        int conteoSobresaliente = 0, conteoNotable = 0, conteoBien = 0, conteoSuficiente = 0, conteoSuspenso = 0;

        for (int i = 1; i <= 20; i++) {
            int nota = (int) ((Math.random() * 10) + 1) ;

            System.out.println("nota = " + nota);

            if (nota == 10) {
                System.out.println("Sobresaliente");
                conteoSobresaliente++;
            } else if (nota == 9) {
                System.out.println("notable");
                conteoNotable++;
            } else if ((nota == 8)) {
                System.out.println("Bien");
                conteoBien++;
            } else if ((nota >= 6 ) && (nota <= 7)) {
                System.out.println("Suficiente");
                conteoSuficiente++;
            } else if(nota < 6) {
                System.out.println("Suspenso");
                conteoSuspenso++;
            } else {
                System.out.println("Error...");
            }
        }
        System.out.println("Suficientes: " + conteoSuficiente + " Suspenso: " + conteoSuspenso
        + " Bien: " + conteoBien + " Notable " + conteoNotable + " Sobresaliente: " + conteoSobresaliente);
    }
}
