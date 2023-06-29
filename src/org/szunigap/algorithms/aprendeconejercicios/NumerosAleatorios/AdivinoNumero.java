package NumerosAleatorios;

import java.util.Scanner;

/*
    Programa: Ejercicio 5
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
    programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo
    para ello5 oportunidades. En cada intento fallido el programa debe preguntar si el número que
    estás pensando es mayo o menor que el que te acaba de decir
    Fecha: JUNIO - 23
 */
public class AdivinoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oportunidad = 5, cercano, adivino;
        int numeroAzar = (int) ((Math.random() * 100));
        String acertado = "si",  correcto;


        System.out.println("Piensa un número del 0 al 100");
       do{
           System.out.println("¿Estás pensando en el " + numeroAzar + " ?");
            correcto = sc.next();

           if (acertado.equals(correcto)) {
               System.out.println("He adivinado !!");
               break;
           }
           System.out.println("¿El número es mayor (1), menor(2) ?");
           cercano = sc.nextInt();
            if ((cercano == 1) && (oportunidad > 0)){
                numeroAzar +=1;
            }
            if ((cercano == 2) && (oportunidad > 0)){
                numeroAzar -=1;
            }


        oportunidad--;
       }while (oportunidad > 0);
    }
}
