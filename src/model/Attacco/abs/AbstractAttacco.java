package model.Attacco.abs;

import model.Attacco.AttaccoInt;

public abstract class AbstractAttacco implements AttaccoInt {
    private String nome;
    private int attacco;


    protected AbstractAttacco(String n, int a) {
        this.nome = n;
        this.attacco = a;

    }

    public void setAttacco(int liv) {

        for (int i = 1; i <= liv; i++)
            this.attacco += this.attacco /10;


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

    public abstract int pixelTraiettoria();




}
