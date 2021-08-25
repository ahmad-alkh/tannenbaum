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
public class Weihnachtsbaum {

    /**
     * TODO Comment
     * 
     * @param args
     */
    public static final String leerAusgabe = " ";
    public static final String SterneAusgabe = "X";
    public static final String KerzeAusgabe = "i";
    public static final String KugelAusgabe = "O";

    public static void main(String[] args) {
        new Weihnachtsbaum().interactor();
    }

    public void interactor() {
        WeihnachtsbaumVerkauf weihnachtsbaumVerkauf = new WeihnachtsbaumVerkauf();
        Tannenbaum baum = weihnachtsbaumVerkauf.holeBaum(11);
        BaumSchmuck ersteBaum = new BaumSchmuck();
        zeigeBaum(baum);
        ersteBaum.schmueckeBaumMitKerze(baum);
        zeigeBaum(baum);
        ersteBaum.schmueckeBaumkugel(baum);
        zeigeBaum(baum);
    }

    public void zeigeBaum(Tannenbaum baum) {
        System.out.println(baum.toString());
        System.out.println("Der Baum kostet: " + baum.getKosten() + "€");
    }
}
