import java.util.ArrayList;
import java.util.Arrays;

public class BitShiftÜbung {

    public static void main(String[] args){

        System.out.println(buchstabenZuString('a', 'b', 'G', 't', 'J')); //1
        int zahl = 42 << 1;
        System.out.println(zahl);
        zahl = zahl >> 2;
        System.out.println(zahl); //2
        System.out.println(dezimalZuBit(32455));
        System.out.println(12837654&255);//3
        System.out.println(Arrays.toString(arrayVervierfachen(new int[]{2,3,4,2,3,6,87,45634,345})));//4
    }

    public static String buchstabenZuString(char... buchstaben){
        String buchstabenkette = "";

        for(char buchstabe : buchstaben)
            buchstabenkette += buchstabe;

        return buchstabenkette;
    }

    public static String dezimalZuBit(int zahl){
        String zahlString = "" + zahl;
        ArrayList<Integer> stellenListe = new ArrayList<>(zahlString.length());
        String bitZahl = "";

        do{
            stellenListe.add(zahl%2);
            zahl = zahl/2;
        } while(zahl != 0);

        for(int i=stellenListe.size(); i>0; i--)
            bitZahl += stellenListe.get(i-1);

        return bitZahl;
    }

    public static int[] arrayVervierfachen(int[] arr){
        int[] arrVervierfacht= new int[arr.length];
        int x = 0;
        for(int i : arr){

            arrVervierfacht[x] = i<<2;
            x++;
        }
      return arrVervierfacht;
    }
}
