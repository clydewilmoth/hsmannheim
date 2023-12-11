import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DatenklassenÜbung {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        GameCharacter Selim = new GameCharacter(99, 5, 40, 65, 9);
        GameCharacter Ruven = new GameCharacter(80, 15, 45, 75, 30);
        GameCharacter Paul = new GameCharacter(90, 40, 70, 25, 20);

        confidenceTest(Selim);

    }

    public static void confidenceTest(GameCharacter character){

        if(character.ppSize>20)
            System.out.println("Way tooooo confident! DAYUMM BOII! \n8===============D ----");
        else if(character.ppSize<=20&&character.ppSize>18)
            System.out.println("Prinzipiell zufrieden, aber man könnte sich mehr vorstellen o.O");
        else
            System.out.println("Unglaublich unzufrieden, vielleicht sollte man eine Penisverlängerung in Köln in Betracht ziehen :/");

    }

}
