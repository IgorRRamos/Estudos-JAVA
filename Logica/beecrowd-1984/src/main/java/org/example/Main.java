package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador;

        long x = teclado.nextLong();

        String s = String.valueOf(x);
        int[] vetor = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            vetor[i] = Character.getNumericValue(s.charAt(i));
        }

        contador = s.length();

        for(int i=0; i < s.length(); i++){
            System.out.print(vetor[contador-1]);
            contador--;
        }

        System.out.println();


    }
}