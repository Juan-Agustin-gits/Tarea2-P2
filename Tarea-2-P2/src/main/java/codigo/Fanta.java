package codigo;
/**
 * Herencia de Bebida con sabor "fanta"
 */
public class Fanta extends Bebida{
    public Fanta(int n){
        super(n);
    }

    /**
     * @return
     */
    public int getPrecio(){
        return Eleccion.FANTA.getPrecio();
    }

    /**
     * @return Sabor "Fanta", String que representa a el sabor de la bebida
     */
    @Override
    public String getSabor() {
        return "fanta";
    }
}
