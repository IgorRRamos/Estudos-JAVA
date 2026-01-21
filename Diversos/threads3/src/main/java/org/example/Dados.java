package org.example;

public class Dados {
    private boolean outSync;
    private int valor;

    public boolean isSync() {
        return outSync;
    }
    public void setSync(boolean sync) {
        this.outSync = sync;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public synchronized void sync(){
        System.out.println("Sincronizando dados...");

        try{
            if(!outSync)
                this.wait();

            outSync = false;
            Thread.sleep(5000);
            System.out.println("Sincronizado!");
            this.notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void read(){
        System.out.println("Lendo dados...");

        try{
            if(outSync)
                this.wait();

            Thread.sleep(2000);
            System.out.println("Dados: " + valor);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
