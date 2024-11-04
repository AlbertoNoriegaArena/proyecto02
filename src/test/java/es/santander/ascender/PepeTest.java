package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PepeTest {
    
    // Test para el metodo sumar
    @Test
    public void testSumar(){
        // sut => system under test
        Pepe sut= new Pepe();
        assertTrue(sut.sumar(4, 3) ==7);
    }

    // Test para el metodo operar
    @Test
    public void testOperar() {
        Pepe sut = new Pepe();

        // Pruebas de suma
        assertEquals(7, sut.operar(4, 3, '+'), "Suma de 4 y 3 debería ser 7");

        // Pruebas de resta
        assertEquals(1, sut.operar(4, 3, '-'), "Resta de 4 y 3 debería ser 1");

        // Pruebas de multiplicación
        assertEquals(12, sut.operar(4, 3, '*'), "Multiplicación de 4 y 3 debería ser 12");

        // Pruebas de división
        assertEquals(2, sut.operar(6, 3, '/'), "División de 6 entre 3 debería ser 2");

        
    }
}
