package org.example;

public class Leitor implements Runnable{
    private Dados dados;

    public Leitor(Dados dados){
        super();
        this.dados = dados;
    }

    @Override
    public void run(){
        dados.read();
    }

}
