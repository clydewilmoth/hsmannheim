import java.util.*;
public class Array {

    public static void main(String[] args){

        /*String s = "Enes Penis mobbt Sebastian Müller auf der Hauptschule";

        String[] worte = s.split(" ");

        Scanner sc = new Scanner(System.in);
        System.out.printf("Geben Sie die maximale quadratzahl ein: ");
        int i = sc.nextInt();

        int[] quadratzahl = new int[i];



        for (int n=0; n<quadratzahl.length; n++){

            quadratzahl[n] = (n+1)*(n+1);
            System.out.printf("%d^2 = ",n+1);
            System.out.println(quadratzahl[n]);

        }

        for (int n=0; n<worte.length; n++) {

            System.out.println(worte[n]);
        }*/


        int[] zahlen = new int[10];


        for (int n=0; n<zahlen.length; n++) {

            zahlen[n] = n + 1;
            System.out.println(zahlen[n]);

        }

        int[] zahlen2 = Arrays.copyOf(zahlen, 20);

        for (int n=0; n<zahlen2.length; n++) {

            System.out.println(zahlen2[n]);

        }


    }
}
