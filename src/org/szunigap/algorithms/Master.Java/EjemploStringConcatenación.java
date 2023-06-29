public class EjemploStringConcatenación {
    public static void main(String[] args) {
        String curso = "Programación Java ";
        String profesor = " Andrés Guzmán ";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroB + numeroA + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
