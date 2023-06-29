import java.util.Scanner;

/*
    Programa: Ejemplo 1 Ciclos Lógica de programación.
    Descripción: Leer un número entero y determinar cuántos dígitos tiene
 */
public class EjemploCiclos1 {
    public static void main(String[] args) {
        // Declarando variables
        int numero, contador, contador2;
        // Creando una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
// Solicitamos un dato entero, lo leemos y almacenamos en la variable numero
        System.out.print("Dígite un número entero ");
        numero = sc.nextInt();
        // Incializando el contador en 0
        contador = 0;
        // Mientras número sea distinto de 0 dividimos entre 10 y contamos
        System.out.println(" Usando While ");
        while (numero != 0){
            numero = numero / 10;
            contador++;
        }
        System.out.println( "Tiene " + contador + " digitos");

        System.out.println(" Usando do While ");
        numero = sc.nextInt();
        contador2 = 0;
        do {
            numero = numero / 10;
            contador2++;
        }while (numero > 0);
        System.out.println( "Tiene " + contador2 + " digitos");
    }
}
