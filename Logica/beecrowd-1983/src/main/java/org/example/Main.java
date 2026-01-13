package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        int N = teclado.nextInt();

        int[] alunos = new int[N];

        int contador = 0;
        while (contador < N) {

            alunos[contador] = teclado.nextInt();
            notas.add(teclado.nextDouble());


            contador++;
        }

        double maior = Collections.max(notas);

        int aluno=0;
        for (int i = 0; i < N; i++) {
            if (maior == notas.get(i)) {
                aluno = alunos[i];
            }
        }

        if (maior < 8) {
            System.out.println("Minimum note not reached\n");
        } else {
            System.out.println(aluno);
        }


    }
}