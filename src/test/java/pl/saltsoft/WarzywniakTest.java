package pl.saltsoft;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarzywniakTest {

    @Test
    public void czyKupicJablka() {

        Warzywniak warzywniakNaUlicyMilej = new Warzywniak();
        assertEquals(warzywniakNaUlicyMilej .czyKupicJablka(10), "nie" );
    }
    @Test
    public void czyKupicJablkaDwa() {

        Warzywniak warzywniakNaUlicyMilej = new Warzywniak();
        assertEquals(warzywniakNaUlicyMilej .czyKupicJablka(11), "tak" );
    }
}