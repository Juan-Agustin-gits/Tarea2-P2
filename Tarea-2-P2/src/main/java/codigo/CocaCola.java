package codigo;

/**
 * Herencia de Bebida con sabor "cocacola"
 */
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
