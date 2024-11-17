package P3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        // Cr�ation d'une liste de livres
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre("1984", "George Orwell", 1949));
        livres.add(new Livre("Le Petit Prince", "Antoine de Saint-Exup�ry", 1943));
        livres.add(new Livre("L'�tranger", "Albert Camus", 1942));

        // Chemin du fichier binaire pour sauvegarder la liste
        String cheminFichier = "bibliotheque.ser";

        // S�rialisation de la liste dans un fichier
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cheminFichier))) {
            oos.writeObject(livres);
            System.out.println("La liste des livres a �t� s�rialis�e avec succ�s.");
        } catch (IOException e) {
            // Gestion des erreurs
            System.err.println("Erreur lors de la s�rialisation : " + e.getMessage());
        }
    }
}

