package model.Attacco;

import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.enums.AtkTraiettoriaEnum;

public interface AttaccoInt {
    void setAttacco(int liv);
    void incrementAttacco();
    String getNome();
    int getAttacco();
    AtkPortataEnum getPortata();
    AtkTraiettoriaEnum getTraiettoria();
    int pixelTraiettoria();
}
