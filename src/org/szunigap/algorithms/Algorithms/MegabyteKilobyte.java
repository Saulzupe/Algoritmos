package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class MegabyteKilobyte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kB, mB = 0;
        System.out.println("Ingrese los Megabyte: ");
        mB = sc.nextInt();

        kB = mB * 1024;

        System.out.println(mB + " : son equivalenteas a " + kB + "kB");

        System.out.println("Ingrese lo kB");
        kB = sc.nextInt();
        double mB1 = (double) kB/1000;
        System.out.println(kB + " son equivalentes a " + mB1 + "MB");
    }
}
