package codigo;
public class CocaCola extends Bebida{
    public CocaCola(int n, int m) {
        super(n,m);
    }
    @Override
    public String getSabor() {
        return "cocacola";
    }
}
