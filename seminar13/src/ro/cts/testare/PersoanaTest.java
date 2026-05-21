package ro.cts.testare;

import org.junit.Test;
import ro.cts.clase.Persoana;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getVarsta() {
        Persoana persoana = new Persoana("Gigel","6041127030047");
        assertEquals(21,persoana.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryGetVarsta(){
        Persoana persoana = new Persoana("Viorel","1991231234567");
        assertEquals(26,persoana.getVarsta());

    }

    @org.junit.Test
    public void testBoundaryCurrentDay(){
        Persoana persoana = new Persoana("Georgel","6000521112233");
        assertEquals(26,persoana.getVarsta());

    }

    @org.junit.Test
    public void testCrossGetSex(){
        Persoana persoana = new Persoana("Ion","5000521112233");
        String cnp = "5000521112233";
        assertEquals(cnp.charAt(0)%2 == 0 ? "F": "M",persoana.getSex());

    }

    @Test(expected = IllegalAccessError.class)
    public void testCnpInvalid(){
        Persoana persoana = new Persoana("Ionel","50308121229029");
        persoana.checkCNP();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIvalidCaracters(){
        Persoana persoana = new Persoana("Dan","503h8121229029");
    }

    @Test(timeout = 100)
    public void testTime(){
        Persoana persoana = new Persoana("Danut","5020202281821");
        persoana.getVarsta();
    }

    @Test
    public void testOrdineVarste(){
        Persoana persoana1 = new Persoana("Liviu","5010202281821");
        Persoana persoana2 = new Persoana("Marcel","5020202281821");

        assertTrue(persoana1.getVarsta()>persoana2.getVarsta());
    }

    @Test(expected = IllegalAccessException.class)
    public void testDataViitor(){
        Persoana persoana = new Persoana("Fabian","5270202281821");
        persoana.getVarsta();
    }

}