import java.util.Scanner;

public class SentenciaIfElse {

    public static void main(String[] args) {
        float promedio;
        Scanner scanne = new Scanner(System.in);

        System.out.println("Ingrese el promedio: ");
        promedio = scanne.nextFloat();

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio");
        } else if ( promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if ( promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte un poco más!");
        } else if ( promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Reprobado!");
        }

        System.out.println("promedio = " + promedio);
    }
}
