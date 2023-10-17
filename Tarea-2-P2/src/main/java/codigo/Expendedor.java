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
    private Deposito<Monedas> monvu = new Deposito<>();
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
    public Productos comprarProducto(int n){
        if (n==1){
            if(coca.size()!=0&&pago.getValor()>=precioBebidas){
                for(int i=precioBebidas; i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                }
                return coca.getProducto();
            }


        }
        if (n==2){
            if(sprite.size()!=0&&pago.getValor()>=precioBebidas){
                for(int i=precioBebidas; i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                }
                return sprite.getProducto();
            }

        }
        if (n==3){
            if(super8.size()!=0&&pago.getValor()>=precioDulces){
                for(int i=precioDulces; i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                }
                return super8.getProducto();
            }

        }
        if (n==4){
            if(sniker.size()!=0&&pago.getValor()>=precioDulces){
                for(int i=precioDulces; i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                }
                return sniker.getProducto();
            }

        }
        return null;
    }
    //Hacer metodo para comprar productos

}
