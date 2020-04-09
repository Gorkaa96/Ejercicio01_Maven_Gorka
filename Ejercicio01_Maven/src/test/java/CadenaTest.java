

import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.ed.Cadena;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	private Cadena target;

    @BeforeEach
    void setUp() throws Exception {
        target = new Cadena();
    }

    @Test
    void testLongitudA() {
        int expected = 2;
        int actual = target.longitud("hi");
        assertEquals(expected, actual, "longitud cadena");
    }

    @Test
    void testLongitudB() {
        int expected = 0;
        int actual = target.longitud("");
        assertEquals(expected, actual, "longitud cadena");
    }

    @Test
    void testVocalesA() {
        int expected = 4;
        int actual = target.vocales("olaia");
        assertEquals(expected, actual, "numero vocales");
    }

    @Test
    void testVocalesB() {
        int expected = 0;
        int actual = target.vocales("");
        assertEquals(expected, actual, "numero vocales");
    }

    @Test
    void testInvertirA() {
        String expected = "oxiaK";
        String actual = target.invertir("Kaixo");
        assertEquals(expected, actual, "invertido");
    }

    @Test
    void testInvertirB() {
        String expected = "";
        String actual = target.invertir("");
        assertEquals(expected, actual, "invertido");
    }

    @Test
    void testContarLetraA() {
        int expected = 1;
        int actual = target.contarLetra("Lakuntza", 'u');
        assertEquals(expected, actual, "numero de veces que aparece la letra");
    }

    @Test
    void testContarLetraB() {
        int expected = 0;
        int actual = target.contarLetra("", 'u');
        assertEquals(expected, actual, "numero de veces que aparece la letra");
    }

}
