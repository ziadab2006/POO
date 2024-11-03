package exfinal;

public class Hydravion extends Vehicule implements Flottant implements Roulant {
    public Hydravion(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    @Override
    public void demarrer() {
        System.out.println("L'hydravion " + getNom() + " d�marre.");
    }

    @Override
    public void arreter() {
        System.out.println("L'hydravion " + getNom() + " s'arr�te.");
    }

   
    public void rouler() {
        System.out.println("L'hydravion " + getNom() + " roule.");
    }

    
    public void flotter() {
        System.out.println("L'hydravion " + getNom() + " flotte.");
    }

    public void voler() {
        System.out.println("L'hydravion " + getNom() + " vole.");
    }
}
