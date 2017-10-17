import java.util.Arrays;

public class MaClasse {

	public static void main(String[] args) {
		String tab[] = {"tu as "," ans"};
		int age = 18;
		
		// affichage brut
		System.out.println(tab[0] + age + tab[1]);
		
		// avec boucle for
		for	(int i = 0; i < tab.length; i++) {
			if	(tab[i]  == tab[tab.length-1]) {
				System.out.print(age + tab[i]);
			} else {
				System.out.print(tab[i]);
			}
		}
		System.out.print("\n");
		
		//avec boucle foreach
		for	(String str : tab) {
			if (str.equals(tab[tab.length-1])) {
				System.out.print(age + str);
			} else {
				System.out.print(str);
			}
		}
	}

}
