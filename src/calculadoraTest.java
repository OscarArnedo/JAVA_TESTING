import junit.framework.TestCase;
import org.junit.Test;

public class calculadoraTest extends TestCase{
    public calculadora c;

    @Override
    public void setUp() {
        c = new calculadora(8,2,"suma");
    }

    @Test
    public void testSuma(){
        c.setSimbolo("suma");
        assertEquals(10.0 ,c.calcular());
    }

    @Test
    public void testResta() {
        c.setSimbolo("resta");
        assertEquals(6.0 ,c.calcular());
    }

    @Test
    public void testMultiplicacion() {
        c.setSimbolo("multiplicacion");
        assertEquals(16.0 ,c.calcular());
    }

    @Test
    public void testDivision() {
        c.setSimbolo("division");
        assertEquals(4.0 ,c.calcular());
    }
}