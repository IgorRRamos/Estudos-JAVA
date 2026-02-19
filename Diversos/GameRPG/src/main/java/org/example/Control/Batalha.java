package org.example.Control;

import org.example.interfaces.BatlleInterface;
import org.example.mobs.Monstros;
import org.example.users.Player;

import java.util.HashMap;
import java.util.Map;

public class Batalha implements BatlleInterface {
    private Map<Integer, Monstros> monstros = new HashMap<>();
    private Player player;

    public Batalha(Player player){
        this.player = player;
    }
    
    @Override
    public void lutar(int id){
        int danoMonstro = monstros.get(id).atacar();
        int danoPlayer = player.atacar();

        while(player.vivo() || monstros.get(id).vivo()){
            player.receberDano(danoMonstro);
            monstros.get(id).receberDano(danoPlayer);

            if(player.vivo() && !monstros.get(id).vivo()){
                player.subirNv();
                System.out.println("-" + player.getNickName() + " Matou " + monstros.get(id).getNome());
                break;
            }

            if(!player.vivo() && monstros.get(id).vivo()){
                System.out.println("-" + monstros.get(id).getNome() + " Matou " + player.getNickName());
                break;
            }
        }
    }

    @Override
    public void adicionarMonstro(String nome){
        Monstros monstro = new Monstros(nome);
        monstros.put(monstro.getId(), monstro);
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map<Integer, Monstros> getMonstros() {
        return monstros;
    }

    public void setMonstros(Map<Integer, Monstros> monstros) {
        this.monstros = monstros;
    }
}
