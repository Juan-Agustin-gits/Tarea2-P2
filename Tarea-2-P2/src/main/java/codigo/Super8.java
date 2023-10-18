package codigo;

public class Super8 extends Dulces{

    public Super8(int n) {
        super(n);
    }
    public int getPrecio(){
        return Eleccion.SUPER.getPrecio();
    }
    @Override
    public String getSabor() {
        return "Super8";
    }

}
