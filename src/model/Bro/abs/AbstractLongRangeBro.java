package model.Bro.abs;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.Bro.VelocitaEnum;

public abstract class AbstractLongRangeBro extends AbstractBro{

    protected AbstractLongRangeBro(String n, int l, AttaccoInt a) {
        super(n, l, a, VelocitaEnum.NORMALE);
    }

    public abstract Color getColor();
}
