import java.util.*;
import java.io.*;
public class WirtschaftsRechnung {
    static ArrayList<String> Bestellung = new ArrayList<>();
    static ArrayList<Integer> Tag = new ArrayList<>();
    static ArrayList<Integer> Monat = new ArrayList<>();
    static ArrayList<Integer> Jahr = new ArrayList<>();
    static ArrayList<String> Standort = new ArrayList<>();
    static ArrayList<String> Kundennummer = new ArrayList<>();
    static ArrayList<String> Produkt = new ArrayList<>();
    static ArrayList<Integer> Anzahl = new ArrayList<>();
    static ArrayList<Float> Preis = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        float umsatzJahr = 0;

        umsatzGenerator();

        for (int i = 1; i <= 12; i++)
            addToList("2019-"+i+".csv");
        for (int i = 1; i <= 12; i++)
            umsatzJahr += umsatzRechnerMonat(i);

        System.out.println("Der Gesamtumsatz in Jahr 2019 beträgt: "+umsatzJahr);

        System.out.println();
        System.out.println("Der Umsatz im Januar 2019 beträgt: "+umsatzRechnerMonat(1)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(1)*0.19));
        System.out.println("Der Umsatz im Februar 2019 beträgt: "+umsatzRechnerMonat(2)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(2)*0.19));
        System.out.println("Der Umsatz im März 2019 beträgt: "+umsatzRechnerMonat(3)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(3)*0.19));
        System.out.println("Der Umsatz im April 2019 beträgt: "+umsatzRechnerMonat(4)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(4)*0.19));
        System.out.println("Der Umsatz im Mai 2019 beträgt: "+umsatzRechnerMonat(5)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(5)*0.19));
        System.out.println("Der Umsatz im Juni 2019 beträgt: "+umsatzRechnerMonat(6)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(6)*0.19));
        System.out.println("Der Umsatz im Juli 2019 beträgt: "+umsatzRechnerMonat(7)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(7)*0.19));
        System.out.println("Der Umsatz im August 2019 beträgt: "+umsatzRechnerMonat(8)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(8)*0.19));
        System.out.println("Der Umsatz im September 2019 beträgt: "+umsatzRechnerMonat(9)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(9)*0.19));
        System.out.println("Der Umsatz im Oktober 2019 beträgt: "+umsatzRechnerMonat(10)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(10)*0.19));
        System.out.println("Der Umsatz im November 2019 beträgt: "+umsatzRechnerMonat(11)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(11)*0.19));
        System.out.println("Der Umsatz im Dezember 2019 beträgt: "+umsatzRechnerMonat(12)+
                " mit einer MwSt. von: "+(umsatzRechnerMonat(12)*0.19));

        System.out.println();
        System.out.println("Der Umsatz in Mannheim 2019 beträgt: "+umsatzRechnerStandort("Mannheim"));
        System.out.println("Der Umsatz in Heidelberg 2019 beträgt: "+umsatzRechnerStandort("Heidelberg"));
        System.out.println("Der Umsatz in Schwetzingen 2019 beträgt: "+umsatzRechnerStandort("Schwetzingen"));
        System.out.println("Der Umsatz in Speyer 2019 beträgt: "+umsatzRechnerStandort("Mannheim"));
        System.out.println("Der Umsatz in Neustadt 2019 beträgt: "+umsatzRechnerStandort("Neustadt"));

    }
    public static ArrayList<String> readFile(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        sc.close();

        return lines;
    }
    public static void addToList(String path) throws FileNotFoundException {
        ArrayList<String> datei = readFile(path);
        String[][] v = new String[datei.size()][7];
        int[][] t = new int[datei.size()][3];
        String[][] q = new String[datei.size()][3];
        int s = 0;

        for (String i : datei) {

            v[s] = i.split(",");
            q[s] = v[s][1].split("\\.");

            t[s][0] = Integer.parseInt(q[s][0]);
            t[s][1] = Integer.parseInt(q[s][1]);
            t[s][2] = Integer.parseInt(q[s][2]);

            Bestellung.add(v[s][0]);
            Tag.add(t[s][0]);
            Monat.add(t[s][1]);
            Jahr.add(t[s][2]);
            Standort.add(v[s][2]);
            Kundennummer.add(v[s][3]);
            Produkt.add(v[s][4]);
            Anzahl.add(Integer.parseInt(v[s][5]));
            Preis.add(Float.parseFloat(v[s][6]));
            s++;
        }
    }
    public static void umsatzGenerator() throws Exception {
        String[] standorte = {"Mannheim", "Heidelberg", "Schwetzingen", "Speyer", "Neustadt"};
        String[] produkte = {"Staubsaugerroboter", "NAO-Roboter", "Wischroboter", "Lego-Roboter", "Spielzeugroboter"};

        double[] preise = {398.95, 8400.0, 289.0, 129.90, 49.99};
        int counter = 1;

        String jahr = "2019";

        for (int i = 1; i <= 12; i++) {

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(  jahr + "-" + i + ".csv")));

            for (int j = 1; j < Math.random() * 500 + 200; j++) {
                int tag = (int) (Math.random() * 12 + 1);
                int standort = (int) (Math.random() * standorte.length);
                int produkt = (int) (Math.random() * produkte.length);
                int anzahl = (int) (Math.random() * 42 + 1);

                String knr = "" + (int) (Math.random() * 9999 + 1);
                String kunde = "K" + "0000".substring(knr.length()) + knr;


                String anr = "A" + jahr + "00000".substring((""+counter).length()) + counter;

                pw.println(anr + "," + tag + "." + i + ".2019," + standorte[standort] + "," + kunde + "," + produkte[produkt] + ","
                        + anzahl + "," + preise[produkt]);

                counter++;
            }

            pw.close();
        }

        System.out.println("done.");

    }
    public static float umsatzRechnerMonat(int monat){
        float umsatzProVerkauf;
        float umsatz = 0;
        for (int i = 0; i < Anzahl.size(); i++){

            if(Monat.get(i) == monat) {
                umsatzProVerkauf = Anzahl.get(i) * Preis.get(i);
                umsatz += umsatzProVerkauf;
            }
        }
        return umsatz;
    }
    public static float umsatzRechnerStandort(String standort){
        float umsatzProVerkauf;
        float umsatz = 0;
        for (int i = 0; i < Anzahl.size(); i++){

            if(Standort.get(i).equals(standort)) {
                umsatzProVerkauf = Anzahl.get(i) * Preis.get(i);
                umsatz += umsatzProVerkauf;
            }
        }
        return umsatz;
    }
}