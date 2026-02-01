package org.example.controllers;

import org.example.entitys.Times;
import org.example.interfaces.MenuCampeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Brasileirao implements MenuCampeonato {
    private int totPartidas;
    private String campeao;
    List<Objects> tabela = new ArrayList<>();
    List<Times> times = new ArrayList<>();

    public Brasileirao() {
        this.times = new ArrayList<>(times);
    }

    @Override
    public void jogarRodada() {

    }

    @Override
    public void jogarTemporada() {

    }

    @Override
    public void mostrarCampeao() {

    }

    @Override
    public void listarTimes() {
        for(Times t : times){
            System.out.println(t.getNome());
        }
    }

    @Override
    public void buscaTime(int id) {
        for(Times t : times){
            if(id == t.getId()){
                System.out.println(t.toString());
            }
        }
    }

    @Override
    public void adicionarTime(String nome, int id) {
        times.add(new Times(nome, id));
    }

    @Override
    public void deletarTime(int id) {
        for(int i=0;i<times.size();i++){
            if(id == times.get(i).getId()){
                times.remove(i);
            }
        }

    }
}
