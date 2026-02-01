package org.example;

import org.example.controllers.Brasileirao;

public class Main {
    public static void main(String[] args) {
        Brasileirao camp = new Brasileirao();

        camp.adicionarTime("Cruzeiro", 1);
        camp.adicionarTime("Cruzeiro", 2);
        camp.adicionarTime("Cruzeiro", 3);
        camp.adicionarTime("Cruzeiro", 4);



        camp.deletarTime(3);
        camp.listarTimes();
        camp.buscaTime(3);
    }
}