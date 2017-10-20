import java.util.Scanner; 

public class MaClasse {
	public static void main(String[] args) {
		
		// Tableau dateBuilder � 2 dimensions avec moi et jour.
		String dateBuilder[][] = {{"janvier","f�vrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","d�cembre"},{"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"}};
		
		//r�cup�ration du jour de l'ann�e utilisateur
		System.out.println("Veuillez rentrer le jour dans l'ann�e :");
		Scanner sc = new Scanner(System.in);
		int jour = sc.nextInt();
		sc.close();
		
		// affichage du moi du jour de l'ann�e avec 30 jour par moi
		int indiceMoi = Math.round(jour / 30);
		String moi = dateBuilder[0][indiceMoi];
		System.out.println("Votre jour est dans le moi de " + moi);
		
		// affichage du moi du jour de l'ann�e normal
		int month = 0;
		if (jour <= 31*1) { System.out.println("Votre jour est dans le moi de " +dateBuilder[0][0]); } //janvier
		else if (jour <= (31*1 + 30*1 - 1)) { month = 1; } //fevrier
		else if (jour <= (31*2 + 30*1 - 1)) { month = 2; } //mars
		else if (jour <= (31*2 + 30*2 - 1)) { month = 3; } //avril
		else if (jour <= (31*3 + 30*2 - 1)) { month = 4; } //mai
		else if (jour <= (31*3 + 30*3 - 1)) { month = 5; } //juin
		else if (jour <= (31*4 + 30*3 - 1)) { month = 6; } //juilet
		else if (jour <= (31*5 + 30*3 - 1)) { month = 7; } //aout
		else if (jour <= (31*5 + 30*4 - 1)) { month = 8; } //septembre
		else if (jour <= (31*6 + 30*4 - 1)) { month = 9; } //octobre
		else if (jour <= (31*6 + 30*5 - 1)) { month = 10; } //novembre
		else if (jour <= (31*7 + 30*5 - 1)) { month = 11; } //decembre
		System.out.println("Votre jour est dans le moi de " +dateBuilder[0][month]);
		
		// affichage du moi du jour d'ann�e avec une boucle for
		int j = 1;
		if (jour <= 31*1) { 
			System.out.println("Votre jour est dans le moi de " +dateBuilder[0][0]); 
		} else {
			for	(int i = 1; i < 8; i++) {
				if	(jour <= (31*i + 30*j - 1)) {
					System.out.println("Votre jour est dans le moi de " +dateBuilder[0][i+j-1]);
					break;
					} else if (((i < 4) && (i - j == 1)) || ((i > 4) && (i - j == 2))) {
						j++;
						i--;
					} 
			}
		}
	
	//
	}
		
}
