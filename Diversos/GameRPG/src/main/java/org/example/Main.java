package org.example;

import org.example.Control.Batalha;
import org.example.users.Player;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Gunnter");
        Batalha b1 = new Batalha(p1);

        p1.escolherClasse("cavaleiro");
        p1.escolherArma(1);

        b1.adicionarMonstro("Dragão");
        b1.adicionarMonstro("Caveira Demoniaca");

        b1.lutar(2);

        System.out.println(p1.toString());



    }
}