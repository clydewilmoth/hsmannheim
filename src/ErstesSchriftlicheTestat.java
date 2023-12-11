import java.util.*;

public class ErstesSchriftlicheTestat {

    public static void main(String[] args){
        System.out.println(längeLängsterString(new String[]{"12345","23456","123456789"}));
        System.out.println(buchstabenArrayBefüllen(5)[0][0]);
        einerStellenZähler(213,4325,63549,2345,64787,68456,2340,12314,4579780,6784,234532,2137865,231);
        System.out.println(primZahlTest(52));
        System.out.println(primzahlListe(500));
    }

    public static int längeLängsterString(String[] arr){
        int längeLängsterStringZahl = 0;
        for(String i : arr){
            if(i.length()>längeLängsterStringZahl)
                längeLängsterStringZahl = i.length();
        }
        return längeLängsterStringZahl;
    }
    public static char[][] buchstabenArrayBefüllen(int größe){

        char[][] buchstabenArray = new char[größe][größe];
        for(int i = 0; i< buchstabenArray.length; i++)
            for (int t = 0; t< buchstabenArray.length; t++)
                buchstabenArray[i][t] = (char)((int) (Math.random()* 26+ 'A'));
        return buchstabenArray;
    }
    public static void einerStellenZähler(int... zahlen){
        int nullerCounter =0;
        int einserCounter =0;
        int zweierCounter =0;
        int dreierCounter =0;
        int viererCounter =0;
        int fünferCounter =0;
        int sechserCounter =0;
        int siebenerCounter =0;
        int achterCounter =0;
        int neunerCounter =0;

        for(int i = 0; i<zahlen.length;i++)
            switch(zahlen[i]%10){
                case 0: nullerCounter++;
                break;
                case 1: einserCounter++;
                break;
                case 2: zweierCounter++;
                break;
                case 3: dreierCounter++;
                break;
                case 4: viererCounter++;
                break;
                case 5: fünferCounter++;
                break;
                case 6: sechserCounter++;
                break;
                case 7: siebenerCounter++;
                break;
                case 8: achterCounter++;
                break;
                case 9: neunerCounter++;
            }

        System.out.println("0: "+ nullerCounter+ " mal; 1: "+ einserCounter+ " mal; 2: "+ zweierCounter+ " mal; 3: "+ dreierCounter
                + " mal; 4: "+ viererCounter+ " mal; 5: "+ fünferCounter+ " mal; 6: "+ sechserCounter+ " mal; 7: "+ siebenerCounter
                + " mal; 8: "+ achterCounter+ " mal; 9: "+ neunerCounter+ " mal");
    }
    public static boolean primZahlTest(int zahl){
        if(zahl<=1)
            return false;
        for(int i = 2; i<zahl; i++){
            if(zahl%i==0)
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> primzahlListe(int grenze){
        ArrayList<Integer> liste = new ArrayList<>(grenze);
        for(int i = 2; i<grenze+1; i++)
            liste.add(i);
        for(int t = 0; t< liste.size(); t++)
            for(int x = 2; x< liste.size(); x++) {
                liste.remove(Integer.valueOf(liste.get(t) * x));
            }
        return liste;
    }//bonus
}
