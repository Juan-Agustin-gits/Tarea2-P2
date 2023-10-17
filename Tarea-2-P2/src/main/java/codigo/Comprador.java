package codigo;

public class Comprador {
    private Monedas moneda;
    //aca debo cambiar el nimIdent
    private int numIdent;
    private Expendedor expendedor;

    public Comprador(Monedas moneda, int numIdent, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.moneda = moneda;
        this.numIdent = numIdent;
        this.expendedor = expendedor;
        expendedor.comprarProducto(numIdent,moneda);
    }
    public Comprador(){

    }
}
