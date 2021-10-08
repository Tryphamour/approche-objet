package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRem;

	public CompteTaux(int numeroCompte, double soldeCompte, double tauxRem) {
		super(numeroCompte, soldeCompte);
		this.tauxRem = tauxRem;
	}

	public String toString() {
		return super.toString() + ", Taux de rémunération : " + this.tauxRem + ".";
	}

	public double getTauxRem() {
		return tauxRem;
	}

	public void setTauxRem(double tauxRem) {
		this.tauxRem = tauxRem;
	}
}