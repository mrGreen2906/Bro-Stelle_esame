package model.Bro.cls;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.Bro.abs.AbstractLongRangeBro;

public class SniperBro extends AbstractLongRangeBro {
    private static final int MAX_VITA=5500;
    private static final int MIN_VITA=3000;
    public SniperBro(String n, int l, AttaccoInt a) {
        super(n, l, a);
    }

    @Override
    public Color getColor() {
        return Color.OLIVE;
    }

    @Override
    public int aumentaVita() {
        if(!(super.getVita() >getVitaMax()))
            return getVitaMin()/10;
        return 0;
    }

    @Override
    public int getVitaMax() {
        return MAX_VITA;
    }

    @Override
    public int getVitaMin() {
        return MIN_VITA;
    }
}
