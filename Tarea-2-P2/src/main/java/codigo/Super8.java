package codigo;

/**
 * Clase Super 8, extends de Dulces
 */
public class Super8 extends Dulces{

    /**
     * @param n
     */
    public Super8(int n) {
        super(n);
    }

    /**
     * @return Precio del Super 8
     */
    public int getPrecio(){
        return Eleccion.SUPER.getPrecio();
    }

    /**
     * @return String "Super 8", que representa el sabor del producto
     */
    @Override
    public String getSabor() {
        return "Super8";
    }

}
