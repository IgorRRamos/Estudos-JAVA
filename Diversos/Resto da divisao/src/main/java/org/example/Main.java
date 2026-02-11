package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resto;


        System.out.print("Digite 1 numero: ");
        num1 = teclado.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = teclado.nextInt();

        resto = num1 % num2;

        System.out.println(resto);

    }
}
