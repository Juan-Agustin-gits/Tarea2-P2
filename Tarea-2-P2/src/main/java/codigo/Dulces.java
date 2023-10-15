package codigo;

abstract public class Dulces {
    private int serie;

    public Dulces(int serie){
        this.serie = serie;
    }
    //get and Set

    public int getSerie() {
        return serie;
    }
    //Metodos de las clases
    public abstract String comer();
}
