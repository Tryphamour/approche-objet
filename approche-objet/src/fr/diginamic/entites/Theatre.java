package fr.diginamic.entites;

public class Theatre {
	
	private String name;
	private int maxCapacite;
	private int clientInscrit;
	private double totalRecette;
	
	public Theatre(String name, int maxCapacite) {
		super();
		this.name = name;
		this.maxCapacite = maxCapacite;
	}

	public void inscrire(int nombreClient, double prix) throws Exception {
		if (maxCapacite >= nombreClient + clientInscrit) {
			this.clientInscrit = nombreClient + clientInscrit;
			this.totalRecette = nombreClient * prix + totalRecette;
		} else {
			throw new Exception("La capcité max a été atteinte");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxCapacite() {
		return maxCapacite;
	}

	public void setMaxCapacite(int maxCapacite) {
		this.maxCapacite = maxCapacite;
	}

	public int getClientInscrit() {
		return clientInscrit;
	}

	public double getTotalRecette() {
		return totalRecette;
	}
}
