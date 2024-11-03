package exfinal;

public class Bateau extends Vehicule implements Flottant {
	 public Bateau(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("Le bateau " + super.nom + " démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("Le bateau " + super.nom + " s'arrête.");
	    }

	   
	    public void flotter() {
	        System.out.println("Le bateau " + super.nom + " flotte.");
	    }
}
