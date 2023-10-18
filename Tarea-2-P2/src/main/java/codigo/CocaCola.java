package codigo;
public class CocaCola extends Bebida{
    public CocaCola(int n) {
        super(n);
    }
    public int getPrecio(){
        return Eleccion.COCA.getPrecio();
    }
    @Override
    public String getSabor() {
        return "cocacola";
    }
}
