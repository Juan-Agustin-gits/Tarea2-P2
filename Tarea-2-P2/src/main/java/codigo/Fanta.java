package codigo;

public class Fanta extends Bebida{
    public Fanta(String nombre, Precios precio) {
        super(nombre, precio);
    }

    @Override
    public String getSabor() {
        return "Fanta";
    }
}
