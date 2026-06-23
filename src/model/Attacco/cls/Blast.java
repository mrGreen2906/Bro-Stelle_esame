package model.Attacco.cls;

import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.abs.AbstractAoEAttacco;
import model.Attacco.enums.AtkTraiettoriaEnum;

public class Blast extends AbstractAoEAttacco {

    public Blast(String n, int a) {
        super(n, a);
    }

    @Override
    public AtkTraiettoriaEnum getTraiettoria() {
        return AtkTraiettoriaEnum.TERRENO;
    }
}
