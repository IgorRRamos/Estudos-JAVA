package org.example;

import org.example.users.Player;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Igor", 28, "Gunnter");

        System.out.println(p1.toString());

        p1.escolherClasse("mago");
        p1.subirNv();
        p1.subirNv();
        p1.subirNv();
        p1.subirNv();

        p1.escolherArma(1);

        System.out.println(p1.toString());


    }
}