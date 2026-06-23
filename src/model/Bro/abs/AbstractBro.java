package model.Bro.abs;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.Bro.BroInt;
import model.Bro.VelocitaEnum;
import model.exceptions.LivelloMaxException;

public abstract class AbstractBro implements BroInt {
    private static final int MAX_LIVELLO = 11;
    private static final int MIN_LIVELLO = 1;
    private String nome;
    private int livello;
    private AttaccoInt attacco;
    private int vita;
    private VelocitaEnum vel;


    protected AbstractBro(String n, int l, AttaccoInt a, VelocitaEnum v) {
        this.nome = n;
        if(l>getLivMax())
            this.livello=MAX_LIVELLO;
        else if(l<getLivMin())
            this.livello=MIN_LIVELLO;
        else
            this.livello = l;

        this.attacco = a;
        this.vel = v;
        this.vita=getVitaMin();
        setVita(this.livello);
        this.attacco.setAttacco(this.getLivello());
    }

    public void aumentaLivello() throws LivelloMaxException {

        this.attacco.incrementtAttacco();
        if (this.livello == 11)
            throw new LivelloMaxException();

        this.livello += 1;
        this.vita += aumentaVita();




    }
    private void setVita(int liv){
        while(liv!=1){
            this.vita+=aumentaVita();
            liv--;
        }
    }

    protected abstract int aumentaVita();

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

    public abstract int getVitaMax();
    public abstract int getVitaMin();
    public int getLivMax(){
        return MAX_LIVELLO;
    }
    public int getLivMin(){
        return MIN_LIVELLO;
    }


    public abstract Color getColor();
    public String getInfo(){ return this.nome+" "+this.livello; }
    public String getInfoVitaVelocita() {return  this.vita+" "+this.vel.toString(); }
    public String getInfoAttacco(){ return this.attacco.getNome()+ " "+ this.attacco.getAttacco(); }
}
