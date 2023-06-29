public class EjemploString {
    public static void main(String[] args) {
        String Curso = "Programación Java";
        String Curso2 = new String("Programación Java");

        boolean esIgual = Curso == Curso2;
        System.out.println("Curso == Curso2 " + esIgual);

        esIgual = Curso.equals(Curso2);
        System.out.println("curso.equals(curso2)  " + esIgual);

        String Curso3 = "Programación Java";
        esIgual = Curso == Curso3;
        System.out.println("Curso == Curso3 " + esIgual);
    }
}
