package codigo;

/**
 * Clase Moneda1000, extends de Monedas
 */
public class Moneda1000 extends Monedas{
    /**
     * @param valor
     */
    public Moneda1000(int valor){
        super(valor);
    }

    /**
     * @return Valor de la moneda: $1000
     */
    @Override
    public int getValor() {
        return 1000;
    }
}
