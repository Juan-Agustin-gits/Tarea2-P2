package codigo;

public class Comprador {
    private Monedas moneda;
    //aca debo cambiar el nimIdent
    private Eleccion eleccion;
    private Expendedor expendedor;

    public Comprador(Monedas moneda,Eleccion eleccion , Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.moneda = moneda;
        this.eleccion=eleccion;
        this.expendedor = expendedor;
        expendedor.comprarProducto(eleccion,moneda);
    }
    public Comprador(){

    }
}
