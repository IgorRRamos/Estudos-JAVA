package org.example.Main;

import java.util.Scanner;

/*
 * Valor total do financiamento
 * valor total da entrada
 * valor do juros
 * quantidade total de parcelas
 * */

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double totValue = 0.0, downPaymentamount = 0.0, totValueFinancing = 0.0;
        int choice, interest = 0, installments = 0;

        do {
            System.out.println("**********************************");
            System.out.println("To make the financing your need: ");
            System.out.println("The total value of financing.");
            System.out.println("The total down payment amount.");
            System.out.println("The total quantites installments.");
            System.out.println("The porcent interest.");
            System.out.println("**********************************");
            System.out.println(" ");

            System.out.println("To make simulation of financing, enter (1)");
            System.out.println("Exit, enter (6)");
            System.out.print("--> ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Enter *1* for - Choice the total value of financing");
                    System.out.println("Enter *2* for - Choice the total down payment amount");
                    System.out.println("Enter *3* for - Choice the total quantites installments");
                    System.out.println("Enter *4* for - Choice the porcent interest");
                    System.out.println(" ");

                    System.out.print("--> ");
                    choice = keyboard.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter the value of financing");
                            System.out.print("--> ");
                            totValueFinancing = keyboard.nextDouble();
                            break;
                        case 2:
                            System.out.println("Enter the total down payment amount");
                            System.out.print("--> ");
                            downPaymentamount = keyboard.nextDouble();
                            totValueFinancing = totValueFinancing - downPaymentamount;
                            break;
                        case 3:
                            System.out.println("Enter the total quantites installments");
                            System.out.print("--> ");
                            installments = keyboard.nextInt();
                            break;
                        case 4:
                            System.out.println("Enter the porcent interest");
                            System.out.print("--> ");
                            interest = keyboard.nextInt();
                            break;
                        case 5:
                            System.out.println(totValueFinancing);
                            System.out.println(downPaymentamount);
                            System.out.println(installments);
                            System.out.println(interest);
                            break;
                    }
                    break;

                default:
                    if (choice != 6) {
                        System.out.println("Invalid option, try again");
                    } else {
                        break;
                    }
            }
            if (choice == 6) {
                System.out.println("Bye!! times always!!");
            }
        } while (choice != 6);
    }
}