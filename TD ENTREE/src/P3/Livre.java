package P3;

import java.io.Serializable;

//La classe Livre doit impl�menter Serializable pour permettre la s�rialisation
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

 // M�thodes getter pour acc�der aux attributs
 public String getTitre() {
     return titre;
 }

 public String getAuteur() {
     return auteur;
 }

 public int getAnneePublication() {
     return anneePublication;
 }

 // M�thode toString pour afficher les informations d'un livre
 @Override
 public String toString() {
     return "Livre [Titre=" + titre + ", Auteur=" + auteur + ", Ann�e=" + anneePublication + "]";
 }
}
