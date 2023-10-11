package org.example;

abstract class Bebida{
    private int serie;
    public Bebida(int a){
        this.serie = a;
    }
    public abstract String beber();
    public int getSerie(){
        return this.serie;
    }
}
class CocaCola extends Bebida{
    private Bebida b;
    public CocaCola(int c){
        super(c);
    }
    public String beber(){
        return "cocacola";
    }
}
class Sprite extends Bebida{
    public Sprite(int c){
        super(c);
    }
    public String beber(){
        return "sprite";
    }
}
