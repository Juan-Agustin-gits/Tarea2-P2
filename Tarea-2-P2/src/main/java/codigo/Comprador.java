package codigo;

public class Comprador {
    private Monedas moneda;
    //aca debo cambiar el nimIdent
    private Eleccion eleccion;
    private Expendedor expendedor;
    private int n;

    public Comprador(Monedas moneda,int n, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.moneda = moneda;
        this.n=n;
        this.expendedor = expendedor;
        expendedor.comprarProducto(n,moneda);
    }
    public Comprador(){

    }
}
