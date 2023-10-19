package codigo;

/**
 * Clase Moneda500, extends de Monedas
 */
public class Moneda500 extends Monedas{
    /**
     * @param valor
     */
    public Moneda500(int valor){
        super(valor);
    }

    /**
     * @return Valor de la moneda: $500
     */
    @Override
    public int getValor() {
        return 500;
    }
}
