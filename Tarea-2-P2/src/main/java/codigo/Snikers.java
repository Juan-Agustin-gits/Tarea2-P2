package codigo;

/**
 * Clase Snikers, extends de Dulces
 */
public class Snikers extends Dulces{

    /**
     * @param n
     */
    public Snikers(int n) {
        super(n);
    }

    /**
     * @return Precio del Snikers
     */
    public int getPrecio(){
        return Eleccion.SNICKERS.getPrecio();
    }

    /**
     * @return String "Snikers", sabor del producto
     */
    @Override
    public String getSabor() {
        return "Snikers";
    }

}
