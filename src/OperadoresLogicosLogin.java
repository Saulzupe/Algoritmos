import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "Saul";
        String password = "12345";

        String username2 = "admin";
        String password2 = "root";
        boolean esAutenticado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String u = scanner.next();
        System.out.println("Password: ");
        String p = scanner.next();

        if ((username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p))) {
            esAutenticado = true;
        } else {
            System.out.println("Username or password is wrong!!");
        }

        if (esAutenticado){
            System.out.println("Welcome user: " + username.concat("!"));
        } else {
            System.out.println("We need authentication!!");
        }
    }
}
