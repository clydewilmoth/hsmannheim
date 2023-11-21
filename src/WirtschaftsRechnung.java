import java.util.*;
import java.io.*;
public class WirtschaftsRechnung {

    public static void main(String[] args) throws FileNotFoundException {

        File daten1 = new File("ressources/2019-1.csv");
        Scanner eins = new Scanner(daten1);
        File daten2 = new File("ressources/2019-2.csv");
        Scanner zwei = new Scanner(daten2);
        File daten3 = new File("ressources/2019-3.csv");
        Scanner drei = new Scanner(daten3);
        File daten4 = new File("ressources/2019-4.csv");
        Scanner vier = new Scanner(daten4);
        File daten5 = new File("ressources/2019-5.csv");
        Scanner funf = new Scanner(daten5);
        File daten6 = new File("ressources/2019-6.csv");
        Scanner sechs = new Scanner(daten6);
        File daten7 = new File("ressources/2019-7.csv");
        Scanner sieben = new Scanner(daten7);
        File daten8 = new File("ressources/2019-8.csv");
        Scanner acht = new Scanner(daten8);
        File daten9 = new File("ressources/2019-9.csv");
        Scanner neun = new Scanner(daten9);
        File daten10 = new File("ressources/2019-10.csv");
        Scanner zehn = new Scanner(daten10);
        File daten11 = new File("ressources/2019-11.csv");
        Scanner elf = new Scanner(daten11);
        File daten12 = new File("ressources/2019-12.csv");
        Scanner zwolf = new Scanner(daten12);

        String var1 = "";
        String[] var11 = new String[7];
        String[] var12 = new String[245];
        String[] var13 = new String[245];
        String[] var14 = new String[245];
        String[] var15 = new String[245];
        String[] var16 = new String[245];
        String[] var17 = new String[245];
        String[] var18 = new String[245];


        int n=0;

        while(eins.hasNextLine()) {

            var1 = eins.next();
            var11 = var1.split(",");
            var12[n] = var11[0];
            var13[n] = var11[1];
            var14[n] = var11[2];
            var15[n] = var11[3];
            var16[n] = var11[4];
            var17[n] = var11[5];
            var18[n] = var11[6];
            n++;

        }
    }

}
