package P1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierFichierBinaire {

	public static void main(String[] args) {
		 // Chemins des fichiers source et destination
        String fichierSource = "source.dat";
        String fichierDestination = "copie.dat";
        
        // Utilisation de FileInputStream pour lire et FileOutputStream pour �crire
        try (FileInputStream fis = new FileInputStream(fichierSource);
             FileOutputStream fos = new FileOutputStream(fichierDestination)) {

            int octet;
            // Lecture et �criture des octets un par un
            while ((octet = fis.read()) != -1) {
                fos.write(octet);
            }
            // Confirmation de la copie
            System.out.println("Copie termin�e avec succ�s.");
        } catch (IOException e) {
            // Gestion des erreurs
            System.err.println("Erreur lors de la copie du fichier : " + e.getMessage());
        }

	}

}
