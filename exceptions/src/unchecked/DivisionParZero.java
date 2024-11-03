package unchecked;

public class DivisionParZero {

	public static void main(String[] args) {		      
		        int numerateur = 10;
		        int diviseur = 0;

		        try {
		           
		            int resultat = numerateur / diviseur;
		            System.out.println("Résultat: " + resultat);
		        } catch (ArithmeticException e) {
		           
		            System.out.println("Erreur : Division par zéro !");
		        } finally {
		            
		            System.out.println("Bloc finally exécuté. Le programme s’est terminé.");
		        }
	}

}
