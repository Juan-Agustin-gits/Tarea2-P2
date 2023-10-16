package codigo;

public enum Precios {;
    //no tenemos precios predefinidos
    private int Valor;
    Precios(int Valor){
        this.Valor = Valor;
    }
    public int getValor(){
        return Valor;
    }
}
