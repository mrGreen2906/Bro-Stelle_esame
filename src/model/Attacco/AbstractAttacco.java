package model.Attacco;

import java.text.AttributedCharacterIterator;

public abstract class AbstractAttacco implements AttaccoInt {
    int attacco;
    protected AbstractAttacco(){

    }

    public void aumentaAttacco(){
        incrementAttacco();
    }

    protected abstract void incrementAttacco();
}
