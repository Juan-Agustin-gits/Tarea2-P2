package Código;

public class Dulces extends Producto {
    private int serie;
    private String comida;

    public Dulces(int serie){
        this.serie = serie;
    }
    //get and Set
    public int getSerie() {
        return serie;
    }
    //Metodos de las clases
    public String sabor(){
        return "dulce";
    }
}
