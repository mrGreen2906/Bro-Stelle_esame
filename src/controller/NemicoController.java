package controller;

import javafx.scene.control.Alert;
import model.Nemico;
import model.exceptions.NemicoIsDeadException;
import view.NemicoView;

public class NemicoController {
    private Nemico m;
    private NemicoView v;

    public NemicoController(){
        this.m=Nemico.getInstance();
        this.v = new NemicoView(m.getInfo(), this);
    }

    public void refresh(){
        this.m.risorgi();
        this.v.aggiornaHp(this.m.getInfo());
    }

    public void applicDanni(int d){
        try {
            this.m.applyDamage(d);

                this.v.aggiornaHp(this.m.getInfo());
        } catch (NemicoIsDeadException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Il bersaglio è stato eliminato");
            a.showAndWait();
            this.refresh();
        }
    }

    public NemicoView getV() {
        return v;
    }

}
