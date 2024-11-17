package P3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserialisationBibliotheque {
    public static void main(String[] args) {
        // Chemin du fichier binaire contenant la liste sérialisée
        String cheminFichier = "bibliotheque.ser";

        // Désérialisation de la liste
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cheminFichier))) {
            // Lecture de l'objet (casté en List<Livre>)
            List<Livre> livres = (List<Livre>) ois.readObject();
            
            // Affichage des livres désérialisés
            System.out.println("Liste des livres désérialisée :");
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        } catch (IOException | ClassNotFoundException e) {
            // Gestion des erreurs
            System.err.println("Erreur lors de la désérialisation : " + e.getMessage());
        }
    }
}
