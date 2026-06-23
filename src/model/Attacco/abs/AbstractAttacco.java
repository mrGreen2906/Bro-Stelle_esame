package model.Attacco.abs;

import model.Attacco.AttaccoInt;
import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.enums.AtkTraiettoriaEnum;
import model.Bro.BroInt;

public abstract class AbstractAttacco implements AttaccoInt {
    private String nome;
    private int attacco;


    protected AbstractAttacco(String n, int a) {
        this.nome = n;
        this.attacco = a;

    }

    public void setAttacco(int liv) {
        int attacco = this.attacco;
        for (int i = 1; i <= liv; i++)
            attacco += this.attacco /10;


    }

    public void incrementAttacco(){
        attacco += this.attacco /10;
    }

    public String getNome() {
        return nome;
    }


    public int getAttacco() {
        return attacco;
    }

    public abstract AtkPortataEnum getPortata();
    public abstract AtkTraiettoriaEnum getTraiettoria();




}
