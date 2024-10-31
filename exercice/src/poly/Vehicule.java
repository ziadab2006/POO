package poly;


class Vehicule {
 public void seDeplacer() {
     System.out.println("Le v�hicule se d�place.");
 }
}

class Voiture extends Vehicule {
 @Override
 public void seDeplacer() {
     System.out.println("La voiture roule sur la route.");
 }
}

class Velo extends Vehicule {
 @Override
 public void seDeplacer() {
     System.out.println("Le v�lo est p�dal� sur la piste cyclable.");
 }
}
