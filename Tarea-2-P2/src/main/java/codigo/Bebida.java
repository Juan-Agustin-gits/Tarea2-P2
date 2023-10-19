package codigo;

/**
 * Clase Bebida, extends de Productos
 */
public abstract class Bebida extends Productos{
    /**
     * @param n es eel sumero de serie de la Bebida
     */
    public Bebida(int n) {
        super(n);
    }

    /**
     * @return Precio de la Bebida ( Metodo abstracto )
     */
    public abstract int getPrecio();

    /**
     * @return String que representa a el Sabor de la Bebida ( Metodo abstracto )
     */
    public abstract String getSabor();
}
