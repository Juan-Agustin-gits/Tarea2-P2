package codigo;

abstract class Bebida extends Productos{
    public Bebida(int n, int m) {
        super(n, m);
    }
    public abstract String getSabor();
}
