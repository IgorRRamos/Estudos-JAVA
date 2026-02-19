package org.example.mobs;

import org.example.model.Combate;

public class Monstros extends Combate {
    public static int contador = 1;
    private int id;
    public String nome;

    public Monstros(String nome){
        super(100, 2);
        this.nome = nome;
        id = contador++;
    }

    @Override
    public int atacar() {
        return 10 * getNv();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
