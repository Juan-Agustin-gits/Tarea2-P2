package codigo;

abstract class Bebida extends Producto {
    private int serie;
    public Bebida(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String sabor();
}
