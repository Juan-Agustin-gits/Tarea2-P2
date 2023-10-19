package codigo;

/**
 * Clase CocaCola extends de Bebida
 */
public class CocaCola extends Bebida{
    /**
     * @param n Numero de serie de la CocaCola
     */
    public CocaCola(int n) {
        super(n);
    }

    /**
     * @return Precio de la CocaCola
     */
    @Override
    public int getPrecio(){
        return Eleccion.COCA.getPrecio();
    }

    /**
     * @return Sabor "CocaCola", String que representa a el sabor de la bebida
     */
    @Override
    public String getSabor() {
        return "cocacola";
    }

}
