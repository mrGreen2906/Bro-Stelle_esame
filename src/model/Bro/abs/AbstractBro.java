package model.Bro.abs;

import javafx.scene.paint.Color;
import model.Attacco.AbstractAttacco;
import model.Attacco.AttaccoInt;
import model.Bro.VelocitaEnum;
import model.exceptions.LivelloMaxException;

public abstract class AbstractBro {
    private static final int MAX_LIVELLO = 11;
    private static final int MIN_LIVELLO = 1;
    private String nome;
    private int livello;
    private AttaccoInt attacco;
    private int vita;
    private VelocitaEnum vel;


    protected AbstractBro(String n, int l, AttaccoInt a, VelocitaEnum v) {
        this.nome = n;
        this.livello = l;
        this.attacco = a;
        this.vel = v;
    }

    public void aumentaLivello() throws LivelloMaxException {

        if (this.livello == 11)
            throw new LivelloMaxException();

        this.livello += 1;
        aumentaVita();
        this.attacco.aumentaAttacco();


    }

    protected abstract void aumentaVita();

    public String getNome() {
        return nome;
    }


    public int getLivello() {
        return livello;
    }


    public AttaccoInt getAttacco() {
        return attacco;
    }

    public int getVita() {
        return this.vita;
    }

    public VelocitaEnum getVel() {
        return vel;
    }

}
