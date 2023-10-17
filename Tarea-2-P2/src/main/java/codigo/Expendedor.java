package codigo;

public class Expendedor {
    private int cantidadProductos;
    private int precioBebidas; //multiplos de 100(hacer Excepciones de estas variables)
    private int precioDulces;
    private Monedas pago;
    private Moneda100 moneda100;
    private int vuelto = 0;
    private Deposito<CocaCola> coca = new Deposito<>();
    private Deposito<Sprite> sprite = new Deposito<>();
    private Deposito<Super8> super8 = new Deposito<>();
    private Deposito<Snikers> sniker = new Deposito<>();
    private Deposito<Monedas> monvu = new Deposito<>();

    //en el constr. hay que cambiar los precios
    public Expendedor(int cantidadProductos, int precioBebidas, int precioDulces, Monedas pago) {
        this.cantidadProductos = cantidadProductos;
        this.precioBebidas = precioBebidas;
        this.precioDulces = precioDulces;
        this.pago = pago;
        for (int n = 0; n < cantidadProductos; n++) {
            coca.addProducto(new CocaCola(n, precioBebidas));
            sprite.addProducto(new Sprite(n, precioBebidas));
            super8.addProducto(new Super8(n, precioDulces));
            sniker.addProducto(new Snikers(n, precioDulces));
        }
        // hacer excepcion en caso de que la moneda fuera igual a NULL PagoIncorrectoException
    }

    public Productos comprarProducto(int n) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (pago == null) {
            throw new PagoIncorrectoException("Por favor ingresa una moneda valida");
        }
        if (n == 1) {
            if (coca.size() != 0 && pago.getValor() >= precioBebidas) {
                for (int i = pago.getValor() - precioBebidas; i > 0; i = i - 100) {
                    monvu.addProducto(moneda100);
                    vuelto = vuelto + 100;
                }
                return coca.getProducto();
            } else if (coca.size() == 0) {
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            } else if (pago.getValor() < precioBebidas) {
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        if (n == 2) {
            if (sprite.size() != 0 && pago.getValor() >= precioBebidas) {
                for (int i = pago.getValor() - precioBebidas; i > 0; i = i - 100) {
                    monvu.addProducto(moneda100);
                    vuelto = vuelto + 100;
                }
                return sprite.getProducto();
            } else if (sprite.size() == 0) {
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            } else if (pago.getValor() < precioBebidas) {
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        if (n == 3) {
            if (super8.size() != 0 && pago.getValor() >= precioDulces) {
                for (int i = pago.getValor() - precioDulces; i > 0; i = i - 100) {
                    monvu.addProducto(moneda100);
                    vuelto = vuelto + 100;
                }
                return super8.getProducto();
            } else if (super8.size() == 0) {
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            } else if (pago.getValor() < precioDulces) {
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }

        }
        if (n == 4) {
            if (sniker.size() != 0 && pago.getValor() >= precioDulces) {
                for (int i = pago.getValor() - precioDulces; i > 0; i = i - 100) {
                    monvu.addProducto(moneda100);
                    vuelto = vuelto + 100;
                }
                return sniker.getProducto();
            } else if (sniker.size() == 0) {
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            } else if (pago.getValor() < precioDulces) {
                throw new PagoInsuficienteException("La moneda NO alcanza");
            } else {
                return null;
            }
        }
        return null;
    }
}

