package org.example;

public class PrintHelloTask implements Runnable{
    private String nome;

    public PrintHelloTask(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        System.out.println("Oi, " + nome + "!");
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
