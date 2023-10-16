package codigo;

public class Super8 extends Dulces{
    public Super8(String nombre, Precios precio) {
        super(nombre, precio);
    }

    @Override
    public String getSabor() {
        return "Super8";
    }
}
