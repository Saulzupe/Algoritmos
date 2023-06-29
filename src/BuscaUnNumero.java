import java.util.Scanner;

public class BuscaUnNumero {
    public static void main(String[] args) {
        int numero = 10;
        int[] numeros = new int[10];
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        for(int i=0; i < numero; i++)
        {
            numeros[i]=num.nextInt();
        }
    }
}
