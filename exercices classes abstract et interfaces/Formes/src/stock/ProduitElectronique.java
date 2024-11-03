package stock;

public class ProduitElectronique implements Produit {
	private double prixUnitaire;
    private int quantite;
    private int garantie; 

    
    public ProduitElectronique(double prixUnitaire, int quantite, int garantie) {
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.garantie = garantie;
    }

    
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }


    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getGarantie() {
        return garantie;
    }
}
