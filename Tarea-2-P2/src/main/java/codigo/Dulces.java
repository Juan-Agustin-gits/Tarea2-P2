package codigo;

abstract public class Dulces extends Productos{
    public Dulces(int n, int m) {
        super(n, m);
    }
    public abstract String getSabor();
}
