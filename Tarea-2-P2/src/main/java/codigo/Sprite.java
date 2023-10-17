package codigo;

public class Sprite extends Bebida{
    public Sprite(int n) {
        super(n);
    }
    private Precios precio1000;

    public int getPrecio() {
        return Precios.Precio1000.getValor();
    }

    @Override
    public String getSabor() {
        return "Sprite";
    }


}
