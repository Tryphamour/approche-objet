package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> pays = new HashSet<>();

		pays.add(new Pays("USA", 329_500_000, 63_543.58)); // PIB en USD
		pays.add(new Pays("France", 67_390_000, 38_625.07));
		pays.add(new Pays("Allemagne", 83_240_000, 45_723.64));
		pays.add(new Pays("UK", 67_220_000, 40_284.64));
		pays.add(new Pays("Italie", 59_550_000, 31_676.20));
		pays.add(new Pays("Japon", 125_800_000, 40_113.06));
		pays.add(new Pays("Chine", 1_402_000_000, 10_500.40));
		pays.add(new Pays("Russie", 144_100_000, 10_126.72));
		pays.add(new Pays("Inde", 1_380_000_000, 1_900.71));

		Pays paysPibMaxParHabitant = new Pays(null, Integer.MAX_VALUE, Double.MAX_VALUE);

		for (Pays pays1 : pays) {
			if (paysPibMaxParHabitant.getNom() == null
					|| paysPibMaxParHabitant.getPibParHabitant() < pays1.getPibParHabitant()) {
				paysPibMaxParHabitant.setNom(pays1.getNom());
				paysPibMaxParHabitant.setNbHabitants(pays1.getNbHabitants());
				paysPibMaxParHabitant.setPibParHabitant(pays1.getPibParHabitant());
			}
		}
		System.out.println("Le pays ayant le PIB par habitant le plus important est : \n" + paysPibMaxParHabitant);

		Pays paysPibMaxTotal = new Pays(null, Integer.MAX_VALUE, Double.MAX_VALUE);

		for (Pays pays2 : pays) {
			if (paysPibMaxTotal.getNom() == null || paysPibMaxTotal.pibTotal() < pays2.pibTotal()) {
				paysPibMaxTotal = pays2;
			}
		}
		System.out.println("Le pays ayant le PIB total le plus important est : \n" + paysPibMaxTotal);

		Pays paysPibMinTotal = new Pays(null, Integer.MAX_VALUE, Double.MAX_VALUE);

		for (Pays pays3 : pays) {
			if (paysPibMinTotal.getNom() == null || paysPibMinTotal.pibTotal() > pays3.pibTotal()) {
				paysPibMinTotal = pays3;
			}
		}
		System.out.println("Le pays ayant le PIB total le moins important est : \n" + paysPibMinTotal);
		pays.remove(paysPibMinTotal);
		System.out.println("Tableau sans le pays ayant le PIB total le moins important : \n" + pays);

	}
}