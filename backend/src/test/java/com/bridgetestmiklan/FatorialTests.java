package com.bridgetestmiklan;
import org.junit.jupiter.api.Test;
import com.bridgetestmiklan.controller.Controller;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	void testeZero() throws Exception {
        Controller control = new Controller();
         assertEquals(1L, control.fatorial(0L));
    }

    @Test
    void testeUm() throws Exception {
        Controller control = new Controller();
       assertEquals(1L, control.fatorial(1L));
    }

    @Test
    void testeDois() throws Exception {
        Controller control = new Controller();
         assertEquals(2L, control.fatorial(2L));
    }

    @Test
    void testeTres() throws Exception {
        Controller control = new Controller();
        assertEquals(6L, control.fatorial(3L));
    }

    @Test
    void testeQuatro() throws Exception {
        Controller control = new Controller();
        assertEquals(24L, control.fatorial(4L));
    }

    @Test
    void testeCinco() throws Exception {
        Controller control = new Controller();
        assertEquals(120L, control.fatorial(5L));
    }

    @Test
    void testeSeis() throws Exception {
        Controller control = new Controller();
        assertEquals(720L, control.fatorial(6L));
    }

    @Test
    void testeSete() throws Exception {
        Controller control = new Controller();
        assertEquals(5040L, control.fatorial(7L));
    }

    @Test
    void testeOito() throws Exception {
        Controller control = new Controller();
        assertEquals(40320L, control.fatorial(8L));
    }

    @Test
    void testeNove() throws Exception {
        Controller control = new Controller();
        assertEquals(362880L, control.fatorial(9L));
    }

    @Test
    void testeDez() throws Exception {
        Controller control = new Controller();
        assertEquals(3628800L, control.fatorial(10L));
    }


}
