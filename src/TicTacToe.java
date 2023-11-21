import java.util.*;
public class TicTacToe {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] spielfeld = new String[3][3];
        leeresSpielfeld(spielfeld);
        int tip1x;
        int tip1y;
        int tip2x;
        int tip2y;
        int spieler1counter=0;
        int spieler2counter=0;
        String entscheidung = "ja";
        String gesamtsieger = "";

        System.out.println("TicTacToe:\n");
        do{

            ausgabeSpielfeld(spielfeld);

            System.out.print("\nSpieler 1 geben Sie die x Koordinate ihres Kreuzes an: ");
            tip1x = sc.nextInt();
            System.out.print("Spieler 1 geben Sie die y Koordinate ihres Kreuzes an: ");
            tip1y = sc.nextInt();
            System.out.println();
            spielfeld[tip1x-1][tip1y-1] = "[X]";

            if(gewinnBedingung(spielfeld,"[X]")){

                spieler1counter++;
                System.out.println("Spieler 1 hat gewonnen! Jetzt steht es: (Spieler 1): "+spieler1counter+":"+spieler2counter+" :(Spieler 2)");
                System.out.println("Noch eine Runde? (ja/nein)");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if(entscheidung.equals("nein"))
                    break;
            }
            if(gewinnBedingung(spielfeld, "[O]")){

                spieler2counter++;
                System.out.println("Spieler 2 hat gewonnen! Jetzt steht es: (Spieler 1): "+spieler1counter+":"+spieler2counter+" :(Spieler 2)");
                System.out.println("Noch eine Runde? (ja/nein)");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if(entscheidung.equals("nein"))
                    break;
            }
            if(unentschiedenBedingung(spielfeld)){

                System.out.println("Unentschieden! Neues Spielfeld wird generiert:\n");
                leeresSpielfeld(spielfeld);

            }

            ausgabeSpielfeld(spielfeld);

            System.out.print("\nSpieler 2 geben Sie die x Koordinate ihres Kreises an: ");
            tip2x = sc.nextInt();
            System.out.print("Spieler 2 geben Sie die y Koordinate ihres Kreises an: ");
            tip2y = sc.nextInt();
            System.out.println();
            spielfeld[tip2x-1][tip2y-1] = "[O]";

            if(gewinnBedingung(spielfeld, "[X]")){

                spieler1counter++;
                System.out.println("Spieler 1 hat gewonnen! Jetzt steht es: (Spieler 1): "+spieler1counter+":"+spieler2counter+" :(Spieler 2)");
                System.out.println("Noch eine Runde? (ja/nein)");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if(entscheidung.equals("nein"))
                    break;
            }
            if(gewinnBedingung(spielfeld, "[O]")){

                spieler2counter++;
                System.out.println("Spieler 2 hat gewonnen! Jetzt steht es: (Spieler 1): "+spieler1counter+":"+spieler2counter+" :(Spieler 2)");
                System.out.println("Noch eine Runde? (ja/nein)");
                entscheidung = sc.next();
                leeresSpielfeld(spielfeld);
                if(entscheidung.equals("nein"))
                    break;
            }
            if(unentschiedenBedingung(spielfeld)){

                System.out.println("Unentschieden! Neues Spielfeld wird generiert:\n");
                leeresSpielfeld(spielfeld);

            }

        } while (true);


        if(spieler1counter==spieler2counter)
            System.out.println("Unentschieden! Der Gesamtpunktstand beträgt: (Spieler 1): "+spieler1counter+":"+spieler2counter+" :(Spieler 2)");

        else if(spieler1counter>spieler2counter) {
            gesamtsieger = "Spieler 1";
            System.out.println("Der Gesamtsieg geht an " + gesamtsieger + ". Der Gesamtpunktstand beträgt: (Spieler 1): " + spieler1counter + ":" + spieler2counter + " :(Spieler 2)");
        }
        else if(spieler2counter>spieler1counter) {
            gesamtsieger = "Spieler 2";
            System.out.println("Der Gesamtsieg geht an " + gesamtsieger + ". Der Gesamtpunktstand beträgt: (Spieler 1): " + spieler1counter + ":" + spieler2counter + " :(Spieler 2)");
        }
    }


    public static void ausgabeSpielfeld(String[][] a) {

        for (int y = 0; y < a.length; y++) {

            for (int x = 0; x < a.length; x++) {

                System.out.printf("%3s \t", a[x][y]);

            }
            System.out.println("y" + (y + 1) + "\n");
        }
        System.out.println("x1 \t\tx2 \t\tx3");
    }

    public static void leeresSpielfeld(String[][] a){

        for (int y=0; y<a.length; y++){

            for (int x=0; x<a.length; x++) {

                a[x][y]="[ ]";

            }
        }
    }
    public static boolean gewinnBedingung(String[][] a, String b){

        if(     a[0][0].equals(b)&&a[0][1].equals(b)&&a[0][2].equals(b)||
                a[1][0].equals(b)&&a[1][1].equals(b)&&a[1][2].equals(b)||
                a[2][0].equals(b)&&a[2][1].equals(b)&&a[2][2].equals(b)||
                a[0][0].equals(b)&&a[1][0].equals(b)&&a[2][0].equals(b)||
                a[0][1].equals(b)&&a[1][1].equals(b)&&a[2][1].equals(b)||
                a[0][2].equals(b)&&a[1][2].equals(b)&&a[2][2].equals(b)||
                a[0][0].equals(b)&&a[1][1].equals(b)&&a[2][2].equals(b)||
                a[2][0].equals(b)&&a[1][1].equals(b)&&a[0][2].equals(b))
            return true;
        else
            return false;
    }

    public static boolean unentschiedenBedingung(String[][] a){

        if(!a[0][0].equals("[ ]")&&!a[0][1].equals("[ ]")&&!a[0][2].equals("[ ]")&&
           !a[1][0].equals("[ ]")&&!a[1][1].equals("[ ]")&&!a[1][2].equals("[ ]")&&
           !a[2][0].equals("[ ]")&&!a[2][1].equals("[ ]")&&!a[2][2].equals("[ ]"))
            return true;
        else
            return false;

    }

}
