import java.util.Scanner; 

public class MaClasse {
	public static void main(String[] args) {
		
		// Demande age utilisateur
		System.out.println("Veuillez saisir votre age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		// Affiche majeur ou mineur selon age
		String result = (age > 17)? "Vous �tes majeur.":"vous �tes mineur.";
		System.out.println(result);
	}

}
