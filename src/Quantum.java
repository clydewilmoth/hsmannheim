import java.util.*;
public class Quantum {

    public static void main (String[] args){

        System.out.println("Willkommen beim Spiel Zahlenraten! Mein Name ist Quantum. Ich bin eine Künstliche Intelligenz." +
                            "\nIch habe eine Zahl zwischen 1 und 100 gewählt. Kannst du sie in 10 Versuchen erraten?");

        Scanner sc = new Scanner(System.in);
        int tip;
        int random;
        int[] liste = new int[6];
        int versuche = 0;
        String entscheidung = "nein";
        int deinepunkte = 0;
        int punkteai = 0;
        boolean wiederholen = false;

        do {

            random = (int) (Math.random() * 100 + 1);
            versuche = 0;

            do {

                System.out.print("Dein Tip: ");
                tip = sc.nextInt();

                liste[versuche] = tip;

                if (versuche == 5) {

                    punkteai++;
                    System.out.println("Du hast verloren! Diese Runde geht an mich (Du) " + deinepunkte + ":" + punkteai +
                                       " (Quantum). Ich hatte mir die " + random + " ausgesucht" + "\nDeine letzten Versuche waren:");

                    for (int n = 0; n <= versuche; n++) {

                        System.out.print(liste[n] + " ");

                    }

                    System.out.print("\nMöchtest du noch einmal spielen? (ja/nein): ");
                    entscheidung = sc.next();

                    if(entscheidung.equals("ja")) {

                        System.out.println("\nIch habe eine neue Zahl gewählt. Viel Glück!");
                        break;
                    } else
                        break;

                }

                if (tip != random) {

                    if (tip > random)
                        System.out.println("Zu hoch! Versuche es erneut.");

                    if (tip < random)
                        System.out.println("Zu niedrig! Versuche es erneut.");

                    entscheidung = "ja";
                    wiederholen = true;

                } else {

                    deinepunkte++;
                    System.out.println("Herzlichen Glückwunsch! Diese Runde geht an dich (Du) " + deinepunkte + ":" + punkteai +
                            " (Quantum). Du hast die Zahl in " + (versuche + 1) + " Versuchen erraten.\n" +
                            "Deine letzten Versuche waren: ");
                    for (int n = 0; n <= versuche; n++) {

                        System.out.print(liste[n] + " ");

                    }

                    System.out.print("\nMöchtest du noch einmal spielen? (ja/nein): ");
                    entscheidung = sc.next();

                    if(entscheidung.equals("ja")) {

                        System.out.println("\nIch habe eine neue Zahl gewählt. Viel Glück!");
                        wiederholen = false;
                    } else
                        break;

                }
                versuche ++;
            } while (wiederholen);

            wiederholen = true;

        } while (entscheidung.equals("ja"));

    }

}
