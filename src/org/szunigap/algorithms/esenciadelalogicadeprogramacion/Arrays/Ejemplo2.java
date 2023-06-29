package Arrays;
import java.util.Scanner;
/*
    Programa: Ejemplo
    Desarrollador: Saúl Zúñiga
    Descripción: Desarrollar un programa que permita leer 10 números enteros y determinar en qué
                    pocisión entró el número mayor
    Fecha: JUunio 23
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10]; //Almadenara 10 números enteros que se van a ller
        int posMay, aux;                 //Almacenara la posición del número mayor encontrado, provisionalmente
                                    // y del número mayor absoluto cuando se haya finalizado el ciclo de búsqueda del mayor

        System.out.println("Dígite 10 números enteros..."); // Avisa que va a leer 10 números enteros

        for(int i = 1; i <= vector.length-1; i++){ //Genera un ciclo apoyado en la variable indice que tomará valores desde 1 hasta 10
            vector[i] = sc.nextInt();               //Lea un entero y guardelo en el vector en la posicion que sea igual al valor almacenado en la variable i
        }  // fin ciclo

        posMay = 1;                                 // Se inicializa la variable Pos_May con el valor 1 para asumir,
        aux = vector[1];                                      // provisionalmente, que el mayor se encuentra en la primera posición.
                                                    // La intención es ir comparando progresivamente con este dato cada uno
                                                    // de los restantes datos que se encuentran almacenados en el vector

        for (int i = 2; i<= vector.length-1; i++){ // Genera un ciclo desde 2 hasta 10 para comparar contra el primer dato el resto de datos
                                                    // Si el dato almacenado en el vector en la posición donde vaya el indice en el momento es mayor que el dato que
            if (vector[i] > vector[posMay]){        // provisionalmente es el mayor eso quiere decir que el mayor que estaba en la posición que decía la
                posMay = i;                     // variable posMay ya no es el mayor y que el nuevo mayor está en la posición en donde esta el indice
                aux = vector[i]  ;                          // por lo cual la variable posMay debe ser igual al concenido de la variable
            }
        }
        System.out.println("El número mayor es " + aux + " está en la posición " + posMay);
    }
}
