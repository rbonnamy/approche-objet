package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		String a = "Coucou";
		
		System.out.println(a);
		
		AdressePostale b = new AdressePostale();
		b.numeroRue = 5;
		b.libelleRue = "rue du Marché";
		b.codePostal = 14500;
		b.ville = "Vire";
		
		

	}

}
