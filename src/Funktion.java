import java.util.*;
public class Funktion {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(funktion(x));

    }

    public static double funktion(double x) {

        return x*x;

    }



}
