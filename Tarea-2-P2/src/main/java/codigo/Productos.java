package codigo;

abstract public class Productos {
    private String sabor;
    private int serie;
    private int valor;
    public Productos(int serie, int valor) {
        this.serie=serie;
        this.valor=valor;
    }
    public abstract String getSabor();
}
