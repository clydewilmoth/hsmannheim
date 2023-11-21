import java.util.*;
public class Matrix {

    public static void main(String[] args){

        int[][] matrix = {{3,5,8},{6,2,3},{4,1,0}};
        int[] vektor = {324,543,123};
        int[] ergebnis = new int[3];

        for(int n=0; n<matrix.length; n++) {

            ergebnis[n] = matrix[n][0] * vektor[0] + matrix[n][1] * vektor[1] + matrix[n][2] * vektor[2];
            System.out.println(ergebnis[n]);

        }

        int[][] einmalEins = new int[10][10];

        for(int n=0; n<einmalEins.length; n++){

            for(int i=0; i<einmalEins.length; i++){

                einmalEins[n][i] = (n+1)*(i+1);
                System.out.print(einmalEins[n][i]+"\t\t");

            }
            System.out.println();
        }

        int[] zahlen = new int[10];
        int summe = 0;
        int maxposition = 0;
        int minposition = 0;
        System.out.println();
        for(int i=0; i< zahlen.length; i++){

            zahlen[i] = (int) (Math.random()*200+1);
            System.out.println(zahlen[i]);

        }

        for(int i=0; i< zahlen.length; i++){

            summe = summe + zahlen[i];
        }
        int durchschnitt = summe / zahlen.length;
        System.out.println("\nSumme: "+summe);
        System.out.println("Durchschnitt: "+durchschnitt);

        for(int i=0; i< zahlen.length; i++){

            if(zahlen[maxposition]<zahlen[i])
                maxposition = i;
            if(zahlen[minposition]>zahlen[i])
                minposition = i;
        }

        System.out.println("Größte Zahl: "+zahlen[maxposition]+" an der Position: "+maxposition);
        System.out.println("Kleinste Zahl: "+zahlen[minposition]+" an der Position: "+minposition);

        String test = "Hallo ich bins der Otto!";
        int value = 5325462;
        String test2 = "" + value;
        String[] testArray = test.split("");
        String testUmgedreht = "";

        for(int n=testArray.length-1; n>=0; n--){

            testUmgedreht += testArray[n];
        }

        System.out.println(testUmgedreht);

        String[] testArray2 = test2.split("");
        String testUmgedreht2 = "";

        for(int n=testArray2.length-1; n>=0; n--){

            testUmgedreht2 += testArray2[n];
        }

        System.out.println(testUmgedreht2);

        for(int i = 0; i<vektor.length; i++) {
            System.out.print(BubbleSort.BubbleSort(vektor)[i]+" ");
        }

    }

}
