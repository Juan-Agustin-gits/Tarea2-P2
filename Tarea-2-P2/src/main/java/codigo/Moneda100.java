package codigo;

/**
 * Herencia de Moneda con valor 100
 */
public class Moneda100 extends Monedas{
    public Moneda100(){
        super();
    }

    /**
     * @return Valor de la moneda : $100
     */
    @Override
    public int getValor() {
        return 100;
    }
}
