package codigo;

public class Sprite extends Bebida{
    public Sprite(String nombre, Precios precio) {
        super(nombre, precio);
    }

    @Override
    public String getSabor() {
        return "Sprite";
    }
}
