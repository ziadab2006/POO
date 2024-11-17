package P2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureTexte {

	public static void main(String[] args) {
		// Chemin du fichier texte à lire
        String cheminFichier = "livres.txt";
        
        // Utilisation de BufferedReader pour lire le fichier ligne par ligne
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            // Lecture de chaque ligne du fichier jusqu'à la fin (null)
            while ((ligne = br.readLine()) != null) {
                // Affichage de la ligne
                System.out.println(ligne);
            }
        } catch (IOException e) {
            // Gestion des erreurs en cas d'exception
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

	}

}
