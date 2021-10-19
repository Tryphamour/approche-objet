package listes;

public class Ville {

	private String nom;
	private int nbHabitants;
	private Continent continent;

	/**
	 * @param nom
	 * @param nbHabitants
	 * @param continent
	 */
	public Ville(String nom, int nbHabitants, Continent continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + " " + nbHabitants + " " + continent.getLibelle();
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	/**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
}