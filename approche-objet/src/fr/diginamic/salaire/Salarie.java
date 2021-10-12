package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private String contrat;
	private double salaire;

	public Salarie(String nom, String prenom, String contrat, double salaire) {
		super(nom, prenom);
		this.contrat = contrat;
		this.salaire = salaire;
	}

	public String getContrat() {
		return contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public String afficherDonnees() {
		return super.afficherDonnees() + "Type de contrat : " + contrat + "\nSalaire : " + salaire + " €";
	}
}