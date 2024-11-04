package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PepeTest {
    
    @Test
    public void testSumar(){
        // sut => system under test
        Pepe sut= new Pepe();
        assertTrue(sut.sumar(4, 3) ==7);
    }
}
