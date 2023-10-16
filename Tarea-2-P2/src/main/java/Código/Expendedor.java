package Código;

public class Expendedor {
    private CocaCola zero = new CocaCola(1);
    private Sprite sinAzucar = new Sprite(3);

    Deposito coca,sprite,monVu;
    public Expendedor(int a){
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new Deposito();
        for(int i=100; i<a+100; i++){
            Bebida b = new CocaCola(i);
            coca.addProducto(b);
        }
        for(int i=200; i<a+200; i++){
            Bebida b = new Sprite(i);
            sprite.addProducto(b);
        }
    }
    public Producto comprarProducto(Monedas CLP, int seleccion){
        if(seleccion == 1){
            return (Producto) coca.getProducto(); //el (producto lo recomendó intelij
        }else if(seleccion == 2){
            return (Producto) sprite.getProducto();
        }
        return null;


    }
}
