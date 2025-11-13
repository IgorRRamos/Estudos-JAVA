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
        double totValue = 0.0, downPaymentamount = 0.0, totValueFinancing = 0.0, totValueInterest = 0, valueInstallmentsMonth = 0, interest = 0;
        int choice, installments = 0;

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
            System.out.println("Exit, enter (0)");
            System.out.print("--> ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.println(" ");
                        System.out.println("Enter *1* for - Choice the total value of financing");
                        System.out.println("Enter *2* for - Choice the total down payment amount");
                        System.out.println("Enter *3* for - Choice the total quantites installments");
                        System.out.println("Enter *4* for - Choice the porcent interest");
                        System.out.println("Enter *5* for - Show details of financing");
                        System.out.println("Enter *6* for - Clear all");
                        System.out.println("Enter *7* for - Exit");
                        System.out.println(" ");

                        System.out.print("--> ");
                        choice = keyboard.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter the value of financing");
                                System.out.print("--> ");
                                totValue = keyboard.nextDouble();
                                break;
                            case 2:
                                System.out.println("Enter the total down payment amount");
                                System.out.print("--> ");
                                downPaymentamount = keyboard.nextDouble();
                                break;
                            case 3:
                                System.out.println("Enter the total quantites installments");
                                System.out.print("--> ");
                                installments = keyboard.nextInt();
                                break;
                            case 4:
                                System.out.println("Enter the porcent interest");
                                System.out.print("--> ");
                                int variavelTemporaria = keyboard.nextInt();
                                if (variavelTemporaria == 1) {
                                    interest = 0.01;
                                } else if (variavelTemporaria == 2) {
                                    interest = 0.02;
                                } else if (variavelTemporaria == 3) {
                                    interest = 0.03;
                                } else if (variavelTemporaria == 4) {
                                    interest = 0.04;
                                }
                                break;
                            case 5:
                                System.out.println("Valor total do produto é " + totValue);
                                System.out.println("O valor da entrada " + downPaymentamount);
                                System.out.println("Valor total do financiamento " + totValueFinancing);
                                System.out.println("Quantidade total de parcelas " + installments);
                                System.out.println("Juros por mês " + interest + "%\n");
                                System.out.printf("Valor total a ser pago %.3f \n", totValueInterest);
                                System.out.printf("Valor da parcela mês %.3f \n\n", valueInstallmentsMonth);
                                break;
                            case 6:
                                totValue = 0.0;
                                downPaymentamount = 0.0;
                                totValueFinancing = 0.0;
                                totValueInterest = 0;
                                valueInstallmentsMonth = 0;
                                interest = 0;
                                installments = 0;
                                System.out.println(" ");
                                System.out.println("Cleaning completed successfull");
                                break;
                        }
                        totValueFinancing = totValue - downPaymentamount;

                        valueInstallmentsMonth = totValueFinancing * (interest * Math.pow(1 + interest, installments)) / (Math.pow(1 + interest, installments) - 1);

                        totValueInterest = valueInstallmentsMonth * installments;
                    }
                    while (choice != 7);
                    break;

                default:
                    if (choice != 0 && choice != 1) {
                        System.out.println("Invalid option, try again");
                    } else {
                        break;
                    }
            }
            if (choice == 0) {
                System.out.println("Bye!! times always!!");
            }
        } while (choice != 0);
    }
}