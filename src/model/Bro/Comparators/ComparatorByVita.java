package model.Bro.Comparators;

import model.Bro.BroInt;

import java.util.Comparator;

public class ComparatorByVita implements Comparator<BroInt> {
    @Override
    public int compare(BroInt o1, BroInt o2) {
        return Integer.compare(o1.getVita(),o2.getVita());
    }

}