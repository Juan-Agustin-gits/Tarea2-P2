package codigo;

abstract public class Productos {
    private String sabor;
    private int serie;
    private Precios precios;
    public Productos(int serie) {
        this.serie=serie;
    }
    public abstract String getSabor();
}
