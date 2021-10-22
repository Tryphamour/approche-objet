package fr.diginamic.recensement;

/**
 * Classe référence d'un département
 * 
 * @author Felix
 *
 */
public class Departement {

	/** Code postal du département */
	private String codeDepart;
	/** Region du département */
	private Region region;

	/**
	 * @param codeDepart
	 * @param region
	 */
	public Departement(String codeDepart, Region region) {
		this.codeDepart = codeDepart;
		this.region = region;
	}

	/**
	 * @return the codeDepart
	 */
	public String getCodeDepart() {
		return codeDepart;
	}

	/**
	 * @param codeDepart the codeDepart to set
	 */
	public void setCodeDepart(String codeDepart) {
		this.codeDepart = codeDepart;
	}

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 *Redefine toString method
	 */
	@Override
	public String toString() {
		return codeDepart + ", region= " + region.toString();
	}
}