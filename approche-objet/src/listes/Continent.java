package listes;

public enum Continent {

	EUROPE("Europe"), ASIE("Asie"), AFRIQUE("Afrique"), OCEANIE("Océanie"), AMERIQUE("Amérique");

	private String libelle;

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
}