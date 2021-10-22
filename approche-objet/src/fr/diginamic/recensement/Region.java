package fr.diginamic.recensement;

/**
 * Classe référence d'une région
 * 
 * @author Felix
 *
 */
public class Region {

	/** Code postal de la région */
	private int codeRegion;
	/** Nom de la région */
	private String nomRegion;

	/**
	 * @param codeRegion
	 * @param nomRegion
	 */
	public Region(int codeRegion, String nomRegion) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
	}
	
	/**
	 *Redfines toString method
	 */
	@Override
	public String toString() {
		return codeRegion + ", nomRegion= " + nomRegion;
	}

	/**
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
}