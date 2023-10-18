import codigo.Deposito;
import codigo.Bebida;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DepositoTest {
    @Test
    public void testAddProductoBebida() {
        //para hacer esta prueba usamos una bebida generica
        Bebida generica = new Bebida(1234) {
            @Override
            public String getSabor() {
                return "generica";
            }
        };
        Deposito<Bebida> bebidaDeposito = new Deposito<>();
        bebidaDeposito.addProducto(generica);
        int cantidad = bebidaDeposito.size();
        Assertions.assertNotEquals(0,cantidad);
    }
    @Test
    public void testGetProductoBebida() {
        //para hacer esta prueba usamos una bebida generica
        Bebida generica = new Bebida(1234) {
            @Override
            public String getSabor() {
                return "generica";
            }
        };
        Deposito<Bebida> bebidaDeposito = new Deposito<>();
        bebidaDeposito.addProducto(generica);
        int cantidad = bebidaDeposito.size();
        bebidaDeposito.getProducto();
        cantidad = bebidaDeposito.size();
        Assertions.assertEquals(0, cantidad);
    }
}
