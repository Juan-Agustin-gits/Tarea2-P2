<<<<<<<< HEAD:Tarea-2-P2/src/main/java/codigo/Monedas.java
package codigo;
========
package Código;
>>>>>>>> ramaAlan:Tarea-2-P2/src/main/java/Código/Monedas.java

public enum Monedas{
    Moneda1500(1500),
    Moneda1000(1000),
    Moneda500(500),
    Moneda100(100);
    private int valor;
    Monedas(int valor) {
        this.valor = valor;
    }
}
