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
    static ArrayList<Double> Preis = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        ArrayList<String> datei1 = new ArrayList<>();
        ArrayList<String> datei2 = new ArrayList<>();
        ArrayList<String> datei3 = new ArrayList<>();
        ArrayList<String> datei4 = new ArrayList<>();
        ArrayList<String> datei5 = new ArrayList<>();
        ArrayList<String> datei6 = new ArrayList<>();
        ArrayList<String> datei7 = new ArrayList<>();
        ArrayList<String> datei8 = new ArrayList<>();
        ArrayList<String> datei9 = new ArrayList<>();
        ArrayList<String> datei10 = new ArrayList<>();
        ArrayList<String> datei11 = new ArrayList<>();
        ArrayList<String> datei12 = new ArrayList<>();

        umsatzGenerator();

        addToList(datei1, "2019-1.csv");
        addToList(datei2, "2019-2.csv");
        addToList(datei3, "2019-3.csv");
        addToList(datei4, "2019-4.csv");
        addToList(datei5, "2019-5.csv");
        addToList(datei6, "2019-6.csv");
        addToList(datei7, "2019-7.csv");
        addToList(datei8, "2019-8.csv");
        addToList(datei9, "2019-9.csv");
        addToList(datei10, "2019-10.csv");
        addToList(datei11, "2019-11.csv");
        addToList(datei12, "2019-12.csv");


        System.out.println(Bestellung);
        System.out.println(Tag);
        System.out.println(Monat);
        System.out.println(Jahr);
        System.out.println(Standort);
        System.out.println(Kundennummer);
        System.out.println(Produkt);
        System.out.println(Anzahl);
        System.out.println(Preis);

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
    public static void addToList(ArrayList<String> datei, String path) throws FileNotFoundException {
        datei = readFile(path);
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
            Preis.add(Double.parseDouble(v[s][6]));
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

}