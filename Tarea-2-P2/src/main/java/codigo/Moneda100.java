package codigo;

/**
 * Herencia de Moneda con valor 100
 */

public class Moneda100 extends Monedas{
    public Moneda100(int valor){
        super(valor);
    }
    @Override
    public int getValor() {
        return 100;
    }
}
