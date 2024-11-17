package P1;
import java.io.FileInputStream;
import java.io.IOException;
public class LectureFichierBinaire {

	public static void main(String[] args) {
		        // Chemin du fichier binaire à lire
		        String cheminFichier = "fichier_binaire.dat";
		        
		        // FileInputStream pour lire le fichier
		        try (FileInputStream fis = new FileInputStream(cheminFichier)) {
		            int octet;
		            // Lecture des octets un par un jusqu'à la fin du fichier (-1)
		            while ((octet = fis.read()) != -1) {
		                // Afficher de chaque octet sous forme décimale
		                System.out.print(octet + " ");
		            }
		        } catch (IOException e) {
		            // Gestion des erreurs en cas d'exception
		            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		        }
		    }
		}

