import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MorraCinese {
	
	ArrayList <String> gioco = new ArrayList <String>();
	Random ai = new Random();
	Scanner tastiera = new Scanner (System.in);
	
	public void gioco () {
		
		gioco.add("Carta");
		gioco.add("Forbice");
		gioco.add("Sasso");
		
		System.out.println("Benvenuto a Morra Cinese!");
		
		while (true) {
		System.out.println("Seleziona cosa vuoi fare");
		System.out.println("1- Avvia il gioco");
		System.out.println("2- Credits");
		System.out.println("3- Esci");
		
		String scelta = tastiera.nextLine();
		
		
		
		switch (scelta) {
		
		case "1":

		
		System.out.println("Scrivi Carta, Forbice, Sasso e prova a battere il computer!");
		scelta = tastiera.nextLine();
		
		while (!scelta.equalsIgnoreCase("Carta") && !scelta.equalsIgnoreCase("Forbice") && !scelta.equalsIgnoreCase("Sasso")) {
			System.out.println("Arma non valida! Ritenta");
			scelta = tastiera.nextLine();
		}
			
		
		int computer = ai.nextInt(gioco.size());
		String pc = gioco.get(computer);
		
		System.out.println("Risposta del computer: " + pc);
		
		if (scelta.equalsIgnoreCase(pc)) {
			System.out.println("Pareggio!");
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				System.out.println("Chiudo il gioco...");
				System.exit(0);
			}
		}
		
		else if (scelta.equalsIgnoreCase("Carta") && pc.equalsIgnoreCase("Sasso") || scelta.equalsIgnoreCase("Forbice") && pc.equalsIgnoreCase("Carta") || scelta.equalsIgnoreCase("Sasso") && pc.equalsIgnoreCase("Forbice")) {
			System.out.println("Hai vinto!");
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				System.out.println("Chiudo il gioco...");
				System.exit(0);
			}
		}
		
		else {
			System.out.println("Ha vinto il computer!");
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				System.out.println("Chiudo il gioco...");
				System.exit(0);
			}
		}
		
		

		case "2":
			System.out.println("Chinese Morra v0.01a - Developed by Simone Mallia. Thanks for using my application :)");
			continue;
		
		case "3":
			System.out.println("Chiudo il programma...");
			System.exit(0);
			
		default:
			System.out.println("Input non valido. Ritenta");
			continue;
	}
	}
	}

}
