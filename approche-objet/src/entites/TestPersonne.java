package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(1, "Rue Léon Bourgeois", 51000, "Châlons en Champagne");
		AdressePostale adr2 = new AdressePostale(5, "Rue Victor Duruy", 51100, "Reims");

		Personne prsn1 = new Personne("Gaillard", "Félix", adr1);
		prsn1.setNom("Guenat");
		prsn1.setPrenom("Julien");

		Personne prsn2 = new Personne("John", "Doe", adr2);
		prsn2.setAdresse(adr2);
	}
}