import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[]  colores = { "azul" , "amarillo", "rojo", "verde"  , "blanco" , "negro"};
         double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        //random *= 10; // del 0 al 9
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randoObj = new Random();
        int randomInt = 15 + randoObj.nextInt(25-15+1); // genera números aleatorios entre 15 y 25
        System.out.println("randomInt = " + randomInt);

        randomInt = randoObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
