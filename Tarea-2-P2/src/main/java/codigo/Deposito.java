
package codigo;

import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> array;
    public Deposito(){
        array = new ArrayList();
    }

    public void addProducto(T nueva) {
        array.add(nueva);
    }
    public T getProducto(){ //pese a que es getproducto tmbn puede servir como get moneda
        if (array.size() != 0) {
            return array.remove(0);
        }
        return null;
    }
}
