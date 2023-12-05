public class GrößteZahl {

    public static void main(String[] args){

        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random()*100+1);
        String wörter = "Der neue Mercedes Benz AMG GT gehört zu den leistungsstärksten Autos der Welt";
        String[] wörterArr = wörter.split(" ");

        int größteZahl = arr[0];
        int kleinsteZahl = arr[0];
        int größteStelle = 0;
        int kleinsteStelle = 0;
        int maximaleBuchstabenlänge = wörterArr[0].length();
        String längstesWort = "";

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

        for(int i = 0; i< wörterArr.length; i++){
            if(maximaleBuchstabenlänge<wörterArr[i].length()) {
                maximaleBuchstabenlänge = wörterArr[i].length();
                längstesWort = wörterArr[i];
            }
        }

        System.out.println("Das längste Wort ist: \"" + längstesWort + "\" mit einer Länge von: "+maximaleBuchstabenlänge+" Buchstaben!");

    }

}
