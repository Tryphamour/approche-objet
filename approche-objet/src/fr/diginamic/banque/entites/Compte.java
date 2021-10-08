package fr.diginamic.banque.entites;

/**
 * @author F�lix Gaillard
 *
 */

public class Compte {
	private int numeroCompte;
	private double soldeCompte;

	/**
	 * Constructeur
	 * 
	 * @param numeroCompte num�ro de compte
	 * @param soldeCompte  solde du compte
	 */
	public Compte(int numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String toString() {
		return "Num�ro de compte : " + numeroCompte + ", Solde du compte : " + soldeCompte + ".";
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}