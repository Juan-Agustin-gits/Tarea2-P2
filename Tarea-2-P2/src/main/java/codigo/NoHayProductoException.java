package codigo;

/**
 * Excepcion NoHayProducto
 */
public class NoHayProductoException extends Exception{
    /**
     * @param mensaje
     */
    public NoHayProductoException(String mensaje){
        super(mensaje);
    }
}
