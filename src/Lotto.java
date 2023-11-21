import java.util.*;
public class Lotto {

    public static void main (String[] args){

        System.out.println("Willkommen zum Lottospiel 6aus49!");
        Scanner sc = new Scanner(System.in);
        String entscheidung = "0";
        do {
            int[] zahlentips = new int[6];
            for (int i = 0; i < zahlentips.length; i++) {

                System.out.println("\nGeben Sie ihren Tip Nummer: " + (i + 1) + " ein. (Zwischen 1 und 49/Jede Zahl kann nur einmal ausgelost werden/mit Enter bestätigen)");
                zahlentips[i] = sc.nextInt();

            }

            System.out.println("\nGeben Sie ihre Zusatzzahl ein. (Aus den verbleibenden 43 Zahlen die Zusatzzahlzahl wählen/mit Enter bestätigen)");
            int zusatzzahl = sc.nextInt();

            System.out.print("\nDie Zufallszahlen sind: ");
            int[] zufallszahlen = new int[6];

            do zufallszahlen[0] = (int) (Math.random() * 49) + 1;
            while(zufallszahlen[0] == zufallszahlen[1]||
                    zufallszahlen[0] == zufallszahlen[2]||
                    zufallszahlen[0] == zufallszahlen[3]||
                    zufallszahlen[0] == zufallszahlen[4]||
                    zufallszahlen[0] == zufallszahlen[5]);

            do zufallszahlen[1] = (int) (Math.random() * 49) + 1;
            while(zufallszahlen[1] == zufallszahlen[0]||
                    zufallszahlen[1] == zufallszahlen[2]||
                    zufallszahlen[1] == zufallszahlen[3]||
                    zufallszahlen[1] == zufallszahlen[4]||
                    zufallszahlen[1] == zufallszahlen[5]);

            do zufallszahlen[2] = (int) (Math.random() * 49) + 1;
            while(zufallszahlen[2] == zufallszahlen[1]||
                    zufallszahlen[2] == zufallszahlen[0]||
                    zufallszahlen[2] == zufallszahlen[3]||
                    zufallszahlen[2] == zufallszahlen[4]||
                    zufallszahlen[2] == zufallszahlen[5]);

            do zufallszahlen[3] = (int) (Math.random() * 49) + 1;
            while(zufallszahlen[3] == zufallszahlen[1]||
                    zufallszahlen[3] == zufallszahlen[2]||
                    zufallszahlen[3] == zufallszahlen[0]||
                    zufallszahlen[3] == zufallszahlen[4]||
                    zufallszahlen[3] == zufallszahlen[5]);

            do zufallszahlen[4] = (int) (Math.random() * 49) + 1;
            while(zufallszahlen[4] == zufallszahlen[1]||
                    zufallszahlen[4] == zufallszahlen[2]||
                    zufallszahlen[4] == zufallszahlen[3]||
                    zufallszahlen[4] == zufallszahlen[0]||
                    zufallszahlen[4] == zufallszahlen[5]);

            do zufallszahlen[5] = (int) (Math.random() * 49) + 1;
            while(zufallszahlen[5] == zufallszahlen[1]||
                    zufallszahlen[5] == zufallszahlen[2]||
                    zufallszahlen[5] == zufallszahlen[3]||
                    zufallszahlen[5] == zufallszahlen[4]||
                    zufallszahlen[5] == zufallszahlen[0]);


            for (int n = 0; n < zufallszahlen.length; n++)
                System.out.print(zufallszahlen[n]+" ");

            int zufallszusatzzahl;
            do zufallszusatzzahl = (int) (Math.random() * 49) + 1;
            while(zufallszusatzzahl == zufallszahlen[1]||
                    zufallszusatzzahl == zufallszahlen[2]||
                    zufallszusatzzahl == zufallszahlen[3]||
                    zufallszusatzzahl == zufallszahlen[4]||
                    zufallszusatzzahl == zufallszahlen[5]||
                    zufallszusatzzahl == zufallszahlen[0]);
            System.out.print("\nDie Zusatzzahl ist: " + zufallszusatzzahl);

            int richtigezahlen = 0;
            String zusatzzahlwert = "0";

            for (int t = 0; t < zufallszahlen.length; t++) {

                if (zahlentips[0] == zufallszahlen[t]||
                        zahlentips[1] == zufallszahlen[t]||
                        zahlentips[2] == zufallszahlen[t]||
                        zahlentips[3] == zufallszahlen[t]||
                        zahlentips[4] == zufallszahlen[t]||
                        zahlentips[5] == zufallszahlen[t]) {

                    richtigezahlen++;

                } else if (zusatzzahl == zufallszusatzzahl) {

                    richtigezahlen++;
                    zusatzzahlwert = "richtig";

                } else
                    zusatzzahlwert = "falsch";


            }
            System.out.println("\n\nSie haben von den Zahlen " + richtigezahlen + " richtig getippt und die Zusatzzahl ist " + zusatzzahlwert);
            System.out.println("Möchten Sie weiterspielen?(ja/nein)");
            entscheidung = sc.next();
        } while (entscheidung.equals("ja"));
        sc.close();
    }

}
