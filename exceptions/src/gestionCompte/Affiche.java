package gestionCompte;

public class Affiche {

	public static void main(String[] args) {
		  Compte compte = new Compte(500); // Cr�er un compte avec un solde initial de 500

	        try {
	            System.out.println("Solde actuel : " + compte.getSolde());
	            compte.retirer(600); // Tentative de retirer 600, ce qui d�passe le solde
	        } catch (SoldeInsuffisantException e) {
	            System.out.println(e.getMessage()); // Affiche "Erreur : Solde insuffisant !"
	        }

	        System.out.println("Solde final : " + compte.getSolde());
	}

}
