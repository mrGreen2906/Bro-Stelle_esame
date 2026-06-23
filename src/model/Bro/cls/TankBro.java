package model.Bro.cls;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.Bro.VelocitaEnum;
import model.Bro.abs.AbstractBro;

public class TankBro extends AbstractBro {
    private static final int MAX_VITA=10500;
    private static final int MIN_VITA=8000;
    private VelocitaEnum vel;
    public TankBro(String n, int l, AttaccoInt a) {
        super(n, l, a);
        this.vel=VelocitaEnum.LENTA;
    }

    @Override
    public void aumentaVita() {

        if(super.get)
    }

    @Override
    public Color getColor() {
        return Color.MAGENTA;
    }
}
