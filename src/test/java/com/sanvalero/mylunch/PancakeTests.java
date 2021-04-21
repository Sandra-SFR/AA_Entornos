package com.sanvalero.mylunch;

import com.sanvalero.mylunch.domain.Pancake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PancakeTests {

    @Test
    public void testHamb(){
        Pancake pancake = new Pancake("harina","chocolate","fruta","sirope",1,5.00f);

        assertEquals("harina", pancake.getMasa());
        assertNotEquals("fresa", pancake.getTipoSirope());
        assertEquals("fruta", pancake.getTooping());
        assertNotEquals("no", pancake.getExtra());
        assertEquals(1,pancake.getNumeroPancake());
        assertNotEquals(4.00f, pancake.getPrecioPancake());

    }

}
