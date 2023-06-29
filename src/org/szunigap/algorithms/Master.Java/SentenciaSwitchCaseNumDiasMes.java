import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes, anio, numeroDias;
        numeroDias = 0;

        System.out.println("Ingrese un mes 1 - 12: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese un año (YYYY): ");
        anio = scanner.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                System.out.println("mes = " + mes + "dias: " + numeroDias);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                System.out.println("mes = " + mes + "dias: " + numeroDias);
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numeroDias = 29;
                    System.out.println("Es bisiesto");
                } else {
                    numeroDias = 28;
                    System.out.println("No es bisiesto");
                }
                break;
            default:
                System.out.println("Mes indefinido o eres de otro planeta");
        }

    }
}
