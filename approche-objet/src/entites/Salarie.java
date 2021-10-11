package entites;

import java.util.Arrays;

import fr.diginamic.chaines.ManipulationChaine;

public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	public static void main(String[] args) throws Exception {
		Salarie testSalarie = new Salarie("Durand".toUpperCase(), "Marcel", 2_523.5);
		System.out.println((testSalarie));
	}
}