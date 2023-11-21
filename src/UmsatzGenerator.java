import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UmsatzGenerator {

    public static void main(String[] args) throws Exception {
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