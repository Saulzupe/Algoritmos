public class PrimitivoFloat {
    public static void main(String[] args) {
        float realFloat = 2.12e3f; //2120f
        //float realNegativo = 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en byte a = " + Float.SIZE);
        System.out.println("Máximo valor para float " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float " + Float.MIN_VALUE);

        double realDouble = 3.40282335E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en byte a = " + Double.SIZE);
        System.out.println("Máximo valor para float " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para float " + Double.MIN_VALUE);
    }
}
