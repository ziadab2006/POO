package exfinal;

public class Affiche {

	public static void main(String[] args) {
		 Vehicule[] vehicules = new Vehicule[3];
	        vehicules[0] = new Voiture("Voiture Sport", "Essence");
	        vehicules[1] = new Bateau("Bateau de Croisière", "Diesel");
	        vehicules[2] = new Hydravion("Hydravion de Tourisme", "Essence");

	        
	        for (Vehicule vehicule : vehicules) {
	            vehicule.afficherInfos();
	            vehicule.demarrer();
	            vehicule.arreter();
	            System.out.println();
	        }

	        
	        for (Vehicule vehicule : vehicules) {
	            if (vehicule instanceof Roulant) {
	                ((Roulant) vehicule).rouler();
	            }
	            if (vehicule instanceof Flottant) {
	                ((Flottant) vehicule).flotter();
	            }
	            System.out.println();
	        }
	}

}
