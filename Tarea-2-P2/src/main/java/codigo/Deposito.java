
package codigo;

import java.util.ArrayList;

/**
 * @param <T> Un tipo T generico que permite tener diferentes depositos de varios tipos
 */
public class Deposito<T> {
    private ArrayList<T> array;

    /**
     * Constructor de Deposito
     */
    public Deposito() {
        array = new ArrayList();
    }

    /**
     * @param nueva Objeto que se agrega al Deposito
     */
    public void addProducto(T nueva) {
        array.add(nueva);
    }

    /**
     * @return Objeto, en la posicion 0, que se quita del Deposito
     */
    public T getProducto() { //pese a que es getproducto tmbn puede servir como get moneda
        if (array.size() != 0) {
            return array.remove(0);
        }
        return null;
    }

    /**
     * @return Tamaño del Deposito
     */
    public int size(){
        return array.size();
    }

}
