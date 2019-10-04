import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir extends Main {

    public static void StarSpillet() {
        StenSaksPapir runde1 = new StenSaksPapir();

        int count =1;
        while (count >=1) {
        //indløse spillerns hånd
        Scanner scanner = new Scanner(System.in);
        System.out.println("runde " + count +"nu er det din tur, hvad slår du?");
        Haand spillerensHaand =null;
        String spillerensString = scanner.next();
        if (spillerensString.equalsIgnoreCase("sten")) { spillerensHaand = Haand.STEN;}
        if (spillerensString.equalsIgnoreCase("saks")) { spillerensHaand = Haand.SAKS;}
        if (spillerensString.equalsIgnoreCase("papir")) { spillerensHaand = Haand.PAPIR;}
        System.out.println("Spiller slår " + spillerensHaand);

        // her starter spillet

        //Computer generee en hånd
        Haand computersHaand;
        int haandInt = (int) (Math.random()*3);
        computersHaand = Haand.values()[haandInt];
        if (haandInt == 0) { computersHaand = Haand.STEN;}
        if (haandInt == 1) { computersHaand = Haand.SAKS;}
        if (haandInt == 2) { computersHaand = Haand.PAPIR;}
        System.out.println("computeren slår " + computersHaand);

        // sammenligne med slag() metoden
        int resultat =runde1.slag(spillerensHaand, computersHaand);

        // udråbe en vinder
        System.out.println("resultatet er " + resultat);
        if (resultat ==0) {System.out.println("Uafgjort");}
        if (resultat==1) { System.out.println("Spiller vandt!");}
        if (resultat==2) { System.out.println("Spilleren Tabte :(");}
        if (resultat==-1) { System.out.println("Fejl");}
    count++;} }

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
