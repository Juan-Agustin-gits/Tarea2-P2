package codigo;

/**
 * Clase Moneda100, extends de Monedas
 */
public class Moneda100 extends Monedas{
    /**
     * @param valor
     */
    public Moneda100(int valor){
        super(valor);
    }

    /**
     * @return Valor de la moneda : $100
     */
    @Override
    public int getValor() {
        return 100;
    }
}
