package codigo;

abstract class Bebida extends Productos{
    public Bebida(String nombre,Precios precio) {
        super(nombre,precio);
    }

    @Override
    public abstract String getSabor();
}
