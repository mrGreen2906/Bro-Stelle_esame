package controller.comparators;

import controller.BroController;
import model.Bro.Comparators.ComparatorByNome;
import model.Bro.Comparators.ComparatorByVita;

import java.util.Comparator;

public class ComparatorByVitaController implements Comparator<BroController> {
    @Override
    public int compare(BroController o1, BroController o2) {
        return new ComparatorByVita().compare(o1.getM(),o2.getM());
    }
}
