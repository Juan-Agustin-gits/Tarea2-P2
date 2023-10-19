package codigo;

/**
 * Excepction para cuando no haya productos del tipo
 * seleccionado en su respectivo array
 */
public class NoHayProductoException extends Exception{
    public NoHayProductoException(String mensaje){
        super(mensaje);
    }
}
