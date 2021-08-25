/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.tannenbaum.baum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 27.11.2019
 */
public class WeihnachtsbaumVerkaufTest {

    @Test
    public void test() {
        WeihnachtsbaumVerkauf eRsteBaum = new WeihnachtsbaumVerkauf();
        Tannenbaum baum = eRsteBaum.holeBaum(12);
        String[][] VerkaufBaum = baum.getBaum();
        assertEquals(Weihnachtsbaum.SterneAusgabe, VerkaufBaum[8][9]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[0][0]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[1][0]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[0][1]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[2][1]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[3][0]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[6][4]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[0][5]);
        assertEquals(Weihnachtsbaum.SterneAusgabe, VerkaufBaum[7][6]);
        assertEquals(Weihnachtsbaum.SterneAusgabe, VerkaufBaum[9][8]);
        assertEquals(Weihnachtsbaum.leerAusgabe, VerkaufBaum[7][0]);
        assertEquals(Weihnachtsbaum.SterneAusgabe, VerkaufBaum[3][9]);
        assertEquals(Weihnachtsbaum.SterneAusgabe, VerkaufBaum[10][5]);

        // assertTrue(eRsteBaum.leseBaum(7, 0, " ", baum));
        // assertFalse(eRsteBaum.leseBaum(9, 8, " ", baum));
        // assertTrue(eRsteBaum.leseBaum(7, 0, " ", baum));
        // assertFalse(eRsteBaum.leseBaum(7, 6, " ", baum));
        // assertTrue(eRsteBaum.leseBaum(7, 6, "*", baum));
        // assertFalse(eRsteBaum.leseBaum(10, 8, " ", baum));
        // assertTrue(eRsteBaum.leseBaum(10, 9, "*", baum));
        // assertFalse(eRsteBaum.leseBaum(6, 5, "i", baum));
        // assertFalse(eRsteBaum.leseBaum(9, 3, " ", baum));
    }

    @Test
    public void testNull() {

        String meinText = "a";
        String mein2Text = null;
        System.out.println(mein2Text == meinText);
        System.out.println(mein2Text != null && mein2Text.equals(meinText));
        System.out.println(meinText.equals(mein2Text));

        Tannenbaum t1 = new Tannenbaum();
        Tannenbaum t2 = new Tannenbaum();
        Tannenbaum t3 = t1;

        System.out.println("Tannenbaum1: " + (t1 == t2));
        System.out.println(t1.equals(t2));
        System.out.println("Tannenbaum2: " + (t1 == t3));
        System.out.println(t1.equals(t3));
    }
}
