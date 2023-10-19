package codigo;

/**
 * Clase abstracta Productos
 */
abstract public class Productos {
    private String sabor;
    private int serie;

    /**
     * @param serie
     */
    public Productos(int serie) {
        this.serie=serie;
    }

    /**
     * @return String que representa el sabor del Producto ( Metodo abstracto )
     */
    public abstract String getSabor();

    /**
     * @return Precio del Producto ( Metodo abstracto )
     */
    public abstract int getPrecio();
}
