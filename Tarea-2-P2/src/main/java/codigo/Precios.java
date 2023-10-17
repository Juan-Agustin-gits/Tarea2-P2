package codigo;

public enum Precios {
    Precio100(100),
    Precio500(500),
    Precio1000(1000),
    Precio1500(1500);
    //no tenemos precios predefinidos
    private int Valor;
    Precios(int Valor){
        this.Valor = Valor;
    }
    public int getValor(){
        return Valor;
    }
}
