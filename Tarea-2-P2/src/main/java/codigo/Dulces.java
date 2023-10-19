package codigo;

/**
 * Clase Dulces extends de Productos
 */
abstract public class Dulces extends Productos{
    public Dulces(int n) {
        super(n);
    }

    /**
     * @return Precio del Dulce ( Metodo abstracto )
     */
    public abstract int getPrecio();

    /**
     * @return String que representa a el Sabor de la Bebida ( Metodo abstracto )
     */
    public abstract String getSabor();
}
