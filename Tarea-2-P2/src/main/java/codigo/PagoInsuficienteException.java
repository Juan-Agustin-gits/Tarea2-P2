package codigo;

/**
 * Excepcion PagoInsuficiente
 */
public class PagoInsuficienteException extends Exception{
    /**
     * @param mensaje
     */
    public PagoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
