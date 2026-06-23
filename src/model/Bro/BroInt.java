package model.Bro;

import javafx.scene.paint.Color;
import model.Attacco.AttaccoInt;
import model.exceptions.LivelloMaxException;

public interface BroInt {
    String getNome();
    int getLivello();
    AttaccoInt getAttacco();
    void aumentaLivello() throws LivelloMaxException;
    Color getColor();
    VelocitaEnum getVel();
    int getVita();
    int getVitaMax();
    int getVitaMin();
    int getLivMax();
    int getLivMin();
    String getInfo();
    String getInfoVitaVelocita();
    String getInfoAttacco();
}
