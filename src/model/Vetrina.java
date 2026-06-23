package model;

import model.Attacco.cls.Blast;
import model.Attacco.cls.Lobber;
import model.Attacco.cls.Single;
import model.Bro.BroInt;
import model.Bro.cls.ArtilleryBro;
import model.Bro.cls.SniperBro;
import model.Bro.cls.TankBro;

import java.util.ArrayList;

public class Vetrina extends ArrayList<BroInt> {
    private static Vetrina v;
    private Vetrina(){

        TankBro f1 = new TankBro("Franco",2, new Blast("SBAM",1000));
        ArtilleryBro f3 = new ArtilleryBro("Dinamichele", 8, new Lobber("Bomba",2000));
        SniperBro f4 = new SniperBro("Ape",11,new Single("Bzz",2000));
        TankBro f2 = new TankBro("Edoardo",1, new Single("SCIARPA",500));
        SniperBro f5 = new SniperBro("Salice",1,new Lobber("Tentacolo",2000));


        this.add(f1);
        this.add(f2);
        this.add(f3);
        this.add(f4);
        this.add(f5);

    }

    public static Vetrina getInstance(){
        if (v==null)
                v= new Vetrina();
        return v;
    }
}
