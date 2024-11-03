package stock;

public class Affiche {

	public static void main(String[] args) {
		 Produit produitAlimentaire = new ProduitAlimentaire(10.0, 50, "2025-12-31");
	        
	        
	        Produit produitElectronique = new ProduitElectronique(250.0, 20, 2);

	      
	        System.out.println("Valeur du stock de produit alimentaire : " + produitAlimentaire.calculerValeurStock());
	        System.out.println("Valeur du stock de produit électronique : " + produitElectronique.calculerValeurStock());
	    }

	}


