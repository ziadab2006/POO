package stock;

public class ProduitAlimentaire implements Produit {
		private double prixUnitaire;
		private int quantite;
		private String dateExpiration;
		
		
		public ProduitAlimentaire(double prixUnitaire, int quantite, String dateExpiration){
			this.prixUnitaire= prixUnitaire;
			this.quantite= quantite;
			this.dateExpiration= dateExpiration;
		}
	
		public double calculerValeurStock(){
			return prixUnitaire*quantite;
		}
		public String getDateExpiration() {
			return dateExpiration;
		}
		public double getPrixUnitaire() {
			return prixUnitaire;
		}
		public int getQuantite() {
			return quantite;
		}
}
