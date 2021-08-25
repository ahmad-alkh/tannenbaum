/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.tannenbaum.baum;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 27.11.2019
 */
public class WeihnachtsbaumVerkauf {

    public Tannenbaum holeBaum(int hoch) {
        Tannenbaum baum = new Tannenbaum();
        String[][] tannenbaum = new String[hoch][hoch * 2 - 1];
        double kosten = hoch * 2.5;
        for (int i = 0; i < hoch; i++) {
            int spalte = 0;
            int leerZeichen = hoch - 1 - i;
            for (int j = 0; j < leerZeichen; j++) {

                tannenbaum[i][spalte] = Weihnachtsbaum.leerAusgabe;
                // System.out.print(arrayAusgebe);
                spalte++;
            }
            int stern = i * 2 + 1;
            for (int k = 0; k < stern; k++) {

                tannenbaum[i][spalte] = Weihnachtsbaum.SterneAusgabe;
                // System.out.print(arrayAusgebe);
                spalte++;

            }
            // System.out.println();
        }
        baum.setBaum(tannenbaum);
        baum.setKosten(kosten);
        return baum;
    }
}
