import java.util.*;

public class RunLengthEncodingKomprimierung {

    public static void main(String[] args){

        System.out.println(runLengthEncodingKomprimierung("ttaaaaaBBBBByyXXAXXXzzzzz"));

        char[][] test = charArrRandom(50);

        for(char[] i : test) {
            System.out.println();
            for (char t : i)
                System.out.println(t);
        }
        System.out.println();
        System.out.println(test(test,'B'));
        System.out.println(testRecursive(test,'B',0,1,1));

    }


    public static String runLengthEncodingKomprimierung(String input){

        int counter = 1;
        String result = "";

        for(int i = 1; i<input.length(); i++){

            if(input.charAt(i)!=input.charAt(i-1)) {
                if (counter == 1)
                    result += "" + input.charAt(i - 1);
                else
                    result += counter + "" + input.charAt(i - 1);
                counter = 1;
            }
            else if(input.charAt(i)==input.charAt(i-1))
                counter++;

            if(i==input.length()-1)
                result += counter + "" + input.charAt(i);

        }

        return result;
    }
    public static int test(char[][] arr, char wanted){
        int result = 0;

        for(char[] i : arr)
            for(char t : i)
                if(t == wanted)
                    result ++;

        return result;
    }
    public static int testRecursive(char[][] arr, char wanted, int counter, int row, int col){

        if(arr[row-1][col-1]==wanted)
            counter++;

        if(arr[row-1].length>col)
            return testRecursive(arr, wanted, counter, row, col+1);
        else if(arr.length>row) {
            col = 1;
            return testRecursive(arr, wanted, counter, row + 1, col);
        }
        return counter;
    }
    public static char[][] charArrRandom(int size){
        char[][] result = new char[size][size];

        for(int row = 0; row<result.length; row++)
            for(int col = 0; col<result[row].length; col++)
                result[row][col] = (char) ((int)(Math.random()*25 + 65));

        return result;
    }

}
