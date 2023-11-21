import java.util.Scanner;

public class VierGewinnt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tipRot;
        int tipBlau;
        String[][] spielfeld = new String[6][7];
        int spielerRotCounter = 0;
        int spielerBlauCounter = 0;
        String entscheidung = "ja";
        String gesamtsieger = "";
        String spielerRot;
        String spielerBlau;
        System.out.println("4 GEWINNT:\n");
        System.out.println("Wählen Sie ihren Spielmodus: \n1. Einzelspieler gegen KI (Omar Masari)\n2. Lokaler Mehrspielermodus");
        String spielmodus = sc.nextLine();
        int spielmoduss = Integer.parseInt(spielmodus);
        if (spielmoduss == 1) {
            System.out.print("\nName Spieler 1 (mit Enter bestätigen): ");
            spielerRot = sc.nextLine();
            spielerBlau = "Omar Masari";
        } else {
            System.out.print("\nName Spieler 1 (mit Enter bestätigen): ");
            spielerRot = sc.nextLine();
            System.out.print("Name Spieler 2 (mit Enter bestätigen): ");
            spielerBlau = sc.nextLine();
        }
        String[] anfangsbuchstabeSpielerRot = spielerRot.split("");
        String[] anfangsbuchstabeSpielerBlau = spielerBlau.split("");

        if (anfangsbuchstabeSpielerRot[0].equals(anfangsbuchstabeSpielerBlau[0])) {

            anfangsbuchstabeSpielerRot[0] = anfangsbuchstabeSpielerRot[0] + "1";
            anfangsbuchstabeSpielerBlau[0] = anfangsbuchstabeSpielerBlau[0] + "2";

        }

        leeresSpielfeld(spielfeld);
        spielfeldAusgabe(spielfeld);

        while (spielmoduss == 1) {

            System.out.print(spielerRot + " geben Sie die Spalte des einzuwerfenden Spielsteins ein: ");
            tipRot = sc.nextInt();

            outer:
            for (int n = 0; n < spielfeld.length; n++) {
                for (int i = 0; i <= spielfeld.length; i++) {
                    if (spielfeld[i][tipRot - 1].equals("[ ]")) {
                        spielfeld[i][tipRot - 1] = "[" + anfangsbuchstabeSpielerRot[0] + "]";
                        break outer;
                    }
                }
            }
            spielfeldAusgabe(spielfeld);
            if (gewinnBedingung(spielfeld, "[" + anfangsbuchstabeSpielerRot[0] + "]")) {

                spielerRotCounter++;
                System.out.println(spielerRot + " hat gewonnen! Der Zwischenstand beträgt: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");
                System.out.println("Möchten Sie noch eine Runde spielen (ja/nein)?");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if (entscheidung.equals("nein") || entscheidung.equals("Nein"))
                    break;
                else {
                    spielfeldAusgabe(spielfeld);
                    continue;
                }
            }
            if (unentschiedenBedingung(spielfeld)) {
                System.out.println("Unentschieden! Neues Spielfeld wird generiert: \n");
                leeresSpielfeld(spielfeld);
                spielfeldAusgabe(spielfeld);
                continue;
            }

            tipBlau = (int) (Math.random() * 7 + 1);
            while (!(spielfeld[5][tipBlau - 1].equals("[ ]"))) {

                tipBlau = (int) (Math.random() * 7 + 1);

            }
            System.out.print(spielerBlau + " entscheidet sich für die Spalte " + tipBlau + "!" + "\n");

            outer:
            for (int n = 0; n < spielfeld.length; n++) {
                for (int i = 0; i <= spielfeld.length; i++) {
                    if (spielfeld[i][tipBlau - 1].equals("[ ]")) {
                        spielfeld[i][tipBlau - 1] = "[" + anfangsbuchstabeSpielerBlau[0] + "]";
                        break outer;
                    }
                }
            }
            spielfeldAusgabe(spielfeld);
            if (gewinnBedingung(spielfeld, "[" + anfangsbuchstabeSpielerBlau[0] + "]")) {

                spielerBlauCounter++;
                System.out.println(spielerBlau + " hat gewonnen! Der Zwischenstand beträgt: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");
                System.out.println("Möchten Sie noch eine Runde spielen (ja/nein)?");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if (entscheidung.equals("nein") || entscheidung.equals("Nein"))
                    break;
                else {
                    spielfeldAusgabe(spielfeld);
                    continue;
                }
            }
            if (unentschiedenBedingung(spielfeld)) {
                System.out.println("Unentschieden! Neues Spielfeld wird generiert: \n");
                leeresSpielfeld(spielfeld);
                spielfeldAusgabe(spielfeld);
                continue;
            }
        }

        while (spielmoduss == 2) {

            System.out.print(spielerRot + " geben Sie die Spalte des einzuwerfenden Spielsteins ein: ");
            tipRot = sc.nextInt();

            outer:
            for (int n = 0; n < spielfeld.length; n++) {
                for (int i = 0; i <= spielfeld.length; i++) {
                    if (spielfeld[i][tipRot - 1].equals("[ ]")) {
                        spielfeld[i][tipRot - 1] = "[" + anfangsbuchstabeSpielerRot[0] + "]";
                        break outer;
                    }
                }
            }
            spielfeldAusgabe(spielfeld);
            if (gewinnBedingung(spielfeld, "[" + anfangsbuchstabeSpielerRot[0] + "]")) {

                spielerRotCounter++;
                System.out.println(spielerRot + " hat gewonnen! Der Zwischenstand beträgt: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");
                System.out.println("Möchten Sie noch eine Runde spielen (ja/nein)?");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if (entscheidung.equals("nein") || entscheidung.equals("Nein"))
                    break;
                else {
                    spielfeldAusgabe(spielfeld);
                    continue;
                }
            }
            if (unentschiedenBedingung(spielfeld)) {
                System.out.println("Unentschieden! Neues Spielfeld wird generiert: \n");
                leeresSpielfeld(spielfeld);
                spielfeldAusgabe(spielfeld);
                continue;
            }
            System.out.print(spielerBlau + " geben Sie die Spalte des einzuwerfenden Spielsteins ein: ");
            tipBlau = sc.nextInt();

            outer:
            for (int n = 0; n < spielfeld.length; n++) {
                for (int i = 0; i <= spielfeld.length; i++) {
                    if (spielfeld[i][tipBlau - 1].equals("[ ]")) {
                        spielfeld[i][tipBlau - 1] = "[" + anfangsbuchstabeSpielerBlau[0] + "]";
                        break outer;
                    }
                }
            }
            spielfeldAusgabe(spielfeld);
            if (gewinnBedingung(spielfeld, "[" + anfangsbuchstabeSpielerBlau[0] + "]")) {

                spielerBlauCounter++;
                System.out.println(spielerBlau + " hat gewonnen! Der Zwischenstand beträgt: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");
                System.out.println("Möchten Sie noch eine Runde spielen (ja/nein)?");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if (entscheidung.equals("nein") || entscheidung.equals("Nein"))
                    break;
                else {
                    spielfeldAusgabe(spielfeld);
                    continue;
                }
            }
            if (unentschiedenBedingung(spielfeld)) {
                System.out.println("Unentschieden! Neues Spielfeld wird generiert: \n");
                leeresSpielfeld(spielfeld);
                spielfeldAusgabe(spielfeld);
                continue;
            }
        }
        if (spielerRotCounter > spielerBlauCounter) {
            gesamtsieger = spielerRot;
            System.out.println("\nDer Gesamtsieger ist " + gesamtsieger + " mit: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");
        } else if (spielerRotCounter < spielerBlauCounter) {
            gesamtsieger = spielerBlau;
            System.out.println("\nDer Gesamtsieger ist " + gesamtsieger + " mit: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");
        } else
            System.out.println("\nUnentschieden! mit: (" + spielerRot + "): " + spielerRotCounter + ":" + spielerBlauCounter + " :(" + spielerBlau + ")");

    }

    public static void spielfeldAusgabe(String[][] a) {
        System.out.println();
        for (int n = 5; n >= 0; n--) {

            for (int i = 0; i <= a.length; i++) {

                System.out.printf("%3s \t", a[n][i]);

            }
            System.out.println("\n");
        }
        System.out.println("\n[1] \t[2] \t[3] \t[4] \t[5] \t[6] \t[7]\n");
    }

    public static void leeresSpielfeld(String[][] a) {

        for (int y = 0; y <= a.length; y++) {

            for (int x = 0; x < a.length; x++) {

                a[x][y] = "[ ]";

            }
        }
    }

    public static boolean gewinnBedingung(String[][] a, String b) {

        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < 6; i++) {
                if (a[i][n].equals(b) && a[i][n + 1].equals(b) && a[i][n + 2].equals(b) && a[i][n + 3].equals(b))
                    return true;
            }
        }

        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < 3; i++) {
                if (a[i][n].equals(b) && a[i + 1][n + 1].equals(b) && a[i + 2][n + 2].equals(b) && a[i + 3][n + 3].equals(b))
                    return true;
            }
        }

        for (int n = 6; n > 2; n--) {
            for (int i = 0; i < 3; i++) {
                if (a[i][n].equals(b) && a[i + 1][n - 1].equals(b) && a[i + 2][n - 2].equals(b) && a[i + 3][n - 3].equals(b))
                    return true;
            }
        }

        for (int n = 0; n < 7; n++) {
            for (int i = 0; i < 3; i++) {
                if (a[i][n].equals(b) && a[i + 1][n].equals(b) && a[i + 2][n].equals(b) && a[i + 3][n].equals(b))
                    return true;
            }
        }
        return false;
    }

    public static boolean unentschiedenBedingung(String[][] a) {

        return (!a[0][0].equals("[ ]") && !a[1][0].equals("[ ]") && !a[2][0].equals("[ ]") &&
                !a[3][0].equals("[ ]") && !a[4][0].equals("[ ]") && !a[5][0].equals("[ ]") &&
                !a[0][1].equals("[ ]") && !a[1][1].equals("[ ]") && !a[2][1].equals("[ ]") &&
                !a[3][1].equals("[ ]") && !a[4][1].equals("[ ]") && !a[5][1].equals("[ ]") &&
                !a[0][2].equals("[ ]") && !a[1][2].equals("[ ]") && !a[2][2].equals("[ ]") &&
                !a[3][2].equals("[ ]") && !a[4][2].equals("[ ]") && !a[5][2].equals("[ ]") &&
                !a[0][3].equals("[ ]") && !a[1][3].equals("[ ]") && !a[2][3].equals("[ ]") &&
                !a[3][3].equals("[ ]") && !a[4][3].equals("[ ]") && !a[5][3].equals("[ ]") &&
                !a[0][4].equals("[ ]") && !a[1][4].equals("[ ]") && !a[2][4].equals("[ ]") &&
                !a[3][4].equals("[ ]") && !a[4][4].equals("[ ]") && !a[5][4].equals("[ ]") &&
                !a[0][5].equals("[ ]") && !a[1][5].equals("[ ]") && !a[2][5].equals("[ ]") &&
                !a[3][5].equals("[ ]") && !a[4][5].equals("[ ]") && !a[5][5].equals("[ ]") &&
                !a[0][6].equals("[ ]") && !a[1][6].equals("[ ]") && !a[2][6].equals("[ ]") &&
                !a[3][6].equals("[ ]") && !a[4][6].equals("[ ]") && !a[5][6].equals("[ ]"));

    }

}