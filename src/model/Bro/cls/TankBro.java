package model.Bro.cls;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.Bro.VelocitaEnum;
import model.Bro.abs.AbstractBro;

public class TankBro extends AbstractBro {
    private static final int MAX_VITA=10500;
    private static final int MIN_VITA=8000;

    public TankBro(String n, int l, AttaccoInt a) {
        super(n, l, a,VelocitaEnum.LENTA);

    }

    @Override
    public int aumentaVita() {
        if(!(super.getVita() >getVitaMax()))
            return getVitaMin()*10/100;
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

    @Override
    public Color getColor() {
        return Color.MAGENTA;
    }
}
