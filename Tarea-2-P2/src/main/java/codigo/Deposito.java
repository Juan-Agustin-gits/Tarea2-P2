<<<<<<<< HEAD:Tarea-2-P2/src/main/java/codigo/Deposito.java
package codigo;
========
package Código;
>>>>>>>> ramaAlan:Tarea-2-P2/src/main/java/Código/Deposito.java

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
