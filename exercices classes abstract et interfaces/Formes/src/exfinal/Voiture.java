package exfinal;

public class Voiture extends Vehicule implements Roulant {
	 public Voiture(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("La voiture " + super.nom + " d�marre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("La voiture " + super.nom + " s'arr�te.");
	    }

	    
	    public void rouler() {
	        System.out.println("La voiture " + super.nom + " roule.");
	    }
	    public String getNom(){
	    	return nom;
	    }
	    public String getTypeCarburant(){
	    	return typeCarburant;
	    }
}
