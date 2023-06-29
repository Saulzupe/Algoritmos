import java.util.Scanner;

public class OperadoresLogicosLoginTernario {
    public static void main(String[] args) {
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
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido usuario".concat(u).concat("!"):
                "Username o contraseña incorrectos \n Lo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
    }
}
