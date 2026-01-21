package org.example;

public class Main {
    public static void main(String[] args) {
        PrintHelloTask task = new PrintHelloTask();
        Thread contador1 = new Thread(task);
        Thread contador2 = new Thread(task);
        Thread contador3 = new Thread(task);
        Thread contador4 = new Thread(task);

        contador1.start();
        contador2.start();
        contador3.start();
        contador4.start();


    }
}