package unchecked;

public class DivisionParZero {

	public static void main(String[] args) {		      
		        int numerateur = 10;
		        int diviseur = 0;

		        try {
		           
		            int resultat = numerateur / diviseur;
		            System.out.println("R�sultat: " + resultat);
		        } catch (ArithmeticException e) {
		           
		            System.out.println("Erreur : Division par z�ro !");
		        } finally {
		            
		            System.out.println("Bloc finally ex�cut�. Le programme s�est termin�.");
		        }
	}

}
