package codigo;

public class Snikers extends Dulces{
    public Snikers(String nombre, Precios precio) {
        super(nombre, precio);
    }

    @Override
    public String getSabor() {
        return "Snikers";
    }
}
