package codigo;
/**
 * Herencia de Moneda con valor 500
 */
public class Moneda500 extends Monedas{
    public Moneda500(){
        super();
    }

    /**
     * @return Valor de la moneda: $500
     */
    @Override
    public int getValor() {
        return 500;
    }
}
