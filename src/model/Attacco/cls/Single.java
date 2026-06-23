package model.Attacco.cls;

import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.abs.AbstractAttacco;
import model.Attacco.enums.AtkTraiettoriaEnum;

public class Single extends AbstractAttacco {
    public Single(String n, int a) {
        super(n, a);
    }

    @Override
    public AtkPortataEnum getPortata() {
        return AtkPortataEnum.MOLTO_LUNGA;
    }

    @Override
    public AtkTraiettoriaEnum getTraiettoria() {
        return AtkTraiettoriaEnum.TERRENO;
    }

    @Override
    public int pixelTraiettoria() {
        return 150;
    }

}
