package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int etage;

	public Piece(double superficie, int etage) {
		if (etage < 0 || superficie <= 0)
			System.err.println("Erreur, étage ou supérficie invalide");
		else {
			this.superficie = superficie;
			this.etage = etage;
		}
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	public abstract String getType();
}