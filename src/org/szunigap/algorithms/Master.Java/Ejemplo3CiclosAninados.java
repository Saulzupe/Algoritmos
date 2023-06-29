import java.util.Scanner;

public class Ejemplo3CiclosAninados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, dig;

        System.out.println("Dígite un número entero");
        numero = sc.nextInt();

        if (numero < 0 ) {
            numero *= (-1);
        }

        while (numero != 0){
            dig = numero - numero / 10 * 10;

            for (int i = 1; i <= dig; i++){
                System.out.print(" \t numero => " + numero + " \t dig => "+ dig + "\t i => " + i);
                System.out.println();
            }

            numero = numero / 10;
        }
    }
}
