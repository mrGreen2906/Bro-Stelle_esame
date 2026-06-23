package model;

public class Nemico {
    private static Nemico n;
    private int vita;
    private Nemico(){
        vita =10000;
    }
    public static Nemico getInstance(){
        if(n==null)
            n=new Nemico();
        return n;
    }

    public void applyDamage(int d){
        this.vita-=d;
    }
    public boolean isDead(){
        return this.vita==0;
    }
    public void risorgi(){
        this.vita=10000;
    }

    public String getInfo(){
        return "HP: "+this.vita;
    }
}
