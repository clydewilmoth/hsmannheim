public class BinäreSuche {

    public static void main(String[] args) {
        int[] arr = {17, 4, 3, 8, 7, 2, 5, 9, 12, 25, 0, 6, 19, 16, 42, 21};

        arr = BubbleSort.bubbleSort(arr);

        int wo = binäreSuche(arr, 19);
        //		int wo = binäreSuche(new int[] {17}, 17);
        //		int wo = binäreSuche(new int[] {}, 1823);

        System.out.println(wo);
    }

    public static int binäreSuche(int[] zahlen, int gesucht) {

        int mitte = 0;
        int anfang = 0;
        int ende = zahlen.length -1;
        do {
            if (anfang > ende)
                return -1;

            mitte = (anfang + ende) / 2;

            if (gesucht < zahlen[mitte])
                ende = mitte - 1;
            else
                anfang = mitte + 1;

        } while(zahlen[mitte] != gesucht);

        return mitte;
    }

}