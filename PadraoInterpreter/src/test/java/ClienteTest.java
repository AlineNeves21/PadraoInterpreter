import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente();
        cliente.setPedido1(10.0);
        cliente.setPedido2(10.0);

        assertEquals(15.0, cliente.calcularPedido());
    }
}
