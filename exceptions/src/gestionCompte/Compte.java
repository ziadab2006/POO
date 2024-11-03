package gestionCompte;

public class Compte {
	 private double solde;

	    public Compte(double soldeInitial) {
	        this.solde = soldeInitial;
	    }

	    public double getSolde() {
	        return solde;
	    }

	    public void deposer(double montant) {
	        if (montant > 0) {
	            solde += montant;
	            System.out.println("Déposé : " + montant);
	        }
	    }

	    public void retirer(double montant) throws SoldeInsuffisantException {
	        if (montant > solde) {
	            throw new SoldeInsuffisantException("Erreur : Solde insuffisant !");
	        }
	        solde -= montant;
	        System.out.println("Retiré : " + montant);
	    }
}
