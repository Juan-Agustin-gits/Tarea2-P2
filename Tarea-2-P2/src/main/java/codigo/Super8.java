package codigo;

public class Super8 extends Dulces{

    public Super8(int n) {
        super(n);
    }
    private Precios precio500;
    public int getPrecio() {
        return Precios.Precio500.getValor();
    }

    @Override
    public String getSabor() {
        return "Super8";
    }

}
