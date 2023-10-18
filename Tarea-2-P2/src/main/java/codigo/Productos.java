package codigo;

abstract public class Productos {
    private String sabor;
    private int serie;
    public Productos(int serie) {
        this.serie=serie;
    }
    public abstract String getSabor();
}
