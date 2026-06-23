package model.Bro.cls;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.Bro.abs.AbstractLongRangeBro;

public class SniperBro extends AbstractLongRangeBro {
    public SniperBro(String n, int l, AttaccoInt a) {
        super(n, l, a);
    }

    @Override
    public Color getColor() {
        return Color.OLIVE;
    }

    @Override
    protected void aumentaVita() {

    }
}
