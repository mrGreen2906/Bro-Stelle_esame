package model.Attacco;

import model.Attacco.enums.AtkPortataEnum;
import model.Attacco.enums.AtkTraiettoriaEnum;

public interface AttaccoInt {
    void setAttacco(int liv);
    void incrementtAttacco();
    String getNome();
    int getAttacco();
    AtkPortataEnum getPortata();
    AtkTraiettoriaEnum getTraiettoria();
}
