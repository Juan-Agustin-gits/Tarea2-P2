package codigo;
/**
 * Herencia de Moneda con valor 1000
 */
public class Moneda1000 extends Monedas{
    public Moneda1000(int valor){
        super(valor);
    }
    @Override
    public int getValor() {
        return 1000;
    }
}
