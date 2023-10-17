package codigo;

public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
