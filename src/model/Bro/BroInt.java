package model.Bro;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;

public interface BroInt {
    String getNome();
    int getLivello();
    AttaccoInt getAttacco();
    void aumentaLivello();
    Color getColor();
    VelocitaEnum getVel();
}
