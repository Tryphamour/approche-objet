package listes;

import java.util.ArrayList;

public class TestVille {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();

//		villes.add(new Ville("Nice", 343_000));
//		villes.add(new Ville("Carcassonne", 47_800));
//		villes.add(new Ville("Narbonne", 53_400));
//		villes.add(new Ville("Lyon", 484_000));
//		villes.add(new Ville("Foix", 9_700));
//		villes.add(new Ville("Pau", 77_200));
//		villes.add(new Ville("Marseille", 850_700));
//		villes.add(new Ville("Tarbes", 40_600));
		
		Ville villeMax = villes.get(0);
		
		for (Ville ville : villes) {
			if (ville.getNbHabitants() > villeMax.getNbHabitants()) {
				villeMax = ville;
			}
		}
		System.out.println("La ville la plus grande est : " + villeMax);
		
		Ville villeMin = villes.get(0);
		
		for (Ville ville : villes) {
			if (ville.getNbHabitants() < villeMin.getNbHabitants()) {
				villeMin = ville;
			}
		}
		System.out.println("La ville la plus petite est : " + villeMin);
		villes.remove(villeMin);
		
		for (Ville ville : villes) {
			System.out.println(ville);
		}
		
		for (Ville ville : villes) {
			if (ville.getNbHabitants() > 100_000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}
}