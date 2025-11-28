package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa user1 = new Pessoa("Igor", "Ramos");
        Pessoa user2 = new Pessoa("Igor", "Ramos");

        System.out.println(user1);
        System.out.println(user1.hashCode());
        System.out.println(user2);
        System.out.println(user2.hashCode());

    }
}