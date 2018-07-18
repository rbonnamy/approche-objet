package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p = new Personne();
		p.nom = "Dupont";
		p.prenom = "Marie";
		
		p.adresse = new AdressePostale();
		p.adresse.numeroRue = 5;
		p.adresse.libelleRue = "place de la Gare";
		p.adresse.codePostal = 44000;
		p.adresse.ville = "Nantes";
		

	}

}
