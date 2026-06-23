package controller.comparators;

import model.Nemico;
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
}
