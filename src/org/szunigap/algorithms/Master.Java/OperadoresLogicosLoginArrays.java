import java.util.Scanner;

public class OperadoresLogicosLoginArrays {
    public static void main(String[] args) {
        /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "saul";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "dba";
        passwords[2] = "12345";*/
        String[] usernames = {
                "Saul", "Admin", "DBA"
        };
        String[] passwords = {
                "12345", "12345", "12345"
        };
        boolean esAutenticado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String u = scanner.next();
        System.out.println("Password: ");
        String p = scanner.next();

       for (int i = 0; i < usernames.length; i++) {
           if ( (usernames[i].equals(u) && passwords[i].equals(p)) ){
               esAutenticado = true;
               break;
           }
       }

        if (esAutenticado){
            System.out.println("Welcome user: ".concat(u).concat("!") );
        } else {
            System.out.println("We need authentication!!");
            System.out.println("Username o Password are wrong! ");
        }
    }
}
