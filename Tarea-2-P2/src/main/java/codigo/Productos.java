package codigo;

abstract public class Productos {
    private String Nombre;
    private Precios precio;
    private String sabor;

    public Productos(String nombre, Precios precio) {
        Nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public Precios getPrecio() {
        return precio;
    }
    public abstract String getSabor();
}
