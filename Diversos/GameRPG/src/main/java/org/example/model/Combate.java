package org.example.model;

public abstract class Combate {
    private int vida;
    private int nv;

    public Combate(int vida, int nv){
        this.vida = vida;
        this.nv = nv;
    }

    public boolean vivo(){
        return vida > 0;
    }

    public void receberDano(int dano){
        vida -= dano;
        if(vida < 0){
            vida = 0;
        }
    }

    public abstract int atacar();

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNv() {
        return nv;
    }

    public void setNv(int nv) {
        this.nv = nv;
    }
}
