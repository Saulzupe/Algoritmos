import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        char num;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        num = s.next().charAt(0);

        switch (num) {
            case '0':
                System.out.println("el numero es 0");
                break;
            case '1':
                System.out.println("El número es 1");
                break;
            case '3':
                System.out.println("El numero es 3");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "Saul";
        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, Bienvenido!");
                break;
            case "Saul":
                System.out.println("Hola Saul");
                break;
            case "jose":
                System.out.println("Hola jose");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }
    }
}
