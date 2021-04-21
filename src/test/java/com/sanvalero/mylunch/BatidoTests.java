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

    @Test
    public void equals(){
        Batido batido = new Batido("soja", "fresa", "chocolate","fruta", 1, 5.00f);
        Batido batido2 = new Batido("soja", "chocolate", "chocolate","oreo", 2, 5.50f);
        Batido batido3 = new Batido("soja", "fresa", "vainilla","fruta", 1, 5.00f);
        Batido batido4 = new Batido("coco", "fresa", "sin","fruta", 3, 6.00f);

        assertEquals(batido, batido2);
        assertNotEquals(batido3, batido4);


    }


}
