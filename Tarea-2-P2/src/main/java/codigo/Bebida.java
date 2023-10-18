package codigo;

public abstract class Bebida extends Productos{
    public Bebida(int n) {
        super(n);
    }
    public abstract String getSabor();
}
