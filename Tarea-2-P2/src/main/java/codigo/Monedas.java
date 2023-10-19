
package codigo;

/**
 * Clase abstracta Monedas, implementa la interfaz Comparable
 */
public abstract class Monedas implements Comparable<Monedas>{
    private int valor;

    /**
     * @param valor
     */
    public Monedas(int valor) {
        this.valor = valor;
    }

    /**
     * @return Valor de la moneda
     */
    public abstract int getValor();

    /**
     * @param otra ( de tipo Moneda ), Objeto a comparar .
     * @return retorna 1 si this.getValor() >  otra.getValor();
     *         retorna -1 si this.getValor() <  otra.getValor();
     *         retorna 0 si son iguales.
     */
    public int compareTo(Monedas otra){
        return Integer.compare(this.getValor(), otra.getValor());
        // retorna 1 si this.getValor() >  otra.getValor();
        // retorna -1 si this.getValor() <  otra.getValor();
        // retorna 0 si son iguales
    }
}
