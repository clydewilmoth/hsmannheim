public class GrößteZahl {

    public static void main(String[] args){

        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random()*100+1);

        int größteZahl = arr[0];
        int kleinsteZahl = arr[0];
        int größteStelle = 0;
        int kleinsteStelle = 0;

        for (int i = 0; i<arr.length; i++) {
            if (größteZahl < arr[i]) {
                größteZahl = arr[i];
                größteStelle = i;
            }
            if (kleinsteZahl > arr[i]) {
                kleinsteZahl = arr[i];
                kleinsteStelle = i;
            }
        }

        System.out.println("Größte Zahl: " + größteZahl + " an der Stelle: "+größteStelle+"\nKleinste Zahl: " + kleinsteZahl + " an der Stelle: "+ kleinsteStelle);

    }

}
