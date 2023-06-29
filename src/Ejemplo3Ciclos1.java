import java.util.Scanner;

public class Ejemplo3Ciclos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial de un número");
        int N, contador, fact;

        System.out.print("Dígite un número entero: ");
        N = sc.nextInt();

        if (N < 0) {
            System.out.println("El factorial no esta definido para números negativos");
        }
        fact = 1;
        contador = 1;
       System.out.println("Usando While");
        while (contador <= N){
            fact *= contador;
            contador++;
        }
        System.out.print("El factorial de " + N + " es = " + fact + "\n");

        System.out.println("Usando For");
         fact = 1;

        for (int i = 1; i <= N; i++){
            fact *= i;
        }
        System.out.print("El factorial de " + N + " es = " + fact+ "\n");

        System.out.println("Usando Do while");
        fact = 1;
        contador = 1;
        do {
            fact *= contador;
            contador++;
        } while (contador <= N);
        System.out.print("El factorial de " + N + " es = " + fact);
    }
}
