import java.util.*;
public class KleinesEinmalEins {

    public static void main (String[] args){

        int[][] array = new int[11][11];

        for (int n=1; n<=10; n++){


            for (int i=1; i<=10; i++){

                array[n][i] = n*i;
                System.out.print(n + " \t*\t " + i + " \t=  " + (i*n) + " \t| ");

            }
            System.out.println();

        }

    }

}
