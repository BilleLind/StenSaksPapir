import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\tSten Saks Papir 1.0\n");
        System.out.println("-------------------------------");

        Haand andrács = Haand.PAPIR;
        Haand anders = Haand.SAKS;
        Haand karten = Haand.STEN;

        // her starter spillet
        StenSaksPapir runde1 = new StenSaksPapir();
        System.out.println(runde1.slag(andrács, anders));





        //Computer generee en hånd
        Haand computersHaand;
        int haandInt = (int) (Math.random()*3);
        computersHaand = Haand.values()[haandInt];
        if (haandInt == 0) { computersHaand = Haand.STEN;}
        if (haandInt == 1) { computersHaand = Haand.SAKS;}
        if (haandInt == 2) { computersHaand = Haand.PAPIR;}
        System.out.println("computeren slår " + computersHaand);

        //indløse spillerns hpnd
        Scanner scanner = new Scanner(System.in);
        Haand spillerensHaand =null;
        String spillerensString = scanner.next();
        if (spillerensString.equalsIgnoreCase("sten")) { spillerensHaand = Haand.STEN;}
        if (spillerensString.equalsIgnoreCase("saks")) { spillerensHaand = Haand.SAKS;}
        if (spillerensString.equalsIgnoreCase("papir")) { spillerensHaand = Haand.PAPIR;}
        System.out.println("Spiller slår " + spillerensHaand);

        // sammenligne med slag() metoden
        int resultat =runde1.slag(spillerensHaand, computersHaand);

        // udråbe en vinder
        System.out.println("resultatet er " + resultat);
        if (resultat ==0) {System.out.println("Uafgjort");}
        if (resultat==1) { System.out.println("Spiller vandt!");}
        if (resultat==2) { System.out.println("Spilleren Tabte :(");}
        if (resultat==-1) { System.out.println("Fejl");}

    }
    }

