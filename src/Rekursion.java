import java.util.*;
public class Rekursion {
    public static void main (String[] args){

        System.out.println(fakultät(3));

        String buchstaben = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] alphabet = buchstaben.split(" ");

        int z=0;
        outer: for(int y=0; y<10; y++){
            for(int x=z; x<fibonacciReihe(y); x++) {
                if(alphabet[x].equals("z"))
                    break outer;
                System.out.print(alphabet[fibonacciReihe(x)]+" ");
                z++;
            }
            /*for(int n=0; n<alphabet.length; n++) {
                System.out.print(alphabet[n]+" ");
            }*/
            System.out.println();
        }
    }

    public static long fakultät(int zähler){

        if(zähler==0)
            return 1;
        else
            return zähler * fakultät(zähler-1);

    } //direkte Rekursion

    public static int fibonacciReihe(int zähler){

        if(zähler==0)
            return 0;
        else if(zähler==1)
            return 1;
        else
            return fibonacciReihe(zähler - 1) + fibonacciReihe(zähler - 2);
    }
}
