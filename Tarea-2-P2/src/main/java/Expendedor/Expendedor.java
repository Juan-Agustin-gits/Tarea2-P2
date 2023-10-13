package Expendedor;

public class Expendedor {
    private CocaCola zero = new CocaCola(1);
    private Sprite sinAzucar = new Sprite(3);

    Deposito coca,sprite;
    public Expendedor(int a){
        coca = new Deposito();
        sprite = new Deposito();
        for(int i=100; i<a+100; i++){
            Bebida b = new CocaCola(i);
            coca.addBebida(b);
        }
        for(int i=200; i<a+200; i++){
            Bebida b = new Sprite(i);
            sprite.addBebida(b);
        }
    }
    public Bebida comprarBebida(Monedas CLP, int seleccion){
        if(seleccion == 1){
            return coca.getBebida();
        }else if(seleccion == 2){
            return sprite.getBebida();
        }
        return null;


    }
}
