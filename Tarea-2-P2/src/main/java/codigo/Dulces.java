package codigo;

abstract public class Dulces extends Productos{
    public Dulces(String nombre, Precios precio) {
        super(nombre, precio);
    }
    public abstract String getSabor();
}
