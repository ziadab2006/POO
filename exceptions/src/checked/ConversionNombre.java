package checked;

public class ConversionNombre {

	public static void main(String[] args) {
		if (args.length > 0) {
            String saisie = args[0]; // Prend le premier argument de la ligne de commande
            convertirEnEntier(saisie);
        } else {
            System.out.println("Erreur : Aucun argument fourni.");
        }
    }

    public static void convertirEnEntier(String nombre) {
        try {
            int resultat = Integer.parseInt(nombre);
            System.out.println("La conversion a réussi. Le nombre est : " + resultat);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : La saisie '" + nombre + "' n’est pas un nombre valide.");
        } finally {
            System.out.println("Bloc finally : Conversion terminée.");
        }

	}

}
