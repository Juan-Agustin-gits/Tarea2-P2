package codigo;

public class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String sabor() {
        return "cocacola";
    }
}
