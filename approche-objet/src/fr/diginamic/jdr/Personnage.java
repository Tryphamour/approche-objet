package fr.diginamic.jdr;

public class Personnage {

	private int force;
	private int pointVie;
	private int score;

	public Personnage(int force, int pointVie, int score) {
		this.force = 12 + (int) (Math.random() * (18 - 12) + 1);
		this.pointVie = 20 + (int) (Math.random() * (50 - 20) + 1);
		this.score = 0;
	}

}