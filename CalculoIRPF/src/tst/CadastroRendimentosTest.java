package tst;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import app.IRPF;

public class CadastroRendimentosTest {

    private IRPF irpf;

    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarSalario() {
        irpf.CadastrarSalario(5000f):
        assertEquals(5000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario2() {
        irpf.CadastrarRendimento(6000f);
        assertEquals(6000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario3() {
        irpf.CadastrarRendimento(5000f);
        irpf.CadastrarRendimento(6000f);
        assertEquals(11000f, irpf.getTotalSalario(), 0);
    }
}