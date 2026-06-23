    package controller.comparators;

    import controller.BroController;
    import model.Bro.Comparators.ComparatorByNome;

    import java.util.Comparator;

    public class ComparatorByNomeController implements Comparator<BroController> {
        @Override
        public int compare(BroController o1, BroController o2) {
            return new ComparatorByNome().compare(o1.getM(), o2.getM());
        }
    }
