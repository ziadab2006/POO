package P3;

import java.io.Serializable;

//La classe Livre doit implémenter Serializable pour permettre la sérialisation
public class Livre implements Serializable {
 // Attributs de la classe
 private String titre;
 private String auteur;
 private int anneePublication;

 // Constructeur pour initialiser les attributs
 public Livre(String titre, String auteur, int anneePublication) {
     this.titre = titre;
     this.auteur = auteur;
     this.anneePublication = anneePublication;
 }

 // Méthodes getter pour accéder aux attributs
 public String getTitre() {
     return titre;
 }

 public String getAuteur() {
     return auteur;
 }

 public int getAnneePublication() {
     return anneePublication;
 }

 // Méthode toString pour afficher les informations d'un livre
 @Override
 public String toString() {
     return "Livre [Titre=" + titre + ", Auteur=" + auteur + ", Année=" + anneePublication + "]";
 }
}
