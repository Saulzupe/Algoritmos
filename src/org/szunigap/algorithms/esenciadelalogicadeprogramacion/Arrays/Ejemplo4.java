package Arrays;
import java.util.Scanner;

/*
    Programa: Ejemplo
    Desarrollador: Saúl Zúñiga
    Descripción: Leer 10 números enteros. Luego leer 1 número entero y determinar si este último número
                    está entre los 10 primeros números leídos
    Fecha: JUunio 23
 */
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int vector[] = new int[10];
       int num;    // El contenido de esta variable nos va a indicar si el número se encontro o no
        boolean s = false;
        System.out.println("Digite 10 números enteros");

        for (int i = 1; i < vector.length; i++){ //leemos y almacenamos cada elemento una posición diferente
            vector[i] = sc.nextInt();
        }
        System.out.println("ahora digite un número"); // Solicitamos un número a buscar y lo almacenamos
        num = sc.nextInt();                             // en la variable num

                  // Inicializamos la variable misteriosa en 0

        for (int i = 1; i < vector.length; i++) { // Recorremos el vector desde la primera posición hasta la última

            if (vector[i] == num) {     // Si el contenido de cada posición es igual al contenido de la variable num
                System.out.println("El número " + num + " si está en los 10 números digitados");
                s = true;
                break;
            }                           // Sio dicha respuesta es verdadera entonce lo muestra en pantalla y almacena
                                        // en la variable misteriosa  el valor 1

        }               // cuando haya terminado el ciclo pregunta por el valor almacenado en la variable s
                        // si este valor almacenado es 0 quiere decir que no encontró el número buscado y por lo tanto avisa en pantalla

      if (!s) {
          System.out.println("El número " + num + " no está en los 10 números digitados");
      }
    }
}
