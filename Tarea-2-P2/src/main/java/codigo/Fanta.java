package codigo;

public class Fanta extends Bebida{
    public Fanta(int n){
        super(n);
    }
    public int getPrecio(){
        return Eleccion.FANTA.getPrecio();
    }

    @Override
    public String getSabor() {
        return "Fanta";
    }
}
