package codigo;

/**
 * Exception para cuando el valor de la moneda
 * seleccionada sea menor al del producto elegido
 */
public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
