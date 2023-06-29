/* Programa: Ejercicio 3 - Salida de datos
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa que muestre por pantalla 10 palabras en inglés junto
                 a su correspondiente traducción al castellano. Las palabras deben estar
                 distribuidas en dos columnas y alineadas a la izquierda. Pista: Se puede
                 insertar un tabulador mediante \t.
 *  Fecha: 06/05/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;
public class Translation {
    public static void main(String[] args) {
        String word1, word2, word3, word4, word5, word6, word7, word8, word9, word10;
        String palabra1, palabra2, palabra3, palabra4, palabra5, palabra6, palabra7, palabra8, palabra9, palabra10;

        word1 = "Back up"; palabra1 = "Soporte";
        System.out.println("\t" + word1 + " - " + palabra1);

        word2 = "Break down"; palabra2 = "Descomponerse";
        System.out.println("\t" + word2 + " - " + palabra2);

        word3 = "Call _ off"; palabra3 = "Cancelar";
        System.out.println("\t" + word3 + " - " + palabra3);

        word4 = "Call around"; palabra4 = "Contactar a varias personas";
        System.out.println("\t" + word4 + " - " + palabra4);

        word5 = "Clean up"; palabra5 = "Extremadamente exitoso";
        System.out.println("\t" + word5 + " - " + palabra5);

        word6 = "Come around"; palabra6 = "Cambiar mi opinión";
        System.out.println("\t" + word6 + " - " + palabra6);

        word7 = "Go against"; palabra7 = "Contradecir";
        System.out.println("\t" + word7 + " - " + palabra7);

        word8 = "Look after"; palabra8 = "Cuidar a alguien o algo";
        System.out.println("\t" + word8 + " - " + palabra8);

        word9 = "See to"; palabra9 = "Asegurarse de que algo esta hecho";
        System.out.println("\t" + word9 + " - " + palabra9);

        word10 = "Show off"; palabra10 = "Exhibir deliberadamente las habilidades para impresionar";
        System.out.println("\t" + word10 + " - " + palabra10);
    }
}
