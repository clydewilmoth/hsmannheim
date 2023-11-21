import java.util.*;
public class Testat1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String passwort = "Pr1-2023!";
        String entscheidung;
        int falscheeingaben = 0;

        System.out.println("PASSWORTMANAGER by Selim");
        String[] altepassworte = new String[10];
        java.util.Arrays.fill(altepassworte, "Pr1-2023!");
        int i = 0;
        boolean b = false;
        boolean passwortokey1 = false;
        boolean passwortokey2 = false;
        boolean passwortokey3 = false;
        boolean passwortokey4 = false;
        boolean passwortokey5 = false;

        do {

            System.out.print("Geben Sie ihr aktuelles Passwort ein: ");
            String passworttip = sc.next();

            System.out.print("Geben Sie ihr aktuelles Passwort erneut ein: ");
            String passworttip2 = sc.next();


            if(passworttip.equals(passwort)&&passworttip2.equals(passwort)) {


                do {
                    System.out.print("\nGeben Sie ihr neues Passwort ein(Zwischen 8 und 16 Zeichen/Mindestens ein Großbuchstabe. mindestens ein Kleinbuchstabe und mindestens ein Sonderzeichen\n/Kein Leerzeichen/Passwort darf nicht mit den letzten 10 Passwörtern übereinstimmen): ");
                    passwort = sc.next();

                    for (int n=0; n<passwort.length(); n++) {
                        if (passwort.length()<8 || passwort.length()>16) {
                            passwortokey1 = true;
                            System.out.println("Ihr Passwort muss mindestens 8 und darf maximal 16 Zeichen enthalten!");
                            break;
                        }
                        if (passwort.charAt(n) == 32) {
                            passwortokey5 = true;
                            System.out.println("Sie dürfen keine Leerzeichen verwenden!");
                            break;
                        }

                        if (passwort.charAt(n) < 91 && passwort.charAt(n) > 64)
                            passwortokey2 = true;

                        if (passwort.charAt(n) < 123 && passwort.charAt(n) > 96)
                            passwortokey3 = true;

                        if (passwort.charAt(n) == 46 ||
                            passwort.charAt(n) == 44 ||
                            passwort.charAt(n) == 59 ||
                            passwort.charAt(n) == 63 ||
                            passwort.charAt(n) == 33)
                            passwortokey4 = true;

                    }

                    for (int z=0; z<altepassworte.length; z++) {
                        if (altepassworte[z].equals(passwort)) {
                            b = true;
                            break;
                        }
                    }

                    if (passwortokey1 || !passwortokey2 || !passwortokey3 || !passwortokey4 || passwortokey5 || b)
                        System.out.println("Bitte halten Sie sich an die Anweisungen für die Passwortvergabe!");

                } while (passwortokey1 || !passwortokey2 || !passwortokey3 || !passwortokey4 || passwortokey5 || b);

                System.out.print("Möchten Sie das Passwort erneut ändern?(ja/nein): ");
                entscheidung = sc.next();
                altepassworte[i] = passwort;
                i++;
                if(i==9)
                    i = 0;

            } else {
                System.out.print("Sie haben das Passwort mindestens einmal falsch eingegeben! Möchten Sie es erneut versuchen?(ja/nein): ");
                entscheidung = sc.next();
                falscheeingaben++;

                if (falscheeingaben==3) {
                    System.out.println("Sie haben das Passwort drei mal falsch eingegeben, damit wird das Programm gestoppt!");
                    break;
                }
            }

        } while (entscheidung.equals("ja"));
        sc.close();
    }
}
