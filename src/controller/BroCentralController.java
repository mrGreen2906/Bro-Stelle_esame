package controller;

import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import model.Bro.BroInt;
import model.exceptions.LivelloMaxException;
import view.BroCentralView;
import view.MainView;

public class BroCentralController {

    private BroCentralView v;
    private BroInt m ;

    public BroCentralController(BroInt b){
        this.m=b;
        this.v=new BroCentralView(m.getInfo(), m.getInfoVitaVelocita(), m.getInfoAttacco(), m.getAttacco().pixelTraiettoria(), m.getColor(),this);
    }

    public BroCentralView getV() {
        return v;
    }

    public Color getColor(){
        return this.m.getColor();
    }

    public void attacco(){
        MainView.getInstance().getNemico().applicDanni(m.getAttacco().getAttacco());

    }

    public void incrementLvl(){

        try {
            this.m.aumentaLivello();

        } catch (LivelloMaxException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Livello massimo raggiunto");
            a.showAndWait();
        }
        this.v.updateInfo(m.getInfo(), m.getInfoVitaVelocita(), m.getInfoAttacco());

    }

}
