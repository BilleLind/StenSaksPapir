import java.util.Random;

public class StenSaksPapir extends Main {

    /**
     * Hvis den første hånd vinder, returneres 1
     * hvis den anden hånd vinder, returneres 2
     * hvis uafgjort, returneres 0
     * hvis der er en fejl, så returnerer den -1
     */
    int slag(Haand a, Haand b) {
        int resultat = -1;
        if (a == Haand.STEN) {
            if (b == Haand.PAPIR) { resultat = 2; }
            if (b == Haand.STEN) { resultat = 0; }
            if (b == Haand.SAKS) { resultat = 1; }
        }
        else if (a == Haand.SAKS) {
            if (b == Haand.SAKS) { resultat = 0; }
            if (b == Haand.STEN) { resultat = 2; }
            if (b == Haand.PAPIR) { resultat = 1;}
        }
        else if (a == Haand.PAPIR) {
            if (b == Haand.STEN) { resultat = 1; }
            if (b == Haand.PAPIR) { resultat = 0; }
            if (b == Haand.SAKS) { resultat = 2;}
        } return resultat;
    }
}
