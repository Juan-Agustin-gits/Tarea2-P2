package codigo;

class Bebida extends Productos{
    public Bebida(String nombre,Precios precio, String sabor) {
        super(nombre,precio,sabor);
    }

    @Override
    public String getSabor() {
        return null;
    }
}
