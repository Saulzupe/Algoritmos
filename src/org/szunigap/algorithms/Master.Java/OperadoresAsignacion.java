public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 3; // i = i + 3 -> 8
        System.out.println("i = " + i);

        i += 13; // i = i + 13 -> 21
        System.out.println("i = " + i);

        j -= 5; // j = j - 5 -> 4
        System.out.println("j = " + j);

        j *= 5; //j = j*5 -> 20
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM clientes as C";
        sqlString += " WHERE C.nombre = 'Saul'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }
}
