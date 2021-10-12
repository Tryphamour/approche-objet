package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double perimetre() {
		return rayon * 2 * Math.PI;
	}

	public double surface() {
		return Math.PI * (rayon * rayon);
	}
	
	public String toString() {
		return "Le rayon est de : " + rayon + " cm." + " Le périmètre est de : " + perimetre() + " cm." + " La surface est de : " + surface() + " cm.²";
	}
}