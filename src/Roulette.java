import java.util.*;

public class Roulette {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double spielkapital = 100;
		
		System.out.println("\n$$$ROULETTESIMULATOR$$$");
		do {
				
		int zufallszahl = (int) (Math.random() * 37);

		System.out.println("\nIhr Spielkapital beträgt: " + spielkapital);
		System.out.printf("Geben Sie ihren Einsatz ein: ");
		double einsatz = sc.nextDouble();
		while (einsatz>spielkapital) {
			System.out.printf("%nIhr Einsatz darf nicht höher als Ihr Spielkapital sein!");
			System.out.printf("%nGeben Sie ihren Einsatz ein: ");
			einsatz = sc.nextDouble();
		}
		
		System.out.println("\nWählen Sie ihren Spielmodus (Nummer des Spielmodus eingeben)\n\n"
				+ "1: Einzelne Zahl\n"
				+ "2: Erste oder zweite Hälfte der Zahlen\n"
				+ "3: Erstes, zweites oder drittes Drittel der Zahlen\n"
				+ "4: Erste, zweite oder dritte Spalte der Zahlen\n"
				+ "5: Gerade oder ungerade Zahlen\n"
				+ "6: Schwarze oder rote Zahlen");
		
		int spielmodus = sc.nextInt();
		
		
		if (spielmodus==1) {	
			System.out.printf("\nGeben Sie ihren Tip ein: ");
			int tip = sc.nextInt();
			
			System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
			
			if (tip==zufallszahl) {
				spielkapital = spielkapital + einsatz * 35;
				System.out.println("Sie haben gewonnen!");
			} else {
				spielkapital = spielkapital - einsatz;
				System.out.println("Sie haben verloren!");
			}
		} else if (spielmodus==2) {
			
			System.out.println("\nWählen Sie die erste oder zweite Hälfte? \n1: erste Hälfte\n2: zweite Hälfte");
			int tip = sc.nextInt();
			
			if (tip==1) {
				
				if (zufallszahl>=1 && zufallszahl<=18) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else {
				
				if (zufallszahl>=19 && zufallszahl<=36) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			}
			
			
		} else if (spielmodus==3) {
			
			System.out.println("\nWählen Sie das erste, zweite oder dritte Drittel? \n1: erstes Drittel\n2: zweites Drittel\n3: drittes Drittel");
			int tip = sc.nextInt();
			
			if (tip==1) {
				
				if (zufallszahl>=1 && zufallszahl<=12) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + 2 * einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else if (tip==2) {
				
				if (zufallszahl>=13 && zufallszahl<=24) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + 2 * einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else {
				
				if (zufallszahl>=25 && zufallszahl<=36) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + 2 * einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			}
			
			
		} else if (spielmodus==4) {
			
			System.out.println("\nWählen Sie die erste, zweite oder dritte Spalte? \n1: erste Spalte\n2: zweite Spalte\n3: dritte Spalte");
			int tip = sc.nextInt();
			
			if (tip==1) {
				
				if (zufallszahl%3==1) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + 2 * einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else if (tip==2) {
				
				if (zufallszahl%3==2) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + 2 * einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else {
				
				if (zufallszahl%3==0) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + 2 * einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			}
			
		} else if (spielmodus==5) {
			
			System.out.println("\nWählen Sie die geraden oder ungeraden Zahlen? \n1: gerade Zahlen\n2: ungerade Zahlen");
			int tip = sc.nextInt();
			
			if (tip==1) {
				
				if (zufallszahl%2==0) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else {
				
				if (zufallszahl%2==1) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			}
			
		} else {
			
			System.out.println("\nWählen Sie die schwarzen oder roten Zahlen? \n1: schwarze Zahlen\n2: rote Zahlen");
			int tip = sc.nextInt();
			
			if (tip==1) {
				
				if ((zufallszahl%2==0 && zufallszahl>=1 && zufallszahl<=10)||
						(zufallszahl%2==1 && zufallszahl>=11 && zufallszahl<=18)||
						(zufallszahl%2==0 && zufallszahl>=19 && zufallszahl<=28)||
						(zufallszahl%2==1 && zufallszahl>=29 && zufallszahl<=36)) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			} else {
				
				if ((zufallszahl%2==1 && zufallszahl>=1 && zufallszahl<=10)||
						(zufallszahl%2==0 && zufallszahl>=11 && zufallszahl<=18)||
						(zufallszahl%2==1 && zufallszahl>=19 && zufallszahl<=28)||
						(zufallszahl%2==0 && zufallszahl>=29 && zufallszahl<=36)) {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital + einsatz;
					System.out.println("Sie haben gewonnen!");
				} else {
					System.out.println("\nDie Zufallszahl beträgt: " + zufallszahl);
					spielkapital = spielkapital - einsatz;
					System.out.println("Sie haben verloren!");
				}
				
			}
			
		}
		
		
		if (spielkapital>0)
			System.out.println("\nIhr Spielkapital wurde zu: " + spielkapital + "\nMöchten Sie weiterspielen? ");
		
		else {
			System.out.println("\nSie haben kein Spielkapital mehr übrig, damit wäre das Spiel beendet.");
			break;
		}
		
		String entscheidung = sc.next();
		if (spielkapital<=0||entscheidung.equals("Nein")||entscheidung.equals("nein"))
			break;
		
		} while (true);
		sc.close();
		
	}
}

