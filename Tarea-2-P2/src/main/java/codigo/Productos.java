package codigo;

abstract public class Productos {
    private String Nombre;
    private Precios precio;
    private String Sabor;

    public Productos(String nombre, Precios precio, String sabor) {
        Nombre = nombre;
        this.precio = precio;
        Sabor = sabor;
    }

    public String getNombre() {
        return Nombre;
    }

    public Precios getPrecio() {
        return precio;
    }
    public abstract String getSabor();
}
