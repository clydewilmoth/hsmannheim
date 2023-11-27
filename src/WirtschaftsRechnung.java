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

    public static void main(String[] args) throws FileNotFoundException {

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

        addToList(datei1, "src/ressources/2019-1.csv");
        addToList(datei2, "src/ressources/2019-2.csv");
        addToList(datei3, "src/ressources/2019-3.csv");
        addToList(datei4, "src/ressources/2019-4.csv");
        addToList(datei5, "src/ressources/2019-5.csv");
        addToList(datei6, "src/ressources/2019-6.csv");
        addToList(datei7, "src/ressources/2019-7.csv");
        addToList(datei8, "src/ressources/2019-8.csv");
        addToList(datei9, "src/ressources/2019-9.csv");
        addToList(datei10, "src/ressources/2019-10.csv");
        addToList(datei11, "src/ressources/2019-11.csv");
        addToList(datei12, "src/ressources/2019-12.csv");


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
    public static ArrayList<String> readFile(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        sc.close();

        return lines;
    }

}