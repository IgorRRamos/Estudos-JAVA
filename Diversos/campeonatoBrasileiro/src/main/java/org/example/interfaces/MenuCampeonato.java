package org.example.interfaces;

import org.example.entitys.Times;

import java.util.List;

public interface MenuCampeonato {

    public abstract void jogarRodada();
    public abstract void jogarTemporada();
    public abstract void mostrarCampeao();
    public abstract void listarTimes();
    public abstract void buscaTime(int id);
    public abstract void adicionarTime(String nome, int id);
    public abstract void deletarTime(int id);



}
