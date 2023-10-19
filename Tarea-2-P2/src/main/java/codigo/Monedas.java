
package codigo;

/**
 * Clase abstracta que define con lo que se va a comprar a futuro un Producto
 */
public abstract class Monedas implements Comparable<Monedas>{
    private int valor;

    public Monedas(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    /**
     * @param otra el objeto a ser comparado con una Moneda inicial
     * @return dependiendo de sus valores devolvera -1, 0 o 1
     */
    public int compareTo(Monedas otra){
        return Integer.compare(this.getValor(), otra.getValor());
        // retorna 1 si this.getValor() >  otra.getValor();
        // retorna -1 si this.getValor() <  otra.getValor();
        // retorna 0 si son iguales
    }
}
