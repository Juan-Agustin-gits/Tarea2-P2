package codigo;

public class Snikers extends Dulces{

    public Snikers(int n) {
        super(n);
    }
    private Precios precio500;
    public int getPrecio() {
        return Precios.Precio500.getValor();
    }

    @Override
    public String getSabor() {
        return "Snikers";
    }

}
