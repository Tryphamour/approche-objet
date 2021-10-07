package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 1;
		adr1.libelleRue = "Rue Léon Bourgeois";
		adr1.codePostal = 51000;
		adr1.ville = "Châlons en Champagne";

		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 5;
		adr2.libelleRue = "Rue Victor Duruy";
		adr2.codePostal = 51100;
		adr2.ville = "Reims";
	}
}