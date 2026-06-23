package model.Attacco.cls;

import model.Attacco.abs.AbstractAoEAttacco;
import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.enums.AtkTraiettoriaEnum;

public class Lobber extends AbstractAoEAttacco {
    public Lobber(String n, int a) {
        super(n, a);
    }

    @Override
    public AtkTraiettoriaEnum getTraiettoria() {
        return AtkTraiettoriaEnum.AEREA;
    }
}
