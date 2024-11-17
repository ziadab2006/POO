package P3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserialisationBibliotheque {
    public static void main(String[] args) {
        // Chemin du fichier binaire contenant la liste s�rialis�e
        String cheminFichier = "bibliotheque.ser";

        // D�s�rialisation de la liste
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cheminFichier))) {
            // Lecture de l'objet (cast� en List<Livre>)
            List<Livre> livres = (List<Livre>) ois.readObject();
            
            // Affichage des livres d�s�rialis�s
            System.out.println("Liste des livres d�s�rialis�e :");
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        } catch (IOException | ClassNotFoundException e) {
            // Gestion des erreurs
            System.err.println("Erreur lors de la d�s�rialisation : " + e.getMessage());
        }
    }
}
