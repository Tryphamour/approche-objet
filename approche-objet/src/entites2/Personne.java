package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public void main(String[] args) {
		System.out.println(prenom + " " + nom.toUpperCase());
	}

	public void setNom(String nvNom) {
		this.nom = nvNom;
	}

	public void setPrenom(String nvPrenom) {
		this.prenom = nvPrenom;
	}
	
	public void setAdresse(AdressePostale nvAdresse) {
		this.adresse = nvAdresse;
	}

	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdresse() {
		return this.adresse;
	}
}
