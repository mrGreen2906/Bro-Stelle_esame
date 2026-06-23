package controller;

import controller.comparators.ComparatorByNomeController;
import controller.comparators.ComparatorByVitaController;
import model.Bro.BroInt;
import model.Bro.Comparators.ComparatorByNome;
import model.Bro.Comparators.ComparatorByVita;
import model.Vetrina;
import view.MainView;
import view.VetrinaView;

import java.util.ArrayList;
import java.util.List;

public class VetrinaController {
    private Vetrina m;
    private VetrinaView v;
    private List<BroController> bro;

    public VetrinaController(){
        m= Vetrina.getInstance();
        bro = new ArrayList<>();
        for(BroInt b : this.m){
            BroController br = new BroController(b);
            this.bro.add(br);
        }

        drawView();

    }


    private void drawView(){
        this.v = new VetrinaView();
        this.v.setSpacing(10);
        for(BroController b: this.bro)
            this.v.getChildren().add(b.getV());

    }

    public void ordinaPerNome(){
        this.bro.sort(new ComparatorByNomeController());
        this.m.sort(new ComparatorByNome());
        drawView();
        MainView.getInstance().setTop(this.v);

    }

    public void ordinaPerVita(){
        this.bro.sort(new ComparatorByVitaController());
        this.m.sort(new ComparatorByVita());
        drawView();
        MainView.getInstance().setTop(this.v);

    }

    public VetrinaView getV(){
        return this.v;
    }
}
