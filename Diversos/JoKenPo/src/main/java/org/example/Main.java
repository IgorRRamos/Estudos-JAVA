package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void jogada(String p1, String p2){
        
        if(p1.equals(p2)){
            System.out.println("Empate");
        }else if(p1.equals("papel") && p2.equals("pedra") || p1.equals("pedra") && p2.equals("tesoura") || p1.equals("tesoura") && p2.equals("papel")){
            System.out.println("Player wins!!");
        }else{
            System.out.println("Vitoria da maquina!");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        String player, cpu;

        do{

            System.out.println(" ");
            System.out.println("*****Pedra Papel Tesoura****");
            System.out.println("-> Pedra");
            System.out.println("-> Papel");
            System.out.println("-> Tesoura");
            System.out.println(" ");
            System.out.print("Escolha: ");

            player = teclado.next();


            int escolha = aleatorio.nextInt(2);
            if(escolha == 0){
                cpu = "papel";
            }else if(escolha == 1){
                cpu = "pedra";
            }else{
                cpu = "tesoura";
            }

            jogada(player, cpu);

            try{
               Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }while(true);


    }
}