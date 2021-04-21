package com.sanvalero.mylunch;
import com.sanvalero.mylunch.domain.Batido;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BatidoTests {

    @Test
    public void test1(){
        Batido batido = new Batido("soja","fresa","chocolate","fruta",1,5.00f);

        assertEquals("soja", batido.getLeche());
        assertNotEquals("chocolate", batido.getSabor());
        assertEquals("chocolate", batido.getTipoSirope());
        assertNotEquals("chispas", batido.getTooping());
        assertEquals(1,batido.getNumeroBatidos());
        assertNotEquals(4.00f, batido.getPrecioBatido());

    }


}
