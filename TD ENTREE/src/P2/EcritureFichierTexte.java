package P2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EcritureFichierTexte {

	public static void main(String[] args) {
		 // Chemin du fichier texte de sortie
        String cheminFichier = "sortie.txt";
        String contenu = "Ceci est un exemple de texte �crit dans un fichier.";

        // Utilisation de BufferedWriter pour �crire dans le fichier
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(cheminFichier))) {
            // �criture du contenu dans le fichier
            bw.write(contenu);
            System.out.println("�criture termin�e avec succ�s.");
        } catch (IOException e) {
            // Gestion des erreurs
            System.err.println("Erreur lors de l'�criture dans le fichier : " + e.getMessage());
        }
	}

}
