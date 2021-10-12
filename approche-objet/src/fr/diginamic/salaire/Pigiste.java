package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private double joursTravailles;
	private double remJournaliere;

	public Pigiste(String nom, String prenom, int joursTravailles, double remJournaliere) {
		super(nom, prenom);
		this.joursTravailles = joursTravailles;
		this.remJournaliere = remJournaliere;
	}

	public double getJoursTravailles() {
		return joursTravailles;
	}

	public void setJoursTravailles(double joursTravailles) {
		this.joursTravailles = joursTravailles;
	}

	public double getRemJournaliere() {
		return remJournaliere;
	}

	public void setRemJournaliere(double remJournaliere) {
		this.remJournaliere = remJournaliere;
	}

	public double getSalaire() {
		return joursTravailles * remJournaliere;
	}

	public String afficherDonnees() {
		return super.afficherDonnees() + "Nombre de jours travailles : " + joursTravailles
				+ "\nRémunération journalière : " + remJournaliere + " €";
	}
}