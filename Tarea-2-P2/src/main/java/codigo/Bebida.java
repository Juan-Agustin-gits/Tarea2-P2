package codigo;

abstract class Bebida extends Productos{
    public Bebida(int n) {
        super(n);
    }

    @Override
    public abstract String getSabor();
}
