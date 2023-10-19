package codigo;

/**
 * Clase Comprador
 */
public class Comprador {
    private Monedas moneda;
    //aca debo cambiar el nimIdent
    private int nimIdent;
    private Expendedor expendedor;
    private Productos productoComprado;
    private int vuelto;

    /**
     * @param moneda con la que se compra en expendedor
     * @param nimIdent con el cual se elije el producto a comprar
     * @param expendedor donde se compra el producto
     * @throws NoHayProductoException
     * @throws PagoInsuficienteException
     * @throws PagoIncorrectoException
     */
    public Comprador(Monedas moneda,int nimIdent , Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.moneda = moneda;
        this.nimIdent=nimIdent;
        this.expendedor = expendedor;
        productoComprado = expendedor.comprarProducto(nimIdent,moneda);
        while(expendedor.getVuelto() != null){
            Monedas monedaVuelto = expendedor.getVuelto();
            vuelto += monedaVuelto.getValor();
        }
    }

    public Monedas getMoneda() {
        return moneda;
    }

    /**
     * @return elccion de el comprador
     */
    public int getNimIdent() {
        return nimIdent;
    }

    /**
     * @return Expendedor
     */
    public Expendedor getExpendedor() {
        return expendedor;
    }

    /**
     * @return productoComprado
     */
    public Productos getProductoComprado() {
        return productoComprado;
    }

    /**
     * @return vuelto de el comprador
     */
    public int getVuelto(){
        return vuelto;
    }

    /**
     * @return  Sabor de el producto
     */
    public String getSabor(){
        return productoComprado.getSabor();
    }
}
