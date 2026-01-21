package org.example;

public class Sincronizar  implements Runnable{
    private Dados dados;

    public Sincronizar(Dados dados){
        super();
        this.dados = dados;
    }

    @Override
    public void run() {
        dados.sync();
    }
}
