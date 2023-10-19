import codigo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExpendedorTest {
    Moneda1500 moneda1500Test = new Moneda1500(1500);
    Expendedor expendedorTest = new Expendedor(10);
    Comprador compradorTest;

    @BeforeEach // Ejecutara este codigo antes de todos los test
    void setUp() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        compradorTest = new Comprador(moneda1500Test,3,expendedorTest);
    }

    @Test
    public void getVueltoTotalTest(){
        int precio = compradorTest.getProductoComprado().getPrecio();
        int vuelto = moneda1500Test.getValor() - precio;
        Assertions.assertEquals(vuelto,compradorTest.getVuelto());
    }
}
