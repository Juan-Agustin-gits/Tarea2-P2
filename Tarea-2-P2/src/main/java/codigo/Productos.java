package codigo;

/**
 * Clase abstracta que permite definir lo que se va a comprar a futuro
 */
abstract public class Productos {
    private String sabor;
    private int serie;

    /**
     *
     * @param serie Definira un numero para cada producto de un Deposito
     *              del mismo tipo del producton
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
