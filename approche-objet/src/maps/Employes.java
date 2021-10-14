package maps;

public class Employes {

	private String name;
	private double salaire;

	/**
	 * @param name
	 * @param salaire
	 */
	public Employes(String name, double salaire) {
		super();
		this.name = name;
		this.salaire = salaire;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}