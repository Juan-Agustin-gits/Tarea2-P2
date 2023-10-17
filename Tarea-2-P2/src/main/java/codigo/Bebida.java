package codigo;

abstract class Bebida extends Productos{
    public Bebida(int n, int m) {
        super(n, m);
    }

    @Override
    public abstract String getSabor();
}
