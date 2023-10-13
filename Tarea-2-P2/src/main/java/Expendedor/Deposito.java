package Expendedor;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> array;
    public Deposito(){
        array = new ArrayList();
    }

    public void addBebida(Bebida nueva) {
        array.add(nueva);
    }
    public Bebida getBebida(){
        if (array.size() != 0) {
            return array.remove(0);
        }
        return null;
    }
}
