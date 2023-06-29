package NumerosAleatorios;
/*
    Programa: Ejercicio 9
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
    y que no termine de generar números hasta que no saque el 24. El programa deberá decir al
    final cuántos números se han generado
    Fecha: JUNIO - 23
 */
public class AleatoriosPar {
    public static void main(String[] args) {
        int  aleatorio = 0, conteo=0;
        System.out.println("Generando par");

        while (aleatorio != 24) {
            aleatorio = (int) (Math.random() * 50) * 2;
            System.out.print(aleatorio + " ");
            conteo++;
        }

        System.out.println("Se han generado " + conteo);
    }
}
