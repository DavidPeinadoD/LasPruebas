import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;


public class ClaseCadenaTest {
    @Test
    public void testDevuelveIniciales() {
        // Prueba con un nombre completo válido con varias palabras
        String iniciales1 = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        assertEquals("A.D.", iniciales1);

        // Prueba con un nombre completo válido con una sola palabra
        String iniciales2 = ClaseCadena.DevuelveIniciales("John");
        assertEquals("J.", iniciales2);

        // Prueba con un nombre completo válido con una sola palabra y espacios adicionales
        String iniciales3 = ClaseCadena.DevuelveIniciales("  John  ");
        assertEquals("J.", iniciales3);

        // Prueba con un nombre completo válido con una sola letra
        String iniciales4 = ClaseCadena.DevuelveIniciales("A");
        assertEquals("A.", iniciales4);

        // Prueba con un nombre completo válido con una sola letra y espacios adicionales
        String iniciales5 = ClaseCadena.DevuelveIniciales("  A  ");
        assertEquals("A.", iniciales5);

        // Prueba con un nombre completo válido con números y caracteres especiales
        String iniciales6 = ClaseCadena.DevuelveIniciales("1st Place!");
        assertEquals("1.P.", iniciales6);


        // Prueba con un nombre completo nulo
        String iniciales8 = ClaseCadena.DevuelveIniciales(null);
        assertEquals("", iniciales8);

        // Prueba con un nombre completo vacío
        String iniciales9 = ClaseCadena.DevuelveIniciales("");
        assertEquals("", iniciales9);
    }
}