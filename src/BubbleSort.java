import java.util.Arrays;

public class BubbleSort {
	/*

		 ,--.!,
 	  __/   -*-
	,d08b.  '|`
	0088MM     
	`9MMP'     

			hjm (http://www.ascii-art.de/ascii/ab/bomb.txt)

	 */

    // Your mission, should you chose to accept it is to implement
    // a simple Bubblesort algorithm.

    public static void main(String[] args) {

//		int[] arr = {1,2,3,4,5,6,7,8};					// best case
        int[] arr = {17, 4, 3, 8, 7, 2, 5, 9, 12};        // *some* average case
//		int[] arr = {17, 8, 6, 5, 4, 3, 2, 1};			// worst case
    }
    public static int[] BubbleSort(int[] arr){

        int zähler = 0;
        boolean sortiert;
        do {
            sortiert = true;

            for (int x = 0; x < arr.length-1; x++) {
                if (arr[x] > arr[x+1]) {
                    swap(arr, x, x+1);
                    sortiert = false;
                }

                zähler++;
            } // for

        } while(!sortiert);


        System.out.println(Arrays.toString(arr));
        System.out.println(zähler);

        return arr;

    }

    public static void swap(int[] brr, int ei, int zi ) {
        int merker = brr[ei];
        brr[ei] = brr[zi];
        brr[zi] = merker;
    }

}