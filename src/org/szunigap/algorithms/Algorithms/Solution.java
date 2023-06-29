package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("================================");
        if( (N >= 2) && (N <= 20)) {
            for (int i = 1; i < 11; i++){
                System.out.println(N + " X " + i + " = " + N * i);
            }
        }
        System.out.println("================================");

    }
}
