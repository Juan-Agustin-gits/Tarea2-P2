package codigo;
/**
 * Herencia de Moneda con valor 1500
 */

public class Moneda1500 extends Monedas{
    public Moneda1500(int valor){
        super(valor);
    }
    @Override
    public int getValor() {
        return 1500;
    }
}
