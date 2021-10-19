package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison.getLibelle());
		}
		
		System.out.println("------------------------");
		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison);
		
		System.out.println("------------------------");
		String libelle = "Hiver";
		saison = Saison.valueByLibelle(libelle);
		System.out.println(saison);
	}
}