package P3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        // Création d'une liste de livres
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre("1984", "George Orwell", 1949));
        livres.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        livres.add(new Livre("L'Étranger", "Albert Camus", 1942));

        // Chemin du fichier binaire pour sauvegarder la liste
        String cheminFichier = "bibliotheque.ser";

        // Sérialisation de la liste dans un fichier
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cheminFichier))) {
            oos.writeObject(livres);
            System.out.println("La liste des livres a été sérialisée avec succès.");
        } catch (IOException e) {
            // Gestion des erreurs
            System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
        }
    }
}

