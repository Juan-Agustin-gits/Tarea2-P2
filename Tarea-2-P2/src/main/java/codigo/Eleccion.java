package codigo;

public enum Eleccion {
    COCA(1,1500),
    SPRITE(2,1500),
    FANTA(3,1500),
    SUPER(4,500),
    SNICKERS(5,1000);
    private int selec;
    private int precio;
    Eleccion(int selec, int precio){
        this.selec=selec;
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }
}
