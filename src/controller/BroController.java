package controller;

import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import model.Bro.BroInt;
import model.exceptions.LivelloMaxException;
import view.BroView;

public class BroController {

    private BroView v;
    private BroInt m ;

    public BroController(BroInt b){
        this.m=b;
        this.v=new BroView(m.getInfo(), m.getInfoVitaVelocita(), m.getInfoAttacco(), this);
    }

    public BroView getV() {
        return v;
    }

    public void setV(BroView v) {
        this.v = v;
    }

    public BroInt getM() {
        return m;
    }

    public void setM(BroInt m) {
        this.m = m;
    }

    public Color getColor(){
        return this.m.getColor();
    }

    public void attacco(){

    }
    public void incrementLvl(){

        try {
            this.m.aumentaLivello();
        } catch (LivelloMaxException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Livello massimo raggiunto");
            a.showAndWait();
        }
    }
}
