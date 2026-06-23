package model.Attacco.abs;

import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.enums.AtkTraiettoriaEnum;

public abstract class AbstractAoEAttacco extends  AbstractAttacco{
    protected AbstractAoEAttacco(String n, int a) {
        super(n, a);
    }

    @Override
    public AtkPortataEnum getPortata() {
        return AtkPortataEnum.MEDIA;
    }

    public int pixelTraiettoria(){ return 100;}
}
