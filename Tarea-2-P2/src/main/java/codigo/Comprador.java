package codigo;

public class Comprador {
    private Monedas moneda;
    private int numIdent;
    private Expendedor expendedor;

    public Comprador(Monedas moneda, int numIdent, Expendedor expendedor) {
        this.moneda = moneda;
        this.numIdent = numIdent;
        this.expendedor = expendedor;
        //comprar en el expendedor

    }
}
