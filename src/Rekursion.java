import java.util.*;
public class Rekursion {
    public static void main (String[] args){

        System.out.println(fakultät(3));

        String buchstaben = "a b c d e f g h i j k l m n o p q r s t u v w x y z z z z z z z z z z z z";
        ArrayList<String> alphabet = new ArrayList<>();
        int z=0;
            for(int i=0; i<10; i++){
                for(int n=z; n<fibonacciReihe(i); n++) {
                    alphabet.add(buchstaben.split(" ")[n]);
                    z++;
                }
                System.out.println(alphabet);
                alphabet.clear();
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
