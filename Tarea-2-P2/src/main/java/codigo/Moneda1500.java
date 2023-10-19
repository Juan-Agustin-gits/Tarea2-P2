package codigo;

/**
 * Clase Moneda1500. extends de Monedas
 */
public class Moneda1500 extends Monedas{
    /**
     * @param valor
     */
    public Moneda1500(int valor){
        super(valor);
    }

    /**
     * @return Valor de la moneda: $1500
     */
    @Override
    public int getValor() {
        return 1500;
    }
}
