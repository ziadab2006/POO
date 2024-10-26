package src;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

        public CompteEpargne(String numeroCompte, String titulaire, double tauxInteret) {
        super(numeroCompte, titulaire);
        this.tauxInteret = tauxInteret;
    }

  
    public void calculerInteret() {
        double interet = getSolde() * tauxInteret;
        deposer(interet);
        System.out.println("Int�r�ts de " + interet + " appliqu�s au compte �pargne.");
    }
}
