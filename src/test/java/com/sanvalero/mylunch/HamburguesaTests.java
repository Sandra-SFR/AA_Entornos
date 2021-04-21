package com.sanvalero.mylunch;

import com.sanvalero.mylunch.domain.Hamburguesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HamburguesaTests {

    @Test
    public void testHamb(){
        Hamburguesa hamburguesa = new Hamburguesa("sesamo","pollo","bbq","queso",1,5.00f);

        assertEquals("sesamo", hamburguesa.getPan());
        assertNotEquals("chocolate", hamburguesa.getCarne());
        assertEquals("bbq", hamburguesa.getSalsa());
        assertNotEquals("no", hamburguesa.getExtra());
        assertEquals(1,hamburguesa.getNumeroCarne());
        assertNotEquals(4.00f, hamburguesa.getPrecioHamburguesa());

    }

}
