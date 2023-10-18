package codigo;

public class Comprador {
    private Monedas moneda;
    //aca debo cambiar el nimIdent
    private int nimIdent;
    private Expendedor expendedor;

    public Comprador(Monedas moneda,int nimIdent , Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.moneda = moneda;
        this.nimIdent=nimIdent;
        this.expendedor = expendedor;
        expendedor.comprarProducto(nimIdent,moneda);
    }
}
