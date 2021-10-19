package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	/**
	 * @param libelle
	 * @param ordre
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/**
	 * @param libelle
	 * @return {@link Saison}
	 */
	public static Saison valueByLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}

	/**
	 * @param ordre the ordre to set
	 */
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
}