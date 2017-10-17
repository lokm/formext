import java.util.Arrays;

public class MaClasse {

	public static void main(String[] args) {
		String x = "Bonjour";
		String y = "à tous";
		String tab[] = {x," ",y};
		
		// Affiche structure du tableau
		String structTab = Arrays.toString(tab);
		System.out.println(structTab);
		
		// Parcours le tableau avec un for
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);			
		}
		
		System.out.print("\n");
		
		// Parcours le tableau avec un foreach
		for (String j : tab) {
			System.out.print(j);
		}
		
	}

}
