package controller;

import javafx.scene.paint.Color;
import model.Bro.BroInt;
import view.BroView;
import view.MainView;

public class BroController {

    private BroView v;
    private BroInt m ;

    public BroController(BroInt b){
        this.m=b;
        this.v=new BroView(m.getNome(), m.getColor(),this);
    }

    public BroView getV() {
        return v;
    }


    public BroInt getM() {
        return m;
    }


    public Color getColor(){
        return this.m.getColor();
    }

    public void attacco(){

    }


    public void selezionaBro(){
        BroCentralController br = new BroCentralController(this.getM());
        MainView.getInstance().setBroCentrale(br);
    }
}
