
package codigo;

public abstract class Monedas implements Comparable<Monedas>{
    private int valor;

    Monedas(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public int compareTo(Monedas otra){
        return Integer.compare(this.getValor(), otra.getValor());
        // retorna 1 si this.getValor() >  otra.getValor();
        // retorna -1 si this.getValor() <  otra.getValor();
        // retorna 0 si son iguales
    }
}
