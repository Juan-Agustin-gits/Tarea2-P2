package codigo;

public class Expendedor {
    private int cantidadProductos;
    private int precioBebidas; //multiplos de 100(hacer Excepciones de estas variables)
    private int precioDulces;
    private Monedas pago;

    public Expendedor(int cantidadProductos,int precioBebidas,int precioDulces,Monedas pago) {
        this.cantidadProductos = cantidadProductos;
        this.precioBebidas = precioBebidas;
        this.precioDulces = precioDulces;
        this.pago = pago;
        // hacer excepcion en caso de que la moneda fuera igual a NULL PagoIncorrectoException
    }
    //Hacer metodo para comprar productos

}
