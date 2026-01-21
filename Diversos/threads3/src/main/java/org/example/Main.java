package org.example;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();

        dados.setSync(true);
        Thread leitor = new Thread(new Leitor(dados));
        Thread sincronizador = new Thread(new Sincronizar(dados));

        leitor.start();

        sincronizador.start();  


    }
}