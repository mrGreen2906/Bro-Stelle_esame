package model.Bro.Comparators;

import model.Bro.BroInt;

import java.util.Comparator;

public class ComparatorByNome implements Comparator<BroInt> {
    @Override
    public int compare(BroInt o1, BroInt o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
