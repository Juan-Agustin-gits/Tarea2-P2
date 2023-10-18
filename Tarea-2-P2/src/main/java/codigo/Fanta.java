package codigo;

public class Fanta extends Bebida{
    public Fanta(int n){
        super(n);
    }
    private Precios precio1000;
    public int getPrecio() {
        return Precios.Precio1000.getValor();
    }

    @Override
    public String getSabor() {
        return "Fanta";
    }
}
