
package de.intellinet.ausbildung.tannenbaum.baum;
/*
 * Intellinet Beratung und Technologie GmbH
 */

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 06.11.2019
 */
public class BaumSchmuck {

    public String[][] holeBaum(int hoch) {

        String[][] tannenbaum = new String[hoch][hoch * 2 - 1];

        for (int i = 0; i < hoch; i++) {
            int spalte = 0;
            int leerZeichen = hoch - 1 - i;
            for (int j = 0; j < leerZeichen; j++) {

                tannenbaum[i][spalte] = Weihnachtsbaum.SterneAusgabe;
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

        return tannenbaum;
    }

    public void schmueckeBaumMitKerze(Tannenbaum baum) {

        String[][] schmueckeBaum = baum.getBaum();
        for (int i = 0; i < schmueckeBaum.length; i++) {
            int letztePosition = schmueckeBaum.length + i;
            if (letztePosition < schmueckeBaum[i].length)
                schmueckeBaum[i][letztePosition] = Weihnachtsbaum.KerzeAusgabe;
            int erstePosition = schmueckeBaum.length - i - 2;
            if (erstePosition >= 0)
                schmueckeBaum[i][erstePosition] = Weihnachtsbaum.KerzeAusgabe;

        }
        baum.setKosten(baum.getKosten() * 1.25);
    }

    public void schmueckeBaumkugel(Tannenbaum baum) {
        String[][] schmueckeBaumk = baum.getBaum();
        for (int i = 0; i < schmueckeBaumk.length; i++) {
            for (int j = 0; j < schmueckeBaumk[i].length; j++) {

                if (Weihnachtsbaum.SterneAusgabe.equals(schmueckeBaumk[i][j]) && j % 2 != 0) {
                    schmueckeBaumk[i][j] = Weihnachtsbaum.KugelAusgabe;
                }
            }
        }
        baum.setKosten(baum.getKosten() * 1.50);
    }

    public boolean leseBaum(int i, int j, String feld, String[][] baum) {

        if (baum[i][j] == feld) {

            return true;
        }
        return false;
    }
}
