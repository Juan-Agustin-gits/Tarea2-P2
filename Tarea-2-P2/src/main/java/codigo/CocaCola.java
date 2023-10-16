package codigo;

public class CocaCola extends Bebida{
    public CocaCola(String nombre, Precios precio) {
        super(nombre, precio);
    }

    @Override
    public String getSabor() {
        return "CocaCola";
    }
}
