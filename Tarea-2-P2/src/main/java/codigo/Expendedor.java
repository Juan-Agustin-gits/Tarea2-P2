package codigo;

public class Expendedor {
    private int cantidadProductos;
    private Monedas pago;
    private int vuelto = 0;
    private Deposito<CocaCola> coca = new Deposito<>();
    private Deposito<Sprite> sprite = new Deposito<>();
    private Deposito<Super8> super8 = new Deposito<>();
    private Deposito<Snikers> sniker = new Deposito<>();
    private Deposito<Monedas> monvu = new Deposito<>();
    //y si la moneda de pago no es la misma que la moneda del cliente??
    public Expendedor(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
        for (int n=0; n<cantidadProductos; n++){
            coca.addProducto(new CocaCola(n));
            sprite.addProducto(new Sprite(n));
            super8.addProducto(new Super8(n));
            sniker.addProducto(new Snikers(n));
        }


        // hacer excepcion en caso de que la moneda fuera igual a NULL PagoIncorrectoException
    }
    //EL n de comprarProducto debe cambiarse por un enum (creo que solo era para el valor)
    public Productos comprarProducto(int n, Monedas pago){
        if (n==1){
            if(coca.size()!=0&&pago.getValor()>=coca.getProducto().getPrecio()){
                for(int i=pago.getValor()-coca.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                    vuelto=vuelto+100;
                }
                return coca.getProducto();
            }


        }
        if (n==2){
            if(sprite.size()!=0&&pago.getValor()>=sprite.getProducto().getPrecio()){
                for(int i= pago.getValor()-sprite.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                    vuelto=vuelto+100;
                }
                return sprite.getProducto();
            }

        }
        if (n==3){
            if(super8.size()!=0&&pago.getValor()>=super8.getProducto().getPrecio()){
                for(int i= pago.getValor()-super8.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                    vuelto=vuelto+100;
                }
                return super8.getProducto();
            }

        }
        if (n==4){
            if(sniker.size()!=0&&pago.getValor()>=sniker.getProducto().getPrecio()){
                for(int i= pago.getValor()-sniker.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(Monedas.Moneda100);
                    vuelto=vuelto+100;
                }
                return sniker.getProducto();
            }

        }
        else{
            return null;
        }
        return null;
    }
    public int getVuelto() {
        return vuelto;
    }
}
