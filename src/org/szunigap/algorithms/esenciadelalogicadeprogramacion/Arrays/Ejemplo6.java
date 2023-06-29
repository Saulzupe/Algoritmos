package Arrays;

import java.util.Scanner;

/*
    Programa: Ejemplo
    Desarrollador: Saúl Zúñiga
    Descripción: Cargar dos vectores cada uno con 5 datos enteros, y determinar si los datos almacenados
                en ambos vectores son exactamente los mismos tanto en contenido como en posición
    Fecha: JUunio 23
 */
public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[5], v2 = new int[5];
        int ind = 0;
        boolean s = false;

        System.out.println("Digite el primer conjunto de 5 enteros ");
        for (int i = 0; i < v1.length; i++){
            v1[i] = sc.nextInt();
        }

        System.out.println("Digite el segundoconjunto de 5 enteros ");
        for (int i = 0; i < v2.length; i++){
            v2[i] = sc.nextInt();
        }

        while ((ind <= 5) && !(s)){
            if (v1[ind] != v2[ind]) {
                s= true;
            }
            ind++;
        }
        if (!s){
            System.out.println("El contenido de los dos vectores es exactamente igual");
        } else {
            System.out.println("El contenido de los dos vectores es diferente");
        }
    }
}
