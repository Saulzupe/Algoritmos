/*
* Programa: Ejercicio 2.29 Valor de un carácter.
* Programador: Saúl Zúñiga
* Descripción: Escriba una aplicación que muestre los equivalente enteros de algunas letras en mayúsculas
*           en minúsculas , dígitos y símbolos especiales. Muestre los equivalentes enteros de los
*           siguientes caracteres A B C a b c 0 1 2 $ * + / y el carácter en blanco.
* */
package org.szunigap.algorithms.deitel;

public class Ejercicio_29 {
    public static void main(String[] args) {
        System.out.printf("El caracter %c tiene el valor %d%n",'A' ,((int) 'A'));
        System.out.printf("El caracter %c tiene el valor %d%n",'B' , ((int) 'B'));
        System.out.printf("El caracter %c tiene el valor %d%n",'C' , ((int) 'C'));
        System.out.printf("El caracter %c tiene el valor %d%n",'a' , ((int) 'a'));
        System.out.printf("El caracter %c tiene el valor %d%n",'b' , ((int) 'b'));
        System.out.printf("El caracter %c tiene el valor %d%n",'c' , ((int) 'c'));
        System.out.printf("El caracter %c tiene el valor %d%n",'0' , ((int) '0'));
        System.out.printf("El caracter %c tiene el valor %d%n",'1' , ((int) '1'));
        System.out.printf("El caracter %c tiene el valor %d%n",'2' , ((int) '2'));
        System.out.printf("El caracter %c tiene el valor %d%n",'$' , ((int) '$'));
        System.out.printf("El caracter %c tiene el valor %d%n",'*' , ((int) '*'));
        System.out.printf("El caracter %c tiene el valor %d%n",'+' , ((int) '+'));
        System.out.printf("El caracter %c tiene el valor %d%n",'/' , ((int) '/'));
        System.out.printf("El caracter %c tiene el valor %d%n",' ' , ((int) ' '));
    }
}
