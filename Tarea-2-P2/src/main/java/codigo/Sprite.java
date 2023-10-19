package codigo;

/**
 * Herencia de Bebida con sabor "sprite"
 */
public class Sprite extends Bebida{
    /**
     * @param n
     */
    public Sprite(int n) {
        super(n);
    }

    /**
     * @return Precio del Sprite
     */
    public int getPrecio(){
        return Eleccion.SPRITE.getPrecio();
    }

    /**
     * @return String "Sprite", que representa el sabor del producto
     *
     */
    @Override
    public String getSabor() {
        return "sprite";
    }


}
