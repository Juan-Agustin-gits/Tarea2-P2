package codigo;

/**
 * Excepcion PagoIncorrecto
 */
public class PagoIncorrectoException extends Exception{
    /**
     * @param mensaje
     */
    public PagoIncorrectoException(String mensaje){
        super(mensaje);
    }
}
