package codigo;

public class Expendedor {
    private int cantidadProductos;
    private int precioBebidas; //multiplos de 100(hacer Excepciones de estas variables)
    private int precioDulces;
    private Monedas pago;
    private Deposito<CocaCola> coca = new Deposito<>();
    private Deposito<Sprite> sprite = new Deposito<>();
    private Deposito<Super8> super8 = new Deposito<>();
    private Deposito<Snikers> sniker = new Deposito<>();
//en el constr. hay que cambiar los precios
    public Expendedor(int cantidadProductos,int precioBebidas,int precioDulces,Monedas pago) {
        this.cantidadProductos = cantidadProductos;
        this.precioBebidas = precioBebidas;
        this.precioDulces = precioDulces;
        this.pago = pago;
        for (int n=0; n<cantidadProductos; n++){
            coca.addProducto(new CocaCola(n,precioBebidas));
            sprite.addProducto(new Sprite(n,precioBebidas));
            super8.addProducto(new Super8(n,precioDulces));
            sniker.addProducto(new Snikers(n,precioDulces));
        }
        // hacer excepcion en caso de que la moneda fuera igual a NULL PagoIncorrectoException
    }
    public Productos comprarProducto(int n) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if(pago == null) {
            throw new PagoIncorrectoException("Por favor ingresa una moneda valida");
        }
        if (n==1){
            if(coca.size()!=0&&pago.getValor()>=precioBebidas){
                return coca.getProducto();
            } else if (coca.size() == 0) {
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            } else if (pago.getValor()< precioBebidas){
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        if (n==2){
            if(sprite.size()!=0&&pago.getValor()>=precioBebidas){
                return sprite.getProducto();
            }else if(sprite.size() == 0){
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            } else if (pago.getValor()< precioBebidas) {
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        if (n==3){
            if(super8.size()!=0&&pago.getValor()>=precioDulces){
                return super8.getProducto();
            }else if(super8.size() == 0){
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }else if (pago.getValor()< precioDulces) {
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }

        }
        if (n==4){
            if(sniker.size()!=0&&pago.getValor()>=precioDulces){
                return sniker.getProducto();
            }else if(sniker.size() == 0){
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }else if (pago.getValor()< precioDulces){
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }else{
            throw new NoHayProductoException("Elige entre nustras 4 opciones por favor");
        }
        return null;
    }
}

