import java.util.Scanner;

public class Ejemplo1CiclosAnidados {
    public static void main(String[] args) {
        int numero, factorial;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dígite números, 0 para salir: ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero < 0) {
                System.out.println("No está definido el factorial para números negativos");
            } else {
                factorial = 1;
                for (int i = 1; i <= numero; i++){
                    factorial *= i;
                }
                System.out.println("El factorial de " + numero + " es" + factorial);
            }
            numero = sc.nextInt();
        }
    }
}
