package tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));

		Collections.sort(villes, new ComparatorNom());
		System.out.println(villes);
		System.out.println("---------------------------------");
		Collections.sort(villes, new ComparatorHabitant());
		System.out.println(villes);
	}
}