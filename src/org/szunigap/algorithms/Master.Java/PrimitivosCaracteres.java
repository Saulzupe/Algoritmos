public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == caracter = " + (simbolo == caracter));
        System.out.println("Char corresponde en byte = "  + Character.BYTES);
        System.out.println("Char corresponde en bites = "  + Character.SIZE);
        System.out.println("Valor mínimo = "  + Character.MIN_VALUE);
        System.out.println("Valor máximo = "  + Character.MAX_VALUE);




    }
}
