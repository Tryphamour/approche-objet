package fr.diginamic.banque.entites;

public abstract class Operation {

	String date;
	int montant;

	public Operation(String date, int montant) {
		this.date = date;
		this.montant = montant;
	}
	
	public String toString() {
		return "Date de l'op�ration : " + date + ", Montant de l'op�ration : " + montant + ".";
	}
}