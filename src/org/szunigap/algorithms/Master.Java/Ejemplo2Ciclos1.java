import java.util.Scanner;

/*
    Programa: Ejemplo 2 Ciclos La esencia de la Lógica de programación.
    Descripción: Leer dos números enteros y mostrar todos los enteros comprendidos entre el menor y el mayor

 */
public class Ejemplo2Ciclos1 {
    public static void main(String[] args) {
        int numero1, numero2, auxiliar; // Declaración de variables
        Scanner sc = new Scanner(System.in); // Creando una nueva instancia de la clase Scanner
        System.out.print("Dígite un Entero: "); // Solicitamos el primer número
        numero1 = sc.nextInt();                 // Leemos el numero y lo almacenamos en la variable
        System.out.print("Dígite otro Entero: "); // Solicitamos el segundo número
        numero2 = sc.nextInt();                 // Leemos el numero y lo almacenamos en la variable

        if (numero1 < numero2) { // Si el primer número es el menor
           auxiliar = numero1; // Hacemos auxiliar igual a numero1
            while (auxiliar <= numero2) { // Mientras Auxiliar sea menor o igual  que numero 2
                System.out.println( auxiliar); // Escribimos el contenido de Auxiliar
                auxiliar++;                     // Incrementamos en 1 el auxiliar
            }
        }
        if (numero2 < numero1) {
            auxiliar = numero2;
            while (auxiliar <= numero1) { // Mientras Auxiliar sea menor o igual  que numero 2
                System.out.println(auxiliar); // Escribimos el contenido de Auxiliar
                auxiliar++;                     // Incrementamos en 1 el auxiliar
            }
        }
    }
}
