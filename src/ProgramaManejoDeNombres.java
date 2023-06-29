import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
        System.out.println(resultado);

       /*
         Solucion alternativa
        String familiar1, familiar2, familiar3, nueva1, nueva2, nueva3;

        familiar1 = "Uriel";
        familiar2 = "Telma";
        familiar3 = "Pedro";

        nueva1 = familiar1.toUpperCase().charAt(1) + "." + familiar1.substring(3);
        nueva2 = familiar2.toUpperCase().charAt(1) + "." + familiar2.substring(3);
        nueva3 = familiar3.toUpperCase().charAt(1) + "." + familiar3.substring(3);

        System.out.println(nueva1+"_"+nueva2 + "_" + nueva3 );*/
        //System.out.println(familiar1.toUpperCase().charAt(1) + "." + familiar1.substring(3));

    }
}
