
package de.intellinet.ausbildung.tannenbaum.baum;

/*
 * Intellinet Beratung und Technologie GmbH
 */

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 14.11.2019
 */
public class Tannenbaum {

    private double kosten;
    private String[][] baum;

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }

    public String[][] getBaum() {
        return baum;
    }

    public void setBaum(String[][] baum) {
        this.baum = baum;

    }

    @Override
    public String toString() {
        String baumPrint = "";
        String NEWLINE = "\n";

        for (int i = 0; i < baum.length; i++) {
            for (int j = 0; j < baum[i].length; j++) {

                if (baum[i][j] != null) {
                    baumPrint += baum[i][j];
                } else {

                    baumPrint += Weihnachtsbaum.leerAusgabe;
                }

            }
            baumPrint += NEWLINE;
        }

        return baumPrint;

    }
}
