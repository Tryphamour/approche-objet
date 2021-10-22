package fr.diginamic.recensement;

/**
 * Classe référence d'une ville
 * 
 * @author Felix
 *
 */
public class Ville {

	/** Code postal de la ville */
	private int codeVille;
	/** Nom de la ville */
	private String nomVille;
	/** Population de la ville */
	private int pop;
	/** Département de la ville */
	private Departement dep;

	/**
	 * @param codeVille
	 * @param nomVille
	 * @param pop
	 * @param dep
	 */
	public Ville(int codeVille, String nomVille, int pop, Departement dep) {
		this.codeVille = codeVille;
		this.nomVille = nomVille;
		this.pop = pop;
		this.dep = dep;
	}

	/**
	 * @return the codeVille
	 */
	public int getCodeVille() {
		return codeVille;
	}

	/**
	 * @param codeVille the codeVille to set
	 */
	public void setCodeVille(int codeVille) {
		this.codeVille = codeVille;
	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @return the pop
	 */
	public int getPop() {
		return pop;
	}

	/**
	 * @param pop the pop to set
	 */
	public void setPop(int pop) {
		this.pop = pop;
	}

	/**
	 * @return the dep
	 */
	public Departement getDep() {
		return dep;
	}

	/**
	 * @param dep the dep to set
	 */
	public void setDep(Departement dep) {
		this.dep = dep;
	}

	/**
	 * Redefines toString method
	 */
	@Override
	public String toString() {
		return codeVille + ", nom= " + nomVille + ", population= " + pop + ", dep= " + dep.toString();
	}
}